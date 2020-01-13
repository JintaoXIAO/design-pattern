package callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
	private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);
	public static void main(String[] args) {
		var task = new SimpleTask();
		task.executeWith(() -> LOGGER.info("I'm done now!"));
	}
}
