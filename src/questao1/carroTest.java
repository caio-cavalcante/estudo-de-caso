package questao1;

public class carroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Honda Civic";
        carro1.velocidade = 60;
        carro1.aceleracao = 10;
        carro1.marcha = 4;

        Carro carro2 = new Carro();
        carro2.modelo = "Toyota Corolla";
        carro2.velocidade = 0;
        carro2.aceleracao = 0;
        carro2.marcha = 1;

        Carro carro3 = new Carro();
        carro3.modelo = "Bugatti Veyron";
        carro3.velocidade = 200;
        carro3.aceleracao = -20;
        carro3.marcha = 6;

        carro1.ligaDesliga();
        carro2.ligaDesliga();
        carro3.ligaDesliga();
        System.out.println("");

        carro1.aceleraDesacelera();
        carro2.aceleraDesacelera();
        carro3.aceleraDesacelera();
        System.out.println("");

        carro1.virar();
        carro2.virar();
        carro3.virar();
        System.out.println("");

        carro1.mudarMarcha();
        carro2.mudarMarcha();
        carro3.mudarMarcha();

    }
}
