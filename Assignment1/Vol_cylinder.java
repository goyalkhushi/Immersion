import java.util.*;
public class Vol_cylinder{
    public static void main(String[] args){
        Scanner sc=new scanner(System.in);
        double radius=sc.nextDouble();
        double height=sc.nextDouble();
        double vol=Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder is: " + vol);

    }
}