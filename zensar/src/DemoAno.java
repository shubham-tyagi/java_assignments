
interface Drivable {
	public void drive();
}
public class DemoAno{
	Drivable d=new Drivable(){
 		public void drive() {
			System.out.println("drive inside DemoAno");
		}
	};
	
	public static void main(String[] Args) {
		DemoAno a=new DemoAno();
		a.d.drive();
	}
}
