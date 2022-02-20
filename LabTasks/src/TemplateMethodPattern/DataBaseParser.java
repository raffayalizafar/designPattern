package TemplateMethodPattern;

public class DataBaseParser extends DataParser{

	@Override
	void readData() {
		System.out.println("Reading from DataBaseParser file");
		
	}

	@Override
	void processData() {
		System.out.println("Looping through loaded DataBaseParser file");
		
	}

}
