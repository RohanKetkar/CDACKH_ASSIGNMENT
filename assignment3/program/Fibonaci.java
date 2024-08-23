package assignment3.program;

class Fibonaci {
    
    public static void main(String args[]){
int n =21;



int num1=0;
int num2=1;

int tem1=0;
    for(int i=1;i<n;i++){
        tem1 = num1+num2;

        num1=num2;

        
        num2=tem1;
    }




    System.out.println("fibonaci "+tem1);

}



    }



