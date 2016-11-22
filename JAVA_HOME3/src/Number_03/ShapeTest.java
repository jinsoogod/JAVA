package Number_03;

class Shape implements Moveable{
	protected int x, y;

	public void draw() {
		System.out.println("Shape Draw");
	}
	
	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		
		System.out.println("최초 : " + x);
		System.out.println("최초 : " + y);
		
		this.x += dx;
		this.y += dy;
		
		System.out.println("변경 : " + x);
		System.out.println("변경 : " + y);
	}

}

class Rectangle extends Shape {
	private int width, height;

	public void draw() {
		System.out.println("Rectangle Draw");
	}

}

class Triangle extends Shape {
	private int base, height;


	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Circle extends Shape {
	private int radius;

	public void draw() {
		System.out.println("Circle Draw");
	}
}
public class ShapeTest{

	public static void main(String arg[]){
		Moveable[] array = new Moveable[10];
		
		for (int i = 0; i < array.length; i++) {
			
			if(i == 1 || i == 4 || i == 7){
				array[i] = new Triangle();
				System.out.println(array[i].getClass());
				array[i].move((int)((Math.random()*10)+1), (int)((Math.random()*10)+1));
			}
			else if(i == 2 || i == 5 || i == 8){
				array[i] = new Circle();
				System.out.println(array[i].getClass());
				array[i].move((int)((Math.random()*10)+1), (int)((Math.random()*10)+1));
			}
			else{
				array[i] = new Rectangle();
				System.out.println(array[i].getClass());
				array[i].move((int)((Math.random()*10)+1), (int)((Math.random()*10)+1));
			}
		}
		
	}

}