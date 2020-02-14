//

public class Methodclass {


public int num1=100;

public void methodOut() {
	System.out.println("inside outer method :"+num1);
}
public void method(){
     int var=20;
	 class Inner{
	 int num2=200;
	 void methodin() {
		System.out.println("inside inner method :"+var);
	}

  }
	Inner in=new Inner();
	in.methodin();
}

public static void main(String[] args) {
	Methodclass o1=new Methodclass();
	o1.method();
  }
}

