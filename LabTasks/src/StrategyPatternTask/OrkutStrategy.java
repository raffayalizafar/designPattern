package StrategyPatternTask;

public class OrkutStrategy implements ISocialMediaStrategy {

	@Override
	public void connectTo(String user) {
		// TODO Auto-generated method stub
		System.out.println("Connecting with " +user+ " through Orkut");
	}
}
