import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = input.nextDouble();

        double area = Math.pow(lado, 2);
        double dobroArea = area * 2;

        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área do quadrado é: " + dobroArea);
        input.close();
    }
}
