// Interface comum para todos os tipos de arquivos
interface Arquivo {
  void salvarArquivo(String conteudo);
}

// Implementação para salvar um arquivo PDF
class ArquivoPDF implements Arquivo {
  @Override
  public void salvarArquivo(String conteudo) {
    System.out.println("Salvando conteúdo como PDF: " + conteudo);
  }
}

// Implementação para salvar um arquivo Word
class ArquivoWord implements Arquivo {
  @Override
  public void salvarArquivo(String conteudo) {
    System.out.println("Salvando conteúdo como Word: " + conteudo);
  }
}

// Implementação para salvar um arquivo TXT
class ArquivoTXT implements Arquivo {
  @Override
  public void salvarArquivo(String conteudo) {
    System.out.println("Salvando conteúdo como TXT: " + conteudo);
  }
}

// Classe abstrata que define o método Factory
abstract class FabricaArquivo {
  public abstract Arquivo criarArquivo();

  // Método que chama o Factory Method e executa a criação do arquivo
  public void salvarConteudo(String conteudo) {
    Arquivo arquivo = criarArquivo();
    arquivo.salvarArquivo(conteudo);
  }
}

// Fabrica concreta para criar arquivos PDF
class FabricaPDF extends FabricaArquivo {
  @Override
  public Arquivo criarArquivo() {
    return new ArquivoPDF();
  }
}

// Fabrica concreta para criar arquivos Word
class FabricaWord extends FabricaArquivo {
  @Override
  public Arquivo criarArquivo() {
    return new ArquivoWord();
  }
}

// Fabrica concreta para criar arquivos TXT
class FabricaTXT extends FabricaArquivo {
  @Override
  public Arquivo criarArquivo() {
    return new ArquivoTXT();
  }
}