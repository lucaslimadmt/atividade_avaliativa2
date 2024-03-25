import java.util.Scanner;
public class Q5_crescimento_populacao {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int populacaoA, populacaoB;
    double crescimentoA, crescimentoB;
    int anos = 0;
        System.out.println("Digite a população do país A: ");
        populacaoA = sc.nextInt();
        System.out.println("Digite a taxa de crescimento do país A (%): ");
        crescimentoA = sc.nextDouble();
        crescimentoA = crescimentoA/100;
        System.out.println("Digite a população do país B: ");
        populacaoB = sc.nextInt();
        System.out.println("Digite a taxa de crescimento do país B (%): ");
        crescimentoB = sc.nextDouble();
        crescimentoB = crescimentoB/100;
        if (populacaoA < populacaoB){
        while (populacaoA < populacaoB){
        populacaoA += (int) (populacaoA * crescimentoA);
        populacaoB += (int) (populacaoB* crescimentoB);
        anos++;
        }
        System.out.println("A população A passará a população B em "+anos+" anos, e o número de habitantes será: " + populacaoA);
    }
        else if (populacaoB < populacaoA){
        while (populacaoB < populacaoA){
        populacaoA += (int) (populacaoA * crescimentoA);
        populacaoB += (int) (populacaoB* crescimentoB);
        anos++;
        
     }
     System.out.println("A população B passará a população A em:" + anos +" anos, e o número de habitantes será: " + populacaoB);
     
sc.close();
}
}
}

