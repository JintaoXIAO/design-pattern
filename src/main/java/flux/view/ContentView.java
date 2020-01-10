package flux.view;

import flux.action.Content;
import flux.store.ContentStore;
import flux.store.Store;

public class ContentView implements View{

	private Content content = Content.PRODUCTS;

	@Override
	public void storeChanged(Store store) {
		var contentStore = (ContentStore) store;
		content = contentStore.getContent();
		render();
	}

	@Override
	public void render() {
		System.out.println(content);
	}
}
