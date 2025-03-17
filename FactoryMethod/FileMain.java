import java.util.Scanner;

public class FileMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String conteudo = "Este é o conteúdo do arquivo.";

    System.out.println("Escolha o tipo de arquivo para salvar (pdf, word, txt):");
    String tipoArquivo = scanner.nextLine().toLowerCase();

    // Criando a fábrica correspondente ao tipo de arquivo
    FabricaArquivo fabrica = null;

    switch (tipoArquivo) {
      case "pdf":
        fabrica = new FabricaPDF();
        break;
      case "word":
        fabrica = new FabricaWord();
        break;
      case "txt":
        fabrica = new FabricaTXT();
        break;
      default:
        scanner.close();
        throw new IllegalArgumentException("Tipo de arquivo desconhecido: " + tipoArquivo);
    }

    fabrica.salvarConteudo(conteudo);

    scanner.close();
  }
}