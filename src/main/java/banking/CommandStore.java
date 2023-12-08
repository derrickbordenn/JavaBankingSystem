package banking;

import java.util.ArrayList;
import java.util.List;

public class CommandStore {
	private List<String> invalidCommands;

	public CommandStore() {
		this.invalidCommands = new ArrayList<>();
	}

	public void addInvalidCommand(String command) {
		invalidCommands.add(command);
	}

	public List<String> getAllInvalidCommands() {
		return new ArrayList<>(invalidCommands);
	}
}