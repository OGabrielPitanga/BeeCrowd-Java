package BeeCrowd_Java;
import java.util.Scanner;

public class BeeCrowd1006 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        double A = leitura.nextDouble();
        double B = leitura.nextDouble();
        double C = leitura.nextDouble();

        double media = (A * 2 + B * 3 + C * 5) / 10;

        System.out.printf("MEDIA = %.1f%n", media);
    }
}
