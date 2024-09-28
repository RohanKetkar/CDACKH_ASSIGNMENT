package ads1.assignment1;

class Repeatc1 {
    public static void main(String[] args) {
        String input1 = "programming";
        
        System.out.println(findrepeatcharacter(input1));

        
    }

    public static String findrepeatcharacter(String str) {
        boolean[] charSeen = new boolean[256]; 

        String result = "";
        for (char ch : str.toCharArray()) {
            if (charSeen[ch]) {
                
                if (result.indexOf(ch) == -1) {
                    result += ch; 
                }
            } else {
                charSeen[ch] = true; 
            }
        }

        return result;
    }
}