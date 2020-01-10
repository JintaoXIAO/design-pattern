package flux_solid;

public class DemoAction implements Action<String>{
	private String msg;

	public DemoAction(String msg) {
		this.msg = msg;
	}

	@Override
	public String playload() {
		return msg;
	}
}
