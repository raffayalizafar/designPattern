package Visitor;

public class Demo {

	public static void main(String[] args) {
		BusinessReport report = new BusinessReport();
		System.out.println("==========CEO watch report==============");
		report.showReport(new CEOVisitor());
		System.out.println("==========CTO watch report==============");
		report.showReport(new CTOVisitor());
	}

}
