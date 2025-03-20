import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibir opções para o usuário escolher o tipo de integração
        System.out.println("Escolha o tipo de integração:");
        System.out.println("1 - REST");
        System.out.println("2 - SOAP");
        System.out.println("3 - FTP");
        System.out.print("Digite a opção desejada: ");
        
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        TipoIntegracao tipo;
        switch (opcao) {
            case 1:
                tipo = TipoIntegracao.REST;
                break;
            case 2:
                tipo = TipoIntegracao.SOAP;
                break;
            case 3:
                tipo = TipoIntegracao.FTP;
                break;
            default:
                System.out.println("Opção inválida! Saindo...");
                scanner.close();
                return;
        }

        // Criar a fábrica correspondente ao tipo escolhido
        FabricaIntegracao fabrica = ProdutorFabricaIntegracao.obterFabrica(tipo);
        Integracao integracao = fabrica.criarIntegracao();

        // Solicitar os dados ao usuário
        System.out.print("Digite os dados que deseja enviar: ");
        String dados = scanner.nextLine();

        // Enviar os dados usando a integração escolhida
        integracao.enviarDados(dados);

        // Fechar o scanner
        scanner.close();
    }
}
