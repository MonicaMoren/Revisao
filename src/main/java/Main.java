import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome");
    String Nome = sc.nextLine();
    System.out.println("Digite sua Senha");
    int Senha = sc.nextInt();

    if (Nome.equals("Monica") && Senha == 123) {
      System.out.println("Bem - Vindo");

    }

    sc.close();
  }
}