import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------- CONTADOR ---------");
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();
        System.out.println("---------------------------");
        
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O SEGUNDO PARÊMETRO deve ser maior que o primeiro");
        }
    }
    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int valor = 1; valor <= contagem; valor++) {
            System.out.println("Imprimindo o número " + valor);
        }
    }
}
