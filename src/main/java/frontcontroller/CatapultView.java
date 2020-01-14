package frontcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatapultView implements View{

	private final static Logger LOGGER = LoggerFactory.getLogger(CatapultView.class);

	@Override
	public void display() {
		LOGGER.info("Display catapults");
	}
}
