import java.util.Scanner.*;
import java.util.*;
public class simpleInterestCalculator {
    public static void main(String[] args) {

        double p,n,r,si;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the principle amount");
        p = sc.nextFloat();

        System.out.println("Enter the number of years");
        n = sc.nextFloat();

        System.out.println("Enter the rate of Interest");
        r = sc.nextFloat();

        si = (p * n * r) / 100;

        System.out.println("The Interest amount is:" + si);

    }
}