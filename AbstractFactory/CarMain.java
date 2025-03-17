import java.util.Scanner;

public class CarMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha a marca do carro para montar (Toyota, Honda):");
    String marcaCarro = scanner.nextLine(); // A entrada do usuário não precisa ser forçada para minúscula

    FabricaCarro fabricaCarro = ProdutorFabrica.obterFabrica(marcaCarro);

    if (fabricaCarro != null) {
      Carro carro = fabricaCarro.criarCarro();
      carro.montar();
    } else {
      System.out.println("Marca não reconhecida. Tente novamente.");
    }

    scanner.close();
  }
}