// Não consegui fazer a validação dos últimos dois itens (Sexo e Estado civil).
import java.util.Scanner;
public class Q3_validacao_informacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Digite o nome: ");
        String nome = sc.next();
        int numCaracteres = nome.length();
        if (numCaracteres <= 3){
        System.out.println("Nome inválido, digite novamente.");
        }else{
           break;
        }
    }
        boolean idadevalida = false;
    do{
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade >= 0 && idade <= 150){
            idadevalida = true;
            break;
        }else{
            System.out.println("Idade invalida, digite novamente.");
        }
    }while(!idadevalida);
    while (true) {
        System.out.println("Digite seu salário: ");
        double salario = sc.nextDouble();
        if (salario <= 0){
        System.out.println("Salário inválido, digite novamente.");
    }else{
        break;
    }
}
    sc.close();
}
}
 


