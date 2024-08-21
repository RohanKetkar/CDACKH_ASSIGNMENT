package assignment2.program;

import java.util.Scanner;
class Calculator {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
char ch='0';
    while(ch != '1'){

        System.out.println("Enter number 1 : ");
        int num1 =sc.nextInt();

        System.out.println("Enter number 2 : ");
        int num2 =sc.nextInt();
System.out.println("Enter * || + || - || / , to exit press 1");
        ch =sc.next().charAt(0);
if(ch=='+'){
System.out.println("addition is : "+(num1+num2));
}else if(ch=='*'){
    System.out.println("multiplication is : "+num1*num2);
}else if(ch=='-'){
    System.out.println("subtraction is : "+ (num1-num2));
}else if(ch=='/'){
    System.out.println("division is : "+num1/num2);

}else if(num2==0){
    System.out.println("cannot divide by zero");
}
    }
}
}
