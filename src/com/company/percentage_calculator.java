package com.company;
import java.util.Scanner;
class Subject{
    int max = 100;
    int obtd;

}

public class percentage_calculator {
    public static void main(String[] args) {
      Subject s1 = new Subject();
        System.out.println("Enter the Marks In Maths : ");
        Scanner sc = new Scanner(System.in);
        s1.obtd = sc.nextInt();

        Subject s2 = new Subject();
        System.out.println("Enter the Marks In Science : ");
        s2.obtd = sc.nextInt();

        Subject s3 = new Subject();
        System.out.println("Enter the Marks In English : ");
        s3.obtd = sc.nextInt();

        Subject s4 = new Subject();
        System.out.println("Enter the Marks In hindi : ");
        s4.obtd = sc.nextInt();

        Subject s5 = new Subject();
        System.out.println("Enter the Marks In Marathi : ");
        s5.obtd = sc.nextInt();
        int total = (s1.obtd)+(s2.obtd)+(s3.obtd)+(s4.obtd)+(s5.obtd);
        int percentage =(total*100/500);
        System.out.print("Percentage Obtainted : ");
        System.out.print(percentage);

        if (percentage== 35) {

          System.out.println("The student just passed the test");
          } else if (percentage<35) {
          System.out.println("Failed");

        } else if (percentage>60) {
          System.out.println("Passesd with A grade");
        }
    }
}
