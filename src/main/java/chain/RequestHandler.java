package chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public abstract class RequestHandler {
	private static final Logger LOGGER = LoggerFactory.getLogger(RequestHandler.class);
	private RequestHandler next;

	public RequestHandler(RequestHandler next) {
		this.next = next;
	}

	public void handleRequest(Request req) {
		Optional.ofNullable(next)
						.ifPresent(requestHandler -> requestHandler.handleRequest(req));
	}

	protected void printHandling(Request req) {
		LOGGER.info("{} handling request \"{}\"", this, req);
	}

}
