import java.util.*;
public class Avgthreenum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);
    }
}