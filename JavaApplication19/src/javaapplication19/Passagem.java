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
public class Passagem {

    public String lugar;

    public Passagem() {
    }

    public Passagem(String lugar) {
        super();
        this.lugar = lugar;
    }

    public String reservaPassagem(String lugar) {
        String result = "\n";
        double valor = 0.00;

        result += "A reserva da sua passagem para " + lugar + " foi realizada\n";

        if (lugar.contains("Veneza")) {
            valor = 3629.00;
        } else if (lugar.contains("Toquio")) {
            valor = 7231.00;
        } else if (lugar.contains("Toronto")) {
            valor = 4305.00;
        }

        result += "O valor da passagem é de R$" + valor + "\n";
        return result;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

}
