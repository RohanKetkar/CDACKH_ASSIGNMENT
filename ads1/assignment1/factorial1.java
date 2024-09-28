package ads1.assignment1;

public class factorial1 {
    
public static int factorial(int num1){
int ans1=1;

    for(int i=1;i<=num1;i++){

    ans1 = ans1*i  ;
    }

    System.out.println(ans1);

return 1;

}

    public static void main(String[] args){

        factorial(5);
    }

}
