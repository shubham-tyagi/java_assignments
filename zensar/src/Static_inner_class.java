
public class Static_inner_class {
	static int num1=100;

	public void methodOut() {
		
	}
	static class Inner{
		static int num2=200;
		public void methodin() {
			System.out.println("inside inner method :"+num1);
			System.out.println("inside inner method :"+num2);
		}
		
	}

	public static void main(String[] args) {
		Static_inner_class o1=new Static_inner_class();
		o1.methodOut();
		Static_inner_class.Inner in =new Static_inner_class.Inner();
		in.methodin();
	}

}
