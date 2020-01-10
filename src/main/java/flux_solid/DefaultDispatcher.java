package flux_solid;

import com.google.common.eventbus.EventBus;

public enum DefaultDispatcher implements Dispatcher{
	INSTANCE;
	private EventBus eventBus;
	DefaultDispatcher(){
		this.eventBus = new EventBus();
	}

	@Override
	public void dispatch(Action<? extends Object> action) {
		this.eventBus.post(action);
	}

	@Override
	public void register(Object listener) {
		this.eventBus.register(listener);
	}
}
