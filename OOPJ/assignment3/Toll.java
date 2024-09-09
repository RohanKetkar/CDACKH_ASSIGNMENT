package OOPJ.assignment3;

import java.util.ArrayList;
import java.util.Scanner;

class Toll1 {
    
   static ArrayList<String> carList = new ArrayList<>();
    float total = 0;  
   static int count = 0;    
static float price=0;

    public Toll1(String car, float price, int vehicle) {
        carList.add(car);       
        count = count+1;        
        this.total = this.total+price;  
        Toll1.price=Toll1.price+price;    
    }

    
    static public void getinfo() {
        System.out.println("Total Price: " + price);
        System.out.println("Vehicle Count: " + count);
        System.out.println("Cars: " + carList);
    }
}

public class Toll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take car name as input
        System.out.print("Enter car name: ");
        String car = sc.nextLine();

        // Take price as input
        System.out.print("Enter price: ");
        float price = sc.nextFloat();

        // Take vehicle count as input
        System.out.print("Enter number of vehicles: ");
        int vehicle = sc.nextInt();

        // Create Toll1 object and call the getinfo method
        Toll1 toll1 = new Toll1(car, price, vehicle);
         // Take car name as input
         //sc.next();
         System.out.println("Enter car name: ");
         sc.nextLine();
         String car1 = sc.nextLine();
 
         // Take price as input
         System.out.println("Enter price: ");
         float price1 = sc.nextFloat();
 
         // Take vehicle count as input
         System.out.println("Enter number of vehicles: ");
         int vehicle1 = sc.nextInt();
        Toll1 toll11 = new Toll1(car1, price1, vehicle1);
        Toll1.getinfo();
        //toll1.getinfo();  // Display total info
    }
}