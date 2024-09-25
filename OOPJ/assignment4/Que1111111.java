package OOPJ.assignment4;

import java.util.Scanner;

class Que11111111{
    float initialinvestmentamount;
    float interestrate;
    float compoundperyear;

    float investmentduration;
float futrevalue;

public Que11111111(){

    this(0,0,0); // constructorchaining
}

public Que11111111(float initialinvestmentamount,float interestrate,float compoundperyear){

    this.initialinvestmentamount=initialinvestmentamount;
    this.interestrate=interestrate;

    this.compoundperyear=compoundperyear;

}

    public float getInitialinvestmentamount() {
        return this.initialinvestmentamount;
    }
    public void setInitialinvestmentamount(float initialinvestmentamount) {
        this.initialinvestmentamount = initialinvestmentamount;
    }
    public float getInterestrate() {
        return interestrate;
    }
    public void setInterestrate(float interestrate) {
        this.interestrate = interestrate;
    }
    public float getCompoundperyear() {
        return compoundperyear;
    }
    public void setCompoundperyear(float compoundperyear) {
        this.compoundperyear = compoundperyear;
    }
    public float getInvestmentduration() {
        return investmentduration;
    }
    public void setInvestmentduration(float investmentduration) {
        this.investmentduration = investmentduration;
    }

    Que11111111 q1=null;

    Scanner sc=new Scanner(System.in);
    public void intiali(float initialinvestmentamount,float interestrate,float compoundyear,float investmentduration){
         this.q1=new Que11111111();
        

     System.out.println("enter 1 to start 0 to end");





int num1=this.sc.nextInt();

if(num1!=0){
    switch(num1){

        case 1: {
      System.out.println("initial : ");
      this.initialinvestmentamount=sc.nextFloat();

      System.out.println("inetresrate : ");
      this.interestrate=sc.nextFloat();

      System.out.println("compoundyear : ");
      this.compoundperyear=sc.nextFloat();
             this.futrevalue=(float)(this.initialinvestmentamount*Math.pow((1+this.interestrate/this.compoundperyear),(this.compoundperyear)));
 
             System.out.println("futurevalue: "+this.futrevalue);
        }

        case 2:{
            
            float totalinterest=this.futrevalue-this.initialinvestmentamount;
            System.out.println("totalinterest: "+totalinterest);
        }
    }
}

    }





public void closescanner(){

    this.sc.close();
    
}


}
public class Que1111111 {
  
    public static void main(String [] args){

        Que11111111 q1=new Que11111111(1,1,1); 
        System.out.println(q1.getInterestrate());

        q1.intiali(1,1,1,1);


    }
}
