public class CreateCommandValidator extends CommandValidator {
	public boolean validateCreateCommand(String[] commandParts) {
		if (commandParts.length < 4) {
			return false;
		}

		String accountType = commandParts[1].toLowerCase();
		String Id = commandParts[2];
		String Apr = commandParts[3];

		if (validAccountType(accountType) && validId(Id) && validApr(Apr)) {
			if (accountType.equals("cd")) {
				if (commandParts.length != 5) {
					return false;
				}
				String CDInitialBalance = commandParts[4];
				return validInitalBalance(CDInitialBalance);
			} else if (commandParts.length == 4) {
				return true;
			}
		}
		return false;
	}
}
