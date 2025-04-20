import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int i;
        int soma = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite números positivos, caso contrário, o programa se encerra e lhe dará a soma dos positivos: ");
        i = scanner.nextInt();

        while (i>=0) {
        soma += i;
        System.out.print("Digite o próximo número: ");
        i = scanner.nextInt();
        }

        System.out.print("A soma dos números positivos é: " + soma);

    }
}
