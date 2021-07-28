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
public class Hotel {

    String hotel;
    double valorHotel;

    public Hotel() {
    }

    public Hotel(String hotel, double valorHotel) {
        this.hotel = hotel;
        this.valorHotel = valorHotel;
    }

    public String reservaHotel(String hotel) {
        String result = "\n";
        double valor = 0.0;
        result += "Sua reserva no hotel " + hotel + " foi realizada!\n";

        if (hotel.contains("Cristal")) {
            valor = 5000.00;
        } else if (hotel.contains("Aviva")) {
            valor = 1200.00;
        } else if (hotel.contains("Vebma")) {
            valor = 1500.00;
        }

        result += "O valor da reserva no hotel foi de R$" + valor + "\n";
        return result;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
}
