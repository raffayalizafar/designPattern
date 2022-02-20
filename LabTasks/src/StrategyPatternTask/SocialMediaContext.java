package StrategyPatternTask;

public class SocialMediaContext {
	private ISocialMediaStrategy strategy;
	public void setSocialMediaStrategy(ISocialMediaStrategy strategy) {
		this.strategy = strategy;
	}
	public void connectTo(String user) {
		strategy.connectTo(user);
	}
}
