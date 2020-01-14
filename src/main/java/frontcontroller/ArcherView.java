package frontcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArcherView implements View{

	private final static Logger LOGGER = LoggerFactory.getLogger(ArcherView.class);

	@Override
	public void display() {
		LOGGER.info("Display archers");
	}
}
