package BeeCrowd_Java;
import java.util.Scanner;

public class BeeCrowd1011 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double R = sc.nextDouble();

        double vol = (4.0 / 3.0) * pi * (R * R * R);

        System.out.printf("VOLUME = %.3f%n", vol);
    }
}
