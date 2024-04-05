/*
1) Utilizando os conhecimentos de O.O. construa um
programa utilizando as informações abaixo.
Um carro possui as seguintes características:
 modelo;
 velocidade;
 aceleração;
 marcha.
O carro pode realizar as seguintes ações:
 ligar e desligar;
 acelerar e desacelerar;
 virar a direita e esquerda;
 marcha para cima e para baixo.
*/

package questao1;

public class Carro {
    public java.lang.String modelo;
    public double velocidade;
    public double aceleracao;
    public int marcha;

    public void ligaDesliga() {
        if (velocidade != 0) {
            System.out.println(modelo + " está ligado.");
        } else {
            System.out.println(modelo + " está desligado.");
        }
    }

    public void aceleraDesacelera() {
        velocidade = velocidade + aceleracao;
        if (aceleracao > 0) {
            System.out.println(modelo + " está acelerando. Agora a " + velocidade);
        } else if (aceleracao < 0) {
            System.out.println(modelo + " está desacelerando. Agora a " + velocidade);
        } else {
            System.out.println(modelo + " está parado.");
        }
    }

    public void virar() {
        if (velocidade > 0) {
            System.out.println(modelo + " pode virar para esquerda ou direita.");
        } else {
            System.out.println(modelo + " está parado.");
        }
    }

    public void mudarMarcha() {
        if (aceleracao > 0) {
            marcha += 1;
            System.out.println(modelo + " agora está na " + marcha + "ª marcha.");
        } else if (aceleracao < 0) {
            marcha -= 1;
            System.out.println(modelo + " agora está na " + marcha + "ª marcha.");
        } else {
            System.out.println(modelo + " está parado.");
        }
    }

}
