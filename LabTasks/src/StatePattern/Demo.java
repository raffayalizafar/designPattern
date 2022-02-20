package StatePattern;

public class Demo {

	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStart = new TVOnState();
		State tvStop = new TVOffState();
		context.setState(tvStart);
		context.doAction();
		context.setState(tvStop);
		context.doAction();
		context.setState(tvStart);
		context.doAction();
	}

}
