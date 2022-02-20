package TemplateMethodPattern;

public class CSVDataParser extends DataParser{

	@Override
	void readData() {
		System.out.println("Reading from CSV file");
		
	}

	@Override
	void processData() {
		System.out.println("Looping through loaded CSV file");
		
	}
	
}
