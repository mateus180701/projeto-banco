import java.util.Scanner;

public class SistemaParcelamento extends Banco {

    private double valorCompra;

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }


    public void verificacaoSaldo(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("digite o valor da sua compra: ");
        valorCompra = leitura.nextDouble();

        if (super.getsaldo() <= this.getValorCompra()){
            System.out.println("saldo insuficiente para efetuar a compra! ");
        } else {
            System.out.println(" compra pode ser efetuada! ");}

    }
}