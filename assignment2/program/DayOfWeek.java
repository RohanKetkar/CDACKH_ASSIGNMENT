package assignment2.program;

import java.util.Scanner;
class DayOfWeek {
    public static void main(String args[]){
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);

       int day = sc.nextInt();
    switch(day){
    case 1:
    System.out.println("Monday");
    System.out.println("Weekday");
    break;
    case 2:

    System.out.println("Tuesday");
    System.out.println("Weekday");
    break;
    case 3:
    System.out.println("Wednesday");
    System.out.println("Weekday");
    break;
    case 4:
    System.out.println("Thursday");

    System.out.println("Weekday");
    break;

    case 5:
    System.out.println("Friday");
    System.out.println("Weekday");
    break;
    case 6:
    System.out.println("Saturday");
    System.out.println("Weekend");
    break;
    case 7:
    System.out.println("Sunday");
    System.out.println("Weekend");
    break;
    default : System.out.println("Enter valid number : ");
}

    }
}
