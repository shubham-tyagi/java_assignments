import java.util.Scanner;  
public class Exercise1_1 {
       public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       s.close();
       double perimeter;
       double area;
     //Calculate the perimeter 
       if(radius<=0){
       System.out.println("please enter non zero positive number");
       }
       else{
         perimeter=Math.PI*2*radius;
         System.out.println(perimeter);
       //Calculate the area
         area=Math.PI*radius*radius;
         System.out.println(area);
       }
     }
}