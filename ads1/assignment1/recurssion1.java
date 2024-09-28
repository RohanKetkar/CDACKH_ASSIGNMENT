package ads1.assignment1;

public class recurssion1 {
 
static int count=0;
public static int factorial11(int num1){

    if(num1<=1){

return 1;
   
}
else{


//count=count+1;

//System.out.println(count);

//System.out.println("factorial11 " + " " +num1*factorial11(num1-1));
return num1*factorial11(num1-1);

    }

//return 8;

}
    public static void main(String[] args){
        
        System.out.println(factorial11(5));

    }
   
    


}
