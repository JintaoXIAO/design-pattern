package frontcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorView implements View{
	private final static Logger LOGGER = LoggerFactory.getLogger(ErrorView.class);


	@Override
	public void display() {
		LOGGER.error("ERROR 500");
	}
}
