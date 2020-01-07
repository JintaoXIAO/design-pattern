package visitor.my;

import java.util.stream.Stream;

public class Folder extends Component{
	public Folder(Component...children) {
		super(children);
	}

	@Override
	public void accept(Visitor... visitors) {
		Stream.of(visitors)
						.forEach(visitor -> visitor.visit(this));
		super.accept(visitors);
	}

	@Override
	public String toString() {
		return "this is a folder";
	}
}
