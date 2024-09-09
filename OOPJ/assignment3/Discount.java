package OOPJ.assignment3;

import java.text.NumberFormat;

import java.util.Scanner;
import java.util.Locale;
class Discount1{

    float original;
    float discount;

public void acceptrecord(float original,float discount){

    this.discount = (original*discount)/100;
    this.original=original;
}
public void display(){

    NumberFormat n1=NumberFormat.getCurrencyInstance(new Locale("en","in"));
    String n11=n1.format(this.original);

    String n12345678=n1.format(discount);
    System.out.println("original "+n11);
    System.out.println("discount "+n12345678);
}
}
public class Discount {
  
    public static void main(String[] args){
Discount1 d1=new Discount1();

Scanner sc=new Scanner(System.in);





System.out.println("Enter is original is discount");

float original=sc.nextFloat();
float discount=sc.nextFloat();

d1.acceptrecord(original,discount);

d1.display();
    }
}
