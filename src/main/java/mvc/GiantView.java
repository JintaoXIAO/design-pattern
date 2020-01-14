package mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GiantView {
	private final static Logger LOGGER = LoggerFactory.getLogger(GiantView.class);

	public void displayGiant(GiantModel model) {
		LOGGER.info("{}", model);
	}
}
