package TemplateMethodPattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSVDataParser csvDataParser = new CSVDataParser();
		csvDataParser.paraDataAndGenerateOutput();
		
		System.out.println("********************");
		
		DataBaseParser dataParser = new DataBaseParser();
		dataParser.paraDataAndGenerateOutput();
		
	}

}
