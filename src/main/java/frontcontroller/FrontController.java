package frontcontroller;

public class FrontController {
	public void handleRequest(String request) {
		var command = getCommand(request);
		command.process();
	}

	private Command getCommand(String request) {
		var commandClass = getCommandClass(request);
		try {
			return commandClass.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	private static Class<? extends Command> getCommandClass(String request) {
		try {
			return (Class<? extends Command>) Class.forName("frontcontroller." + request + "Command");
		} catch (ClassNotFoundException e) {
			return UnknownCommand.class;
		}
	}
}
