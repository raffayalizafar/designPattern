package Visitor;

public class CEOVisitor implements IVisitor {
	public void visit(Engineer engineer) {
        System.out.println("Engineer: " + engineer.name + ", KIP:" + engineer.kpi);
    }

    public void visit(Manager manager) {
        System.out.println("Manager: " + manager.name + ",KPI:" + manager.kpi + ", the number of products:" + manager.getProducts());
    }
}
