package StrategyPatternTask;

public class TwitterStrategy implements ISocialMediaStrategy {

	@Override
	public void connectTo(String user) {
		// TODO Auto-generated method stub
		System.out.println("Connecting with " +user+ " through Twitter");
	}
}
