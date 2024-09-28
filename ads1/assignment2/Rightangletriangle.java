package ads1.assignment2;

public class Rightangletriangle {
   
    static void print(int num1,int num11){
     if(num1<0){

    

     }else{
         print1(num1,num11);

          print(num1-1,num11);

     }


    }
static void print1(int num1,int num11){

    for(int i=num1;i<num11;i++){

        System.out.print("* ");
    }
    
System.out.println();

}
    public static void main(String[] args){
        
print(5,5);

    }
}
