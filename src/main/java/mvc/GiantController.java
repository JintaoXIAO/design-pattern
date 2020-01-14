package mvc;

public class GiantController {
	private GiantModel model;
	private GiantView view;

	public GiantController(GiantModel model, GiantView view) {
		this.model = model;
		this.view = view;
	}

	public void updateView() {
		this.view.displayGiant(this.model);
	}


	public GiantModel getModel() {
		return model;
	}

	public void setModel(GiantModel model) {
		this.model = model;
	}

	public GiantView getView() {
		return view;
	}

	public void setView(GiantView view) {
		this.view = view;
	}

}
