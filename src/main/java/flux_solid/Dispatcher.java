package flux_solid;

public interface Dispatcher {
	void dispatch(Action<? extends Object> action);
	void register(Object listener);
}
