

import java.util.Scanner;
public class Q8_soma_media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma, media;

        System.out.println("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3= sc.nextInt();
        System.out.println("Digite o quarto numero: ");
        int numero4= sc.nextInt();
        System.out.println("Digite o quinto numero: ");
        int numero5= sc.nextInt();
        soma = numero1 + numero2 + numero3 + numero4 + numero5;
        System.out.println("A soma dos números é: " + soma);
        media = (numero1 + numero2 + numero3 + numero4 + numero5)/5;
        System.out.println("A média dos números é: " + media);
        sc.close();
    }
}
