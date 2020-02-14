public class outer {
public int num1=100;
Inner i=new Inner();
public void methodOut() {
	System.out.println("inside outer method :"+i.num2);
}
public class Inner{
	public int num2=200;
	public void methodin() {
		System.out.println("inside inner method :"+num1);
	}
	
}

public static void main(String[] args) {
	outer o1=new outer();
	o1.methodOut();
	outer.Inner in =o1.new Inner();
	in.methodin();
}
}
