
import java.util.Scanner;

public class Maquina {
    public static void main(String[] args) {
        // cria um objeto Scanner, e um objeto para capturar o que o sera digitado no terminal
        Scanner in = new Scanner(System.in);
        String aux;
        int opcao;
        double valor;

        //inicia o programa pedindo o nome do titular
        System.out.println("Digite o nome do Titular: ");
        aux = in.nextLine();

        //Crio um objeto da classe Conta, como a classe Conta esta dentro da classe abstrata Cliente
        Conta c1 = new Conta(aux);


        //Apos ter um objeto da classe conta e possivel utilizar os metodos que criamos
        do{ // cria um menu com 4 opcoes possiveis
            System.out.println("--- MENU ---");
            System.out.println("1) Dados Bancarios");
            System.out.println("2) Deposito");
            System.out.println("3) Saque");
            System.out.println("0) Finalizar");

            System.out.print("Opcao: ");
            opcao = in.nextInt();

            if(opcao == 1){ // se a primeira opcao for selecionada chama o metodo DadosBancarios
                c1.DadosBancarios();
            }else if(opcao == 2){// se a segunda opcao for selecionada solicita um valor e depois chama o metodo Depositar
                System.out.println("Digite o valor do Deposito: ");
                valor = in.nextDouble();
                c1.Depositar(valor);
            }else if(opcao == 3){ // se a terceira opcao dor selecionada solicita um valor e chama o metodo Saque
                System.out.println("Digite o valor do Saque: ");
                valor = in.nextDouble();
                c1.Saque(valor);
            }

        }while (opcao != 0);
    }
}
