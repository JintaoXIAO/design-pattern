package visitor.my;

public interface Visitor<T> {
	@SuppressWarnings("unchecked")
	default void visit(Object obj) {
		if (accept(obj)) {
			doVisit((T) obj);
		}
	}
	boolean accept(Object obj);
	void doVisit(T t);
}
