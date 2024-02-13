import java.util.Scanner;

public class Banco {


    private String nome;
    public double saldo;

    public Banco(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Banco() {

    }

    public String getNome() {
        return nome;
    }

    public double getsaldo() {
        return saldo;
    }

    public double saldo() {
        return saldo;
    }

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println(" digite seu nome: ");
        String nome = leitura.nextLine();
        System.out.println("digite seu saldo atual na conta: ");
        double saldo = leitura.nextDouble();
        System.out.println(saldo);
        
        int opcao = 0;
        
        do {
            System.out.println(" digite a opção que deseja: ");
            System.out.println("1 - ver saldo atual: ");
            System.out.println("2- transferir valor: ");
            System.out.println("3- receber um deposito: ");
            System.out.println("4- verificar se o saldo é suficiente para uma compra: ");
            System.out.println("5- encerrar operação ");
            System.out.println("6- projeto futuro");

            opcao = leitura.nextInt();

            switch (opcao) {

            case 1:

                    System.out.println( nome + " seu saldo atual é: " + saldo);
                    break;

                case 2:
                    System.out.println(" digite o valor que deseja transferir: ");
                    double valorTransferido = leitura.nextDouble();
                    if (valorTransferido > saldo) {
                        System.out.println(" saldo insuficiente para operação");
                    } else {
                        System.out.println("o valor transferido foi de: " + valorTransferido);
                        saldo -= valorTransferido;
                        System.out.println(" o saldo atual é de: " + saldo);
                    }
                    break;

                case 3:
                    System.out.println("digite o valor que vai receber: ");
                    double valorDeposito = leitura.nextDouble();
                    saldo += valorDeposito;
                    System.out.println(" o valor atual do seu saldo é: " + saldo);
                    break;

                case 4:
                    SistemaParcelamento parcela = new SistemaParcelamento();
                    parcela.verificacaoSaldo();
                    break;

            }

          } while ( opcao != 5);
            System.out.println("programa encerrado");
    }



    }
