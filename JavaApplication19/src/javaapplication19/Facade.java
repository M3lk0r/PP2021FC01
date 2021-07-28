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
public class Facade {

    protected Pagamento pagamento;
    protected Passagem passagem;
    protected Hotel hotel;
    protected Carro carro;

    public Facade(Pagamento pagamento, Passagem passagem, Hotel hotel, Carro carro) {
        this.pagamento = pagamento;
        this.passagem = passagem;
        this.hotel = hotel;
        this.carro = carro;
    }

    public String realizarCompraPacoteViagem(String lugar, String hotelEscolhido, String carroEscolhido, int quantidadeDias) {
        String result = "Ola, seja bem-vindo(a)!\n";
        result += this.passagem.reservaPassagem(lugar);
        result += this.hotel.reservaHotel(hotelEscolhido);
        result += this.carro.reservaCarro(carroEscolhido, quantidadeDias);
        result += this.pagamento.receberPagamento();

        result += "\nAgradecemos pela preferencia!";
        return result;
    }
}
