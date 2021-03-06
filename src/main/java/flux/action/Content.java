package flux.action;

public enum  Content {
	PRODUCTS("Products - This page lists the company's products."),
	COMPANY("Company - This page displays information about the company.");

	private String title;

	Content(String title){
		this.title = title;
	}

	@Override
	public String toString() {
		return "Content{" +
						"title='" + title + '\'' +
						'}';
	}
}
