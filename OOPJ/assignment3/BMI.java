package OOPJ.assignment3;

import java.util.Scanner;
class System1{
    float height;
    float weight;
float Bmi;
    // instiantiate is with is constructor
    public System1 (float height,float weight){

        //System.out.println("System1");
        this.weight=weight;
        this.height=height;
    }















public float calculate(){

    //System.out.println("calculate");
   this.Bmi=(this.weight)/(this.height * this.height);
   //getinfo1();
return this.Bmi;

}
public void getinfo(){

    //System.out.println("getinfo");
double bmi1=calculate();

//System.out.println(bmi1);
if(bmi1<18.5){

    System.out.println("underweight");
}



if(bmi1>=18.5 && bmi1 < 24.9){

System.out.println("normalweight");
}

if(bmi1>=25 && bmi1 < 29.9){




System.out.println("overweight");

}else if (bmi1>=30){
    System.out.println("obese");
}



}
}

public class BMI {
    


public static void main(String[] args){

    





Scanner sc=new Scanner(System.in);

System.out.println("Enter is height is weight : ");
float height=sc.nextFloat();
float weight=sc.nextFloat();

//System.out.println(sc.nextFloat());
System1 s1=new System1(height,weight);

s1.getinfo();



}


}