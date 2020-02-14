
public class Car {
public void drive() {
	System.out.println("drive in car");
}
public static void main(String[] args) {
	figo f = new figo();
	f.c.drive();
 }
}

class figo{
	Car c=new Car() {
		public void drive() {
			System.out.println("drive in figo");
		}
	};
}
