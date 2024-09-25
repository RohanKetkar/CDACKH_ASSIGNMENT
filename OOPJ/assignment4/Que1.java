package OOPJ.assignment4;

import java.util.Scanner;
class Java1{
   
    float principle;
    float interest;

int loanterm;

float montlpament;
int montlinterest;

float annualinterest;




float totalamount;

public  Java1(){

  this(8,1,1,8);

  
}



public Java1(float principle,float interest,int loanterm,float annualinterest){

  
this.principle = principle;

this.interest =interest;

this.loanterm = loanterm;
this.annualinterest=annualinterest;
}
  public void setprincipleamount(float principle) {

    this.principle=principle;

  } 
  public void setinterest(float interest){

    this.interest=interest;
  }


  public void setloanterm(int loanterm){
this.loanterm=loanterm;
}
public float getprincipleamount(){

  return this.principle;
}
public float getinterest(){
return this.interest;

}
public float getloanterm(){

System.out.println(this.loanterm);

  return this.loanterm;
}



public float gettotalamount(){

   this.totalamount=this.montlpamentcalculate()*this.loanterm*12;
   return this.totalamount;

}


public float montlpamentcalculate(){

int numerofmont=this.loanterm*12;
float montlinterest= annualinterest / 12 / 100 ;

this.montlpament= (float) (this.principle*(montlinterest * Math.pow((1 +montlinterest),(numerofmont))) / (Math.pow((1 + montlinterest),(numerofmont)) - 1));


return this.montlpament;

}







public String toString(){

  return String.format("montlpament rs %.2f",this.montlpamentcalculate());
}
}

class Que1{

    public static void main(String [] args){


Java1 j1=null;

int count=0;
Scanner sc=new Scanner(System.in);

do{

//System.out.println("Welcome : ");

System.out.println("Enter is loan is amount : ");
float num1=sc.nextFloat();

System.out.println("annual is interest is rate : ");
float num11=sc.nextFloat();

System.out.println("loan is term : ");





int loanterm=sc.nextInt();

j1=new Java1(num1,num11,loanterm,8);
System.out.println("success");

if(j1!=null){

  System.out.println(j1.toString());//
  System.out.printf("Total : %.2f\n",j1.gettotalamount());
}

count++;
}while(count!=1);
      count++;
    }
}