package TemplateMethodPattern;

public abstract class DataParser {
	public final void paraDataAndGenerateOutput() {
		readData();
		processData();
		writeData();
	}
	abstract void readData();
	abstract void processData();
	
	public final void writeData() {
		System.out.println("Output generate, writing to csv ");
	}
	
}
