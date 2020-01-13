package chain;

public class OrcCommander extends RequestHandler{
	public OrcCommander(RequestHandler next) {
		super(next);
	}

	@Override
	public void handleRequest(Request req) {
		if (RequestType.DEFEND_CASTLE == req.getType()) {
			printHandling(req);
			req.markHandled();
		} else {
			super.handleRequest(req);
		}
	}

	@Override
	public String toString() {
		return "Orc commander";
	}
}
