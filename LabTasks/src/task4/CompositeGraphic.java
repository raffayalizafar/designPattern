package task4;
import java.util.List;
import java.util.ArrayList;

class CompositeGraphic implements Graphic {
	
	private List<Graphic> childGraphics = new ArrayList<Graphic>();
	
    public CompositeGraphic() {
    	
    }

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

	@Override
	public void draw() {
		for (Graphic graphic : childGraphics) {
            graphic.draw();
        }
		
		
	}
}