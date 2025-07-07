package BeeCrowd_Java;
import java.util.Scanner;

public class BeeCrowd1008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int funcionario = sc.nextInt();
        int horas_trabalhadas = sc.nextInt();
        double valor_hora = sc.nextDouble();

        double salario = valor_hora * horas_trabalhadas;

        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f", salario);
    }
}