package ExemplosNaVida;

// Classe principal para testar o Factory Method
public class SistemaDeTemas {
  public static void main(String[] args) {
    // Simulando que o usuário escolheu um tema
    String temaEscolhido = "alto-contraste"; // claro - escuro - alto-contraste

    // Obtendo a fábrica correta com base na escolha do usuário
    FabricaDeTemas fabrica = FabricaDeTemas.obterFabrica(temaEscolhido);
    Tema tema = fabrica.criarTema();
    System.out.println();
    tema.aplicarTema();
  }
}