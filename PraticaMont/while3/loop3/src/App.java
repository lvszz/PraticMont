import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    String senha;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a senha para entrar ao sistema: ");
    senha = scanner.nextLine();

    while (!senha.equals("1234")) {
        System.out.print("Senha incoreta, digite novamente: ");
        senha = scanner.nextLine();
    }
     
    System.out.print("Senha correta!");

    }
}
