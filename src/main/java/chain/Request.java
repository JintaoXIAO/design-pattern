package chain;

public class Request {
	private final RequestType type;
	private final String requestDescription;
	private boolean handled;

	public Request(RequestType type, String requestDescription) {
		this.type = type;
		this.requestDescription = requestDescription;
	}

	public RequestType getType() {
		return type;
	}

	public void markHandled() {
		this.handled = true;
	}

	public boolean isHandled() {
		return handled;
	}

	public String getRequestDescription() {
		return requestDescription;
	}

	@Override
	public String toString() {
		return getRequestDescription();
	}

}
