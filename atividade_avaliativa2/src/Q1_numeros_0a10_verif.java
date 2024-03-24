
import java.util.Scanner;
public class Q1_numeros_0a10_verif {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nota;
    boolean notaValida = false;
    do{
      System.out.println("Digite o valor da nota: ");
      nota = sc.nextDouble();
       if (nota >= 0 && nota <= 10){
      notaValida = true;
      System.out.println("A nota digitada é: " + nota);
    }else{
      System.out.println("Nota inválida "+nota+" digite novamente. ");
       }
  }while (!notaValida);
    sc.close();
  }
}