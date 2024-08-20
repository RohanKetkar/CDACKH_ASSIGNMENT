class hourtosecond {

    public static void main(String args[]){

int hour=2;

int ans = hourtosecondfunction(hour);//hourtosecond
System.out.println(hour+"hour equal to "+ans+" second");

int num = addbyone(hour);//addbyone
System.out.println("num is "+num);
















System.out.println(maxedgeoftriangle(8,8));

System.out.println(equal(18,28));
    }
static int hourtosecondfunction(int hour){

int second = hour*60*60;

return second;

}

static int addbyone(int num){
 num = num+1;
    return num;
}



static int maxedgeoftriangle(int num1,int num8){

    return (num1+num8)-1;
}








static boolean equal(int num1,int num8){

    return num1==num8;
}

}
