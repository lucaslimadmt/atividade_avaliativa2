
import java.util.Scanner;
public class Q2_senha_usuario {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Digite o nome de usuário: ");
      String nomeusuario = sc.next();
      System.out.println("Digite a senha: ");
      String senha = sc.next();
      if (senha.equals(nomeusuario)){
      System.out.println("Acesso negado, digite os itens novamente.");
    }else{
      System.out.println("Acesso liberado.");
      break;
}
    }
    sc.close();
  }
}
    
  