package AdapterTask;

public class PlatinumAccount extends AbstractAccount {

	public PlatinumAccount(final double balance) {
		super(balance);
		setOverdraftAvailable(true);
	}
}
