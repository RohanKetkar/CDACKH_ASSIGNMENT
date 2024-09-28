package ads1.assignment1;

 class repeatnot1 {
     static Character repeatnot(String str) {
        int[] charCount = new int[256]; 

        
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

       
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

       
        return null;
    }

    public static void main(String[] args) {
        String input1 = "stress";
        

        Character result1 = repeatnot(input1);
        

        System.out.println(result1 );
       
    }
}
