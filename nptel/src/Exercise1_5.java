import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
         int sum=0;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it of integer type.
      int[] arr = new int[s];   
      int highest=0;
	 for(i=0;i<arr.length;i++) {
        	if (arr[i]>highest)
        	{
        		highest=arr[i];
        	}
	  }
	 
	 for(i=0;i<arr.length;i++) {
		 sum=sum+arr[i];
	 }
	 float average=(float)sum/5;
	 System.out.print(highest);
	 System.out.print(average);
	 
    }
}