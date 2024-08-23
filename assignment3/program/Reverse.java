package assignment3.program;

class Reverse {
    
    public static void main(String args[]){


int num=1234;

        for(int i=1;i<=4;i++){
            int lastdigit = num%10; // 4 , 3 , 2 , 1

            num = num/10; // 123 , 12 , 1 , 0 // eliminating last digit everytime
            String rese = "";


            // String nume = 28 +"" +18; // String = String + int //String
            // System.out.println("nume"+nume); // 2818
            rese = lastdigit+rese;
            System.out.print(rese);
        }
    }
}
