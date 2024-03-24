
import java.util.Scanner;
public class Q7_maior_numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3, numero4, numero5;
        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        numero3 = sc.nextInt();
        System.out.println("Digite o quarto numero: ");
        numero4 = sc.nextInt();
        System.out.println("Digite o quinto numero: ");
        numero5 = sc.nextInt();
        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5){
        System.out.println("O maior número é:" + numero1);
        }
        if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5){
        System.out.println("O maior número é:" + numero2);
        }
        if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5){
        System.out.println("O maior número é:" + numero3);
        }
        if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5){
        System.out.println("O maior número é:" + numero4);
        }
        if (numero5 > numero1 && numero5 > numero2 && numero5 > numero3 && numero5 > numero4){
            System.out.println("O maior número é:" + numero5);
        }
        if (numero1 == numero2 && numero1 == numero3 && numero1 == numero4 && numero1 == numero5 && numero2 == numero3 && numero2 == numero4 && numero2 == numero5 && numero3 == numero4 && numero3 == numero5 && numero4 == numero5){
            System.out.println("Os números são iguais.");
        }
    sc.close();
}
}