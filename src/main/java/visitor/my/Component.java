package visitor.my;

import java.util.Arrays;

public abstract class Component {
	private Component[] children;

	public Component(Component...children) {
		this.children = children;
	}

	public void accept(Visitor...visitors){
		Arrays.stream(children)
						.forEach(child -> child.accept(visitors));
	}
}
