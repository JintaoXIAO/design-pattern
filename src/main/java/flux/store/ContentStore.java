package flux.store;

import flux.action.Action;
import flux.action.ActionType;
import flux.action.Content;
import flux.action.ContentAction;

public class ContentStore extends Store{

	private Content content = Content.PRODUCTS;

	@Override
	public void onAction(Action action) {
		if (action.getType().equals(ActionType.CONTENT_CHANGED)) {
			var contentAction = (ContentAction) action;
			content = contentAction.getContent();
			notifyChange();
		}
	}

	public Content getContent() {
		return content;
	}
}
