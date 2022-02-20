package homeWork.h13;

public class Point3D extends Point2D{
	private float z;

	public Point3D() {
		super();
		z = 0.0f;
	}
	public Point3D(float x, float y,float z) {
		super(x,y);
		this.z = z;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(float x, float y) {
		super.setXY(x,y);
		this.z = z;
	}
	
	public float[] getXYZ() {
		float[] xyz = new float[3];
		xyz[0] = super.getX();
		xyz[1] = super.getY();
		xyz[2] = z;
		return xyz;
	}
	
	@Override
	public String toString() {
		return "Point3D ["+super.toString()+"z=" + z + "]";
	}
	
}
