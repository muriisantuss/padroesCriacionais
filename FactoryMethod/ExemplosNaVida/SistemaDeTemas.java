package ExemplosNaVida;

// Classe principal para testar o Factory Method
public class SistemaDeTemas {
  public static void main(String[] args) {
    // Simulando que o usuário escolheu um tema
    FabricaDeTemas fabrica = new FabricaTemaEscuro(); // Poderia ser TemaClaro ou AltoContraste
    Tema tema = fabrica.criarTema();
    System.out.println();
    tema.aplicarTema();
  }
}