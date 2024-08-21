package assignment2.snippets;
class Ques10 {
    
    //method is overloading is allowed but i should contain static keyword as method cant be used without static in main method as main method is static
    public static void display(int a) {
        System.out.println("No parameters");
     }
        public static void display1(int num) { System.out.println("With parameter: " + num);
        }
        public static void main(String[] args) {
        display(1);
        display1(5); 
    }
}
