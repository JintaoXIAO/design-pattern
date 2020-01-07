package visitor.my;

public abstract class Visitor<T> {
	void visit(Object obj) {
		if (accept(obj)) {
			doVisit((T) obj);
		}
	}
	protected abstract boolean accept(Object obj);
	protected abstract void doVisit(T t);
}
