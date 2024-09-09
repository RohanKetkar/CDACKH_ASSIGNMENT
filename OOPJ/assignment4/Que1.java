package OOPJ.assignment4;

class Java1{
   
    float principle;
    float interest;

int loanterm;

double montlpament;
int montlinterest;

float annualinterest;


public  Java1(){

  this(8.0f,1.0f,1,8);

  
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


  public void loanterm(int loanterm){
this.loanterm=loanterm;
}
public float getprincipleamount(){

  return this.principle;
}
public float getinterest(){
return this.interest;

}
public float getloanterm(){

  return this.loanterm;
}

public double montlpamentcalculate(){

int numerofmont=this.loanterm*12;
float montlinterest= annualinterest / 12 / 100 ;

this.montlpament= (float)this.principle*(montlinterest * Math.pow((1 +montlinterest),(numerofmont))) / (Math.pow((1 + montlinterest),(numerofmont)) - 1);


return this.montlpament;

}

public String toString(){

  return String.format("montlpament %.2f"+(float)montlpamentcalculate());
}
}
class Que1{

    public static void main(String [] args){




      Java1 j1=new Java1(8000.0f,8.0f,1,8.0f);
      
          j1.getloanterm();

      System.out.println(j1);



    }
}