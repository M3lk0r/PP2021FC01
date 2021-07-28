/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author eduar
 */
public class Carro {

    public String carro;

    public Carro() {
    }

    public Carro(String carro) {
        this.carro = carro;
    }

    public String reservaCarro(String carro, int quantidadeDias) {
        String result = "\n";
        double valor = 0.00;

        result += "A reserva do carro " + carro + " foi realizada. ";

        if (carro.contains("Fiat Uno")) {
            valor = 75.00;
        } else if (carro.contains("Ford Ka")) {
            valor = 82.00;
        } else if (carro.contains("Nissan GT-R")) {
            valor = 1250.00;
        }
        result += "Ficando no valor de R$" + valor + "/dia\n";
        result += calcularAluguelCarro(valor, quantidadeDias);
        return result;
    }

    private String calcularAluguelCarro(double valor, int quantidadeDias) {
        double valorAluguel = valor * quantidadeDias;
        String result = "O valor total do aluguel é de R$" + valorAluguel + "\n";

        return result;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }
}
