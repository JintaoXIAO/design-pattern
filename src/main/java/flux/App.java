package flux;

import flux.action.MenuItem;
import flux.dispatcher.Dispatcher;
import flux.store.ContentStore;
import flux.store.MenuStore;
import flux.view.ContentView;
import flux.view.MenuView;

public class App {
	public static void main(String[] args) {
		var menuStore = new MenuStore();
		Dispatcher.getInstance().registerStore(menuStore);
		var contentStore = new ContentStore();
		Dispatcher.getInstance().registerStore(contentStore);
		var menuView = new MenuView();
		menuStore.registerView(menuView);
		var contentView = new ContentView();
		contentStore.registerView(contentView);

		menuView.render();
		contentView.render();

		menuView.itemClicked(MenuItem.COMPANY);
	}
}
