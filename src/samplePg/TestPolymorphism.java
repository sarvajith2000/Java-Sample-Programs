package samplePg;
 abstract class Shape{
	 abstract public void Draw();
	 public static void drawShape(Shape s) {
		 s.Draw();
	 }
	
}
 class Triangle extends Shape{
	 public void Draw()
	 {
		 System.out.println("triangle drawn");
	 }
	 
 }
 class Rectangle extends Shape{
	 public void Draw()
	 {
		 System.out.println("rectangle drawn");
	 }
	 
 }
public class TestPolymorphism {

	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		Shape s =t;
		s.drawShape(t);
		Rectangle r = new Rectangle();
		s.drawShape(r);
		
	}

}
