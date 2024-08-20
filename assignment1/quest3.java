package assignment1;

 class quest3 {
    
    public static void main(String args[]){
int ans = greet(8);

if(ans==1){


    System.out.println("Good Morning");

}

    }
static int greet(int time){

    if(time>=5 && time <=12){
        return 1;
    }
    return 0;
}

}
