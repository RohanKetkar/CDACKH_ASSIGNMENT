import java.util.Scanner;

public class que1 {
    
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);

        System.out.println("1 is square is 2 circle 3 triangle 4 rectangle");
        
        int que1=sc.nextInt();

        switch(que1){

case 1:{
    System.out.println("enter");
float length=sc.nextFloat();

System.out.println("area is square "+length*length);

}
break;

case 2:


System.out.println("enter");

float radius=sc.nextFloat();

System.out.println("area is circle "+(3.14*(radius*radius)));
break;
case 3 :{
System.out.println("enter");

    float base=sc.nextFloat();
    float height=sc.nextFloat();

    System.out.println("area is triangle "+base*height);

}
break;

case 4:{
    float length=sc.nextFloat();
    float breadth=sc.nextFloat();
    System.out.println("area is rectangle "+length*breadth);

}

break;
default : System.out.println("enter is valid is number");
        }
    }
}
