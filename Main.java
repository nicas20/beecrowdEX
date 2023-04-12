import java.util.Scanner;

public class Main {

    public static double calculoAjuste(double salario){
        if (salario <= 400.00){
            return salario * 1.15;
        } else if (salario <= 800.00){
            return salario * 1.12;
        } else if (salario <= 1200.00){
            return salario * 1.1;
        } else if (salario <= 2000.00){
            return salario * 1.07;
        } else {
            return salario * 1.04;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();
        double novoSalario = calculoAjuste(salario);
        double reajusteGanho = novoSalario - salario;
        double percentual = (reajusteGanho / salario) * 100;
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho);
        System.out.printf("Em percentual: %.0f %%\n", percentual);
    }
}