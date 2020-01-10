package flux.view;

import flux.action.MenuItem;
import flux.dispatcher.Dispatcher;
import flux.store.MenuStore;
import flux.store.Store;

public class MenuView implements View{

	private MenuItem selected = MenuItem.HOME;

	@Override
	public void storeChanged(Store store) {
		var menuStore = (MenuStore) store;
		selected = menuStore.getSelected();
		render();
	}

	@Override
	public void render() {
		for (var item : MenuItem.values()) {
			if (selected.equals(item)) {
				System.out.printf("* %s\n", item);
			} else {
				System.out.println(item);
			}
		}
	}

	public void itemClicked(MenuItem item) {
		Dispatcher.getInstance().menuItemSelected(item);
	}
}
