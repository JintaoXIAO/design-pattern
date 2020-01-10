package combinator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface Finder {
	List<String> find(String text);

	static Finder contains(String word) {
		return txt -> Stream.of(txt.split("\n"))
						.filter(line -> line.toLowerCase().contains(word.toLowerCase()))
						.collect(Collectors.toList());
	}

	default Finder not(Finder notFinder) {
		return txt -> {
			List<String> res = this.find(txt);
			res.removeAll(notFinder.find(txt));
			return res;
		};
	}

	default Finder or(Finder orFinder) {
		return txt -> {
			List<String> res = this.find(txt);
			res.addAll(orFinder.find(txt));
			return res;
		};
	}

	default Finder add(Finder addFinder) {
		return txt -> this
						.find(txt)
						.stream()
						.flatMap(line -> addFinder.find(line).stream())
						.collect(Collectors.toList());
	}
}
