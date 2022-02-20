package StrategyPatternTask;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SocialMediaContext context = new SocialMediaContext();
		
		context.setSocialMediaStrategy(new FacebookStrategy());
		context.connectTo("Lokesh");
		System.out.println("================================");
		context.setSocialMediaStrategy(new TwitterStrategy());
		context.connectTo("Ali");
		System.out.println("================================");
		context.setSocialMediaStrategy(new GooglePlusStrategy());
		context.connectTo("Ali");
		System.out.println("================================");
		context.setSocialMediaStrategy(new OrkutStrategy());
		context.connectTo("Ali");
		System.out.println("================================");
	}

}
