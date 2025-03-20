package ExemplosNaVida;

// Interface para os Veículos
interface Veiculo {
    String info();
}

// Implementações concretas de veículos
class Carro implements Veiculo {
    private String tipo;

    public Carro(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String info() {
        if ("esportivo".equals(tipo)) {
            return "Um veículo de quatro rodas com foco no desempenho e agilidade";
        } else if ("luxo".equals(tipo)) {
            return "Carro de luxo: Um veículo de quatro rodas, projetados com foco no conforto, qualidade e status. ";
        }
        return null;
    }
}

class Caminhao implements Veiculo {
    @Override
    public String info() {
        return "Caminhão: Um grande veículo, projetados principalmente para o transporte de mercadorias e produtos.";
    }
}

class Moto implements Veiculo {
    @Override
    public String info() {
        return "Moto: Veículo de duas rodas, projetadas para oferecer desempenho excepcional em termos de velocidade, agilidade e estabilidade. ";
    }
}

// Fábrica abstrata
interface VeiculoFactory {
    Carro criarCarro(String tipo);

    Caminhao criarCaminhao();

    Moto criarMoto();
}

// Fábrica concreta para carros de luxo
class FábricaCarroLuxo implements VeiculoFactory {
    @Override
    public Carro criarCarro(String tipo) {
        return new Carro("luxo");
    }

    @Override
    public Caminhao criarCaminhao() {
        return new Caminhao();
    }

    @Override
    public Moto criarMoto() {
        return new Moto();
    }
}

// Fábrica concreta para carros esportivos
class FábricaCarroEsportivo implements VeiculoFactory {
    @Override
    public Carro criarCarro(String tipo) {
        return new Carro("esportivo");
    }

    @Override
    public Caminhao criarCaminhao() {
        return new Caminhao();
    }

    @Override
    public Moto criarMoto() {
        return new Moto();
    }
}

// Fábrica concreta para caminhões de carga
class FábricaCaminhaoDeCarga implements VeiculoFactory {
    @Override
    public Carro criarCarro(String tipo) {
        return new Carro("luxo");
    }

    @Override
    public Caminhao criarCaminhao() {
        return new Caminhao();
    }

    @Override
    public Moto criarMoto() {
        return new Moto();
    }
}

// Fábrica concreta para motos de alta performance
class FábricaMotoAltaPerformance implements VeiculoFactory {
    @Override
    public Carro criarCarro(String tipo) {
        return new Carro("luxo");
    }

    @Override
    public Caminhao criarCaminhao() {
        return new Caminhao();
    }

    @Override
    public Moto criarMoto() {
        return new Moto();
    }
}

// Classe Cliente
class SimuladorDeTransporte {
    private VeiculoFactory fabrica;

    public SimuladorDeTransporte(VeiculoFactory fabrica) {
        this.fabrica = fabrica;
    }

    public void exibirCarro(String tipo) {
        Carro carro = fabrica.criarCarro(tipo);
        System.out.println(carro.info());
    }

    public void exibirCaminhao() {
        Caminhao caminhao = fabrica.criarCaminhao();
        System.out.println(caminhao.info());
    }

    public void exibirMoto() {
        Moto moto = fabrica.criarMoto();
        System.out.println(moto.info());
    }
}