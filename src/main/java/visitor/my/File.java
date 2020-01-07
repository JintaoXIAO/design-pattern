package visitor.my;

import java.util.stream.Stream;

public class File extends Component{
	@Override
	public void accept(Visitor... visitors) {
		Stream.of(visitors)
						.forEach(visitor -> visitor.visit(this));

	}

	@Override
	public String toString() {
		return "this is a file";
	}
}
