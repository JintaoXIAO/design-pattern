package callback;

import java.util.Optional;

public interface Task {
	void execute();

	default void executeWith(Callback callback) {
		execute();
		Optional.ofNullable(callback)
						.ifPresent(Callback::call);
	}
}
