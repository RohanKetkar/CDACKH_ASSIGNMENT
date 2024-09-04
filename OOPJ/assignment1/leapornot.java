import java.util.Scanner;

class Leapornot{
    
    public static void main(String [] args){

        
System.out.println("working");

Scanner sc=new Scanner(System.in);
System.out.println("Enter");

int q=sc.nextInt();
      if(q%400==0 || q%100!=0 && q%4==0){
    System.out.println("Leap");
             }else{

System.out.println("Noleap");


             }

    }
}