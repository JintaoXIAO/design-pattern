package chain;

public class OrcSoldier extends RequestHandler{

	public OrcSoldier(RequestHandler next) {
		super(next);
	}

	@Override
	public void handleRequest(Request req) {
		if (RequestType.COLLECT_TAX == req.getType()) {
			printHandling(req);
			req.markHandled();
		} else {
			super.handleRequest(req);
		}
	}

	@Override
	public String toString() {
		return "Orc Soldier";
	}
}
