package AdapterTask;

public interface Account {
	public double getBalance();    
    public boolean isOverdraftAvailable();    
    public void credit(final double credit);
}
