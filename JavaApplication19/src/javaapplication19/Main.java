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
public class Main {

    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento();
        Passagem passagem = new Passagem();
        Hotel hotel = new Hotel();
        Carro carro = new Carro();

        Facade facade = new Facade(pagamento, passagem, hotel, carro);
        System.out.println(facade.realizarCompraPacoteViagem("Veneza", "Cristal", "Ford Ka", 4));
    }
}
