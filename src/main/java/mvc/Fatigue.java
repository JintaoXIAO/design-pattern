package mvc;

public enum Fatigue {
	ALERT("alert"),
	TIRED("tired"),
	SLEEPING("sleeping");

	private String title;

	Fatigue(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Fatigue{" +
						"title='" + title + '\'' +
						'}';
	}
}
