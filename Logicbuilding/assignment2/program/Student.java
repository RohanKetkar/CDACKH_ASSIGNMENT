package assignment2.program;

import java.util.Scanner;

class Student {
    
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter subj 3 time : ");
    int subj1=sc.nextInt();
    int subj2=sc.nextInt();

    int subj3=sc.nextInt();
    
int subjfail = 0;

switch (subj1 >40 ? 1 : 0){
    case 0:

    subjfail++;
}

switch(subj2 > 40 ? 1 :0){

    case 0:
    subjfail++;
}
switch(subj3 > 40 ? 1 : 0){

    case 0 :subjfail++;
}

switch(subjfail==0 ? 0:1){

    case 0 : System.out.println("pass");
    break;

    default:System.out.println("fail in : " + subjfail + " subj");
    break;
}

}

}
