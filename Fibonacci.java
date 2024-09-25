import java.util.*;

class Fibonacci{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){

            System.out.print(0);
        }else if(n==1){

            System.out.print(0);
        }
        else if(n==2){
System.out.print(1);
        }
        else if(n>=3){

            int count=0; int i=0;int j=1;
            for(int num1=3;num1<=n;num1++){
              
                count=i+j;

                i=j;
                j=count;
            }
            System.out.print(count);

        }
    }
}