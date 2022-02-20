package Visitor;

public class CTOVisitor implements IVisitor {

	  public void visit(Engineer engineer) {
	        System.out.println("Engineer: " + engineer.name + ", the number of code lines:" + engineer.getCodeLines());
	    }

	    public void visit(Manager manager) {
	        System.out.println("Manager: " + manager.name + ", the number of products:" + manager.getProducts());
	    }
}
