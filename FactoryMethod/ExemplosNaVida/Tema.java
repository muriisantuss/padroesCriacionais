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

  // Método estático para escolher a fábrica dinamicamente
  public static FabricaDeTemas obterFabrica(String tipo) {
    switch (tipo.toLowerCase()) {
      case "claro":
        return new FabricaTemaClaro();
      case "escuro":
        return new FabricaTemaEscuro();
      case "alto-contraste":
        return new FabricaTemaAltoContraste();
      default:
        throw new IllegalArgumentException("Tema não suportado.");
    }
  }
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