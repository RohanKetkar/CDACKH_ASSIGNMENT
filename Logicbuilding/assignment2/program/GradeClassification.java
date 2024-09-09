package assignment2.program;

// when package are present always run code from root directory here root directory is java , assignment2 before directory from java directory java assignment2.program.GradeClassification javac assignment2/program/GradeClassification.java

import java.util.Scanner;

public class GradeClassification {
    public static void main(String args[]){
        System.out.println("Enter marks : ");
    try (Scanner sc = new Scanner(System.in)) {
    int score=sc.nextInt();
    if(score >=90){
        System.out.println("A");
    }else if(score>=80 && score <=89){
        System.out.println("B");
    }else if(score>=70 && score<=79 ){
System.out.println("C");
    }
    else if(score>=60 && score <=69){

        System.out.println("D");
    }else{
        System.out.println("F");
    }
}

    }
}
