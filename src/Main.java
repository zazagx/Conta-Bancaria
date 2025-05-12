import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int respostaRecebida = 0;
        double saldo = 2500.00;
        double valorReceber;
        double valorTransfer;
        System.out.println("****************************************" +
                "\n\nNome: Isaac Gomes" +
                "\nTipo de conta: Corrente" +
                "\nSaldo Atual: " + "R$" + saldo +
                "\n\n****************************************");

        while(respostaRecebida != 4) {
            System.out.println("\nOperações" +
                    "\n1-Consultar Saldos" +
                    "\n2-Receber Valor" +
                    "\n3-Transferir Valor" +
                    "\n4-Sair");
            System.out.println("Digite a operação desejada: ");
            respostaRecebida = read.nextInt();

            if (respostaRecebida == 1) {
                System.out.println("\n****************************************"+
                        "\nSaldo atual: " + saldo +
                        "\n****************************************");
            }
            if (respostaRecebida == 2) {
                System.out.println("\n****************************************"+
                        "\nValor a receber: ");
                valorReceber = read.nextDouble();
                saldo = saldo + valorReceber;
                System.out.println("Saldo atual: " + saldo
                + "\n****************************************");
            }
            if (respostaRecebida == 3) {
                System.out.println("\n****************************************"+
                        "\nValor a transferir: ");
                valorTransfer = read.nextDouble();
                saldo = saldo - valorTransfer;
                System.out.println("Saldo atual: " + saldo
                + "\n****************************************");
            }
            if (respostaRecebida == 4) {
                System.out.println("\n****************************************" +
                        "\nObrigado! Até logo!" +
                        "\n****************************************");
            }
            if(respostaRecebida > 4 || respostaRecebida <= 0){
                System.out.println("Valor invalido!");
            }
        }







    }
}