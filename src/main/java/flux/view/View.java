package flux.view;

import flux.store.Store;

public interface View {
	void storeChanged(Store store);
	void render();
}
