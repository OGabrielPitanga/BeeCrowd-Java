package BeeCrowd_Java;
import java.util.Scanner;

public class BeeCrowd1009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double salario_fixo = sc.nextDouble();
        double vendas = sc.nextDouble();

        double total = salario_fixo + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", total);

        sc.close();
    }
}
