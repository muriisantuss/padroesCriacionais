package ExemplosNaVida;

// Interface para os temas
interface Tema {
  void aplicarTema();
}

// Implementações específicas dos temas
class TemaClaro implements Tema {
  @Override
  public void aplicarTema() {
    System.out.println("Aplicando Tema Claro: fundo branco, texto preto.");
  }
}

class TemaEscuro implements Tema {
  @Override
  public void aplicarTema() {
    System.out.println("Aplicando Tema Escuro: fundo preto, texto branco.");
  }
}

class TemaAltoContraste implements Tema {
  @Override
  public void aplicarTema() {
    System.out.println("Aplicando Tema Alto Contraste: fundo amarelo, texto preto.");
  }
}

// Fábrica abstrata (Factory Method)
abstract class FabricaDeTemas {
  public abstract Tema criarTema(); // Método Factory
}

// Fábricas concretas para cada tipo de tema
class FabricaTemaClaro extends FabricaDeTemas {
  @Override
  public Tema criarTema() {
    return new TemaClaro();
  }
}

class FabricaTemaEscuro extends FabricaDeTemas {
  @Override
  public Tema criarTema() {
    return new TemaEscuro();
  }
}

class FabricaTemaAltoContraste extends FabricaDeTemas {
  @Override
  public Tema criarTema() {
    return new TemaAltoContraste();
  }
}
