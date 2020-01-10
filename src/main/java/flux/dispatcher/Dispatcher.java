package flux.dispatcher;

import flux.action.*;
import flux.store.Store;

import java.util.LinkedList;
import java.util.List;

public final class Dispatcher {
	private static Dispatcher instance = new Dispatcher();

	private List<Store> stores = new LinkedList<>();

	private Dispatcher() {

	}

	public static Dispatcher getInstance() {
		return instance;
	}

	public void registerStore(Store store) {
		stores.add(store);
	}

	public void menuItemSelected(MenuItem menuItem) {
		dispatchAction(new MenuAction(menuItem));
		switch (menuItem) {
			case HOME:
			case PRODUCTS:
			default:
				dispatchAction(new ContentAction(Content.PRODUCTS));
			case COMPANY: dispatchAction(new ContentAction(Content.COMPANY));
				break;
		}
	}

	private void dispatchAction(Action action) {
		stores.forEach(store -> store.onAction(action));
	}

}
