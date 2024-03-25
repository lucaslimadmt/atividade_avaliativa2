

import java.util.Scanner;
public class Q4_populacao_AB {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int populacaoA = 80000;
    int populacaoB = 200000;
    double crescimentoA = 0.03;
    double crescimentoB = 0.015;
    int anos = 0;
    while (populacaoA < populacaoB){
         populacaoA += (int) (populacaoA * crescimentoA);
         populacaoB += (int) (populacaoB* crescimentoB);
         anos++;
    }
        System.out.println("A população A passará a população B em "+anos+" anos, e o número de habitantes será: " + populacaoA);
        
        sc.close();
     }

    }
