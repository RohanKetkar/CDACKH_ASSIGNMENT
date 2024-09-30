package ads1.assignment2;

public class Stringpalindrome {
    
    public static void main(String[] args){
        String str1="madam";

int start=0;

int end1=str1.length()-1;
while(start<end1){

    if(str1.charAt(start)!=str1.charAt(end1)){

        System.out.println("not1");
        return;
    }else{
        System.out.println("ok");
    }
start++;
end1--;

}

    }
}
