package ads1.assignment1;

public class fibonaci1 {
    
public static void fibonaci(int num1){


System.out.println(0);

//System.out.println(1);
int a=0;

int b=1;

for(int i=2;i<=num1;i++){
System.out.println(b);

int c = b;

b=a+b;
a=c;
    
}


}

    public static void main(String[] args){

        fibonaci(8);

    }
}
