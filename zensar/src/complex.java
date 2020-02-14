
public class complex implements Cloneable {
	int real;
	int img;
	complex(int real,int img){
		this.real=real;
		this.img=img;
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public void setImg(int img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "complex [real=" + real + ", img=" + img + "]" ;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		complex c1=new complex(111,222);
		System.out.println(c1);
		complex c2=(complex) c1.clone();
		c2.setImg(10);
		c2.setReal(20);
		System.out.println(c1);
	}
}
