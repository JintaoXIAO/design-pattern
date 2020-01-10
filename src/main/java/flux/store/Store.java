package flux.store;

import flux.action.Action;
import flux.view.View;

import java.util.ArrayList;
import java.util.List;

public abstract class Store {
	private List<View> views = new ArrayList<>();

	public abstract void onAction(Action action);

	public void registerView(View view) {
		views.add(view);
	}

	protected void notifyChange() {
		views.forEach(view -> view.storeChanged(this));
	}
}
