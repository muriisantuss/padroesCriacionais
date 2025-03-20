package ExemplosNaVida;

// Cliente usando fábricas
public class Main {
  public static void main(String[] args) {
    // Escolha da fábrica (por exemplo, escolher fábrica de carros de luxo)
    VeiculoFactory fabricaLuxo = new FábricaCarroLuxo();
    SimuladorDeTransporte simulador = new SimuladorDeTransporte(fabricaLuxo);

    System.out.println("Simulador com carros de luxo:");
    simulador.exibirCarro("luxo");

    System.out.println("\nAgora, simulador com carros esportivos:");
    VeiculoFactory fabricaEsportiva = new FábricaCarroEsportivo();
    simulador = new SimuladorDeTransporte(fabricaEsportiva);
    simulador.exibirCarro("esportivo");

    System.out.println("\nAgora, simulador com caminhões de carga:");
    VeiculoFactory fabricaCarga = new FábricaCaminhaoDeCarga();
    simulador = new SimuladorDeTransporte(fabricaCarga);
    simulador.exibirCaminhao();

    System.out.println("\nAgora, simulador com motos de alta performance:");
    VeiculoFactory fabricaMoto = new FábricaMotoAltaPerformance();
    simulador = new SimuladorDeTransporte(fabricaMoto);
    simulador.exibirMoto();
  }
}
