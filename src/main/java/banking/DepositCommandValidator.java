package banking;

public class DepositCommandValidator extends CommandValidator {
	public DepositCommandValidator(Bank bank) {
		super(bank);
	}

	public boolean validateDepositCommand(String[] commandParts) {
		if (commandParts.length != 3) {
			return false;
		}
		String id = commandParts[1];
		String amount = commandParts[2];
		if (validId(id) && validAmount(amount)) {
			double depositAmount = Double.parseDouble(amount);
			String accountType = bank.getAccountType(id);
			if (bank.accountExistsByQuickID(id)) {
				if (accountType.equals("savings")) {
					return (depositAmount <= 2500);
				} else if (accountType.equals("checking")) {
					return (depositAmount <= 1000);
				} else {
					return false;
				}
			}
		}
		return false;
	}
}
