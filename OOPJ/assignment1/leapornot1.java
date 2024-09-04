public class leapornot1 {

    public static void main(String[] args){

        int q=1888;
int case1=0;

        if(q%4==0&&q%100!=0 || q%400==0){

            case1=1;
        }

        switch(case1){

            case 1 : System.out.println("leap");
            break;
            default : System.out.println("noleap");
        }
    }
    
}
