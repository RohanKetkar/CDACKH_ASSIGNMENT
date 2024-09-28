package ads1.assignment1;

class palindrome{

static boolean check(int n){
    int reverse = 0;
    
    int temp = n;
    while (temp != 0) {
        reverse = (reverse * 10) + (temp % 10);
        temp = temp / 10;
    }
    
    return (reverse == n);
}
    public static void main(String[] args) {
        
        int n = 12321;
        if (check(n)) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }


}