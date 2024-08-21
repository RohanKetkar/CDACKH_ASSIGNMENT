package assignment2.snippets;

//snippet5
class Quest {
    
    //but is no compile time error no run time error even if i change order it will run only String args[] mandatory
    //multiple main method can be written but only main(String[] args) run as in command line is text so it take string 

    public static void main(String[] args) {
        System.out.println("Main method with String[] args"); 
    } //run
        public static void main(int[] args) { //not run
         System.out.println("Overloaded main method with int[] args");
        }
}
