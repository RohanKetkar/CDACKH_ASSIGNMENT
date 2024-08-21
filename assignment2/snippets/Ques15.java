package assignment2.snippets;
class Ques15 {
    
    //error is incompatible datatype as num2 is double , int+double is double so i am storing double in result which is int datatype or i can explicitly convert double to int or make result datatype to double
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 5.5;
        int result = num1 +(int)num2; System.out.println(result); //15.5 is output is result datatype double but datatype int and convert double to int output 15
        }
}
