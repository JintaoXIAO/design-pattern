package flux_solid;

import com.google.common.eventbus.Subscribe;

public class Client {
	@Subscribe
	public void onAction(DemoAction action) {
		System.out.println("action: " + action.playload());
	}

	public void post() {
		DefaultDispatcher.INSTANCE.register(new Client());
		DefaultDispatcher.INSTANCE.dispatch(new DemoAction("hello world"));
	}

	public static void main(String[] args) {
		Client client = new Client();
		client.post();
	}
}
