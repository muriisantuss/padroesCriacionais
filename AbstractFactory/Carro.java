// Passo 1: Interface para os carros
interface Carro {
  void montar(); // Método que será implementado pelas subclasses
}

// Passo 2: Implementações concretas dos carros
class Toyota implements Carro {
  public void montar() {
    System.out.println("Toyota montado.");
  }
}

class Honda implements Carro {
  public void montar() {
    System.out.println("Honda montado.");
  }
}

// Passo 3: Interface da fábrica abstrata
interface FabricaCarro {
  Carro criarCarro(); // Método para criar um carro
}

// Passo 4: Implementações concretas das fábricas
class FabricaToyota implements FabricaCarro {
  public Carro criarCarro() {
    return new Toyota(); // Retorna um carro da Toyota
  }
}

class FabricaHonda implements FabricaCarro {
  public Carro criarCarro() {
    return new Honda(); // Retorna um carro da Honda
  }
}

class ProdutorFabrica {
  public static FabricaCarro obterFabrica(String marca) {
    // Comparação case-insensitive para garantir que o usuário possa digitar com qualquer formatação
    if (marca.equalsIgnoreCase("Toyota")) {
      return new FabricaToyota();
    } else if (marca.equalsIgnoreCase("Honda")) {
      return new FabricaHonda();
    }
    return null;
  }
}
