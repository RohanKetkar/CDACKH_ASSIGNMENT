package ads1.assignment1;

public class prime1 {
    
   public static void prime11(int num1){
    for(int i=2;i<num1;i++){
        if(i==num1){
            continue;

        }else if(num1%2!=0){
          System.out.println("prime");

          break;
            
        }else{
            System.out.println("notprime");

         break;

        }
    }
   }

    public static void main(String[] args){
      prime11(10);
    }
}
