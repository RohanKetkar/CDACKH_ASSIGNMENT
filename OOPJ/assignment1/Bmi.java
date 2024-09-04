import java.util.Scanner;

public class Bmi {
    
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter is height(metre) is weight(kg)");

float height=sc.nextFloat();
float weight=sc.nextFloat();

float bmi=(weight/(height*height));

if(bmi<=18.5){
    System.out.println("underweight");
}
else if(bmi>18.5 && bmi <=24.9){

    System.out.println("normal");
}

else if(bmi >=25 && bmi <=29.9){

    System.out.println("overweight");
}

else if(bmi >=30 && bmi <=39.9){

    System.out.println("obesity");
}else{

    System.out.println("obesity is peak");
}

    }
}
