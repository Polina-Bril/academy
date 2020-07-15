package by.academy.lesson6.newTasks.Task11;

public class Main {

	public static void main(String[] args) {
		Circle circle=new Circle("Красный", 15, 17);
		Rectangle rectangle=new Rectangle("Синий", 18, 17);
		Shape [] shape = new Shape [2];
		shape[0]=circle;
		shape[1]=rectangle;
		for (Shape p:shape) {
			p.draw();
			p.equals(circle);
			p.equals(rectangle);
			}
		
		
		

	}

}
