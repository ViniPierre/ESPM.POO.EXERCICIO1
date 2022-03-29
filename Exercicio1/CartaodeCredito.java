package Exercicio1;

public class CartaodeCredito {
    int numero;
    double totalFatura;


    public double consultarFatura() {
        return totalFatura;
    }

    public String retornarDados() {
        return "Numero do cartão: " + numero + "\n Total fatura: " +totalFatura;
    }

}
