package flux.store;

import flux.action.Action;
import flux.action.ActionType;
import flux.action.MenuAction;
import flux.action.MenuItem;

public class MenuStore extends Store{

	private MenuItem selected = MenuItem.HOME;

	@Override
	public void onAction(Action action) {
		if (action.getType().equals(ActionType.MENU_ITEM_SELECTED)) {
			var menuAction = (MenuAction)action;
			selected = menuAction.getMenuItem();
			notifyChange();
		}
	}

	public MenuItem getSelected() {
		return selected;
	}
}
