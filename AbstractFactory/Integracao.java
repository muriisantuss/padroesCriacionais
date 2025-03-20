interface Integracao {
    void enviarDados(String dados);
}

class IntegracaoRest implements Integracao {
    @Override
    public void enviarDados(String dados) {
        System.out.println("Enviando dados via API REST: " + dados);
    }
}

class IntegracaoSoap implements Integracao {
    @Override
    public void enviarDados(String dados) {
        System.out.println("Enviando dados via SOAP: " + dados);
    }
}

class IntegracaoFtp implements Integracao {
    @Override
    public void enviarDados(String dados) {
        System.out.println("Enviando dados via FTP: " + dados);
    }
}

interface FabricaIntegracao {
    Integracao criarIntegracao();
}

class FabricaIntegracaoRest implements FabricaIntegracao {
    @Override
    public Integracao criarIntegracao() {
        return new IntegracaoRest();
    }
}

class FabricaIntegracaoSoap implements FabricaIntegracao {
    @Override
    public Integracao criarIntegracao() {
        return new IntegracaoSoap();
    }
}

class FabricaIntegracaoFtp implements FabricaIntegracao {
    @Override
    public Integracao criarIntegracao() {
        return new IntegracaoFtp();
    }
}

enum TipoIntegracao {
    REST, SOAP, FTP
}

class ProdutorFabricaIntegracao {
    public static FabricaIntegracao obterFabrica(TipoIntegracao tipo) {
        switch (tipo) {
            case REST:
                return new FabricaIntegracaoRest();
            case SOAP:
                return new FabricaIntegracaoSoap();
            case FTP:
                return new FabricaIntegracaoFtp();
            default:
                throw new IllegalArgumentException("Tipo de integração inválido: " + tipo);
        }
    }
}
