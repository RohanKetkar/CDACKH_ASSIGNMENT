package ads1.assignment2;

public class Reversestring {

    public static void main(String[] args){

        String str1="Rohan1";
        for(int i=str1.length()-1;i>=0;i--){
            
            StringBuilder str8=new StringBuilder();
            str8.append(str1.charAt(i));

            System.out.print(str8);

        }
    }

}
