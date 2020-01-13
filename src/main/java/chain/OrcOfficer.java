package chain;

public class OrcOfficer extends RequestHandler {

	public OrcOfficer(RequestHandler next) {
		super(next);
	}

	@Override
	public void handleRequest(Request req) {
		if (RequestType.TORTURE_PRISONER == req.getType()) {
			printHandling(req);
			req.markHandled();
		} else {
			super.handleRequest(req);
		}
	}
}
