import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   sc.close();
           int result=0;
           double num=(double)n;
           int n1=n;
           double sum=0;
           int count=Integer.toString(n).length();
           while(count>0) {
        	   num=n%10;
        	   n=n/10;
        	   sum=sum+Math.pow(num,(double)3);
        	   count--;
           }
           if((int)sum==n1) {
        	   result=1;
           System.out.print(result);
           }
           else {
        	   result=0;
        	   System.out.print(result);
           }
        }
}