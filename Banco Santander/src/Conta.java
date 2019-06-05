public class Conta extends Cliente {

    //utilizo a super para pegar o contrutor da classe abstrata
    public Conta(String titular) {
        super(titular);
    }

    double saldo;


    //Metodos da classe Conta

    public void DadosBancarios(){ //printa todos os dados do titular
        System.out.println(" ");
        System.out.println("-- Dados Bancarios --");
        System.out.println("- Titular = " + this.getTitular());
        System.out.println("- RG = " + this.getnRG());
        System.out.println("- Saldo = " + saldo);
        System.out.println("-- Fim dos Dados Bancarios -- ");
        System.out.println(" ");
    }



    public void Depositar(double pValor){ // apos digitar o valor add ele a os dados bacarios
        System.out.println(" ");
        System.out.println("-- Realizando Deposito --");
        System.out.println("Saldo Anterior = " + this.saldo);

        this.saldo += pValor; //this.saldo = this.saldo + pValor; soma o saldo com o valor passado

        System.out.println("- Saldo Atual = " + this.saldo);
        System.out.println("-- Fim do Deposito --");
        System.out.println(" ");
    }

    public void Saque(double pValor){ // apos digitar um valor se esse valor for > ou = saldo, ele retira o valor dos dados bancarios
        System.out.println(" ");
        System.out.println("-- Realizando Saque --");
        System.out.println("- Saldo Anterior = " + this.saldo);

        if(pValor <= this.saldo) {// Se tiver um saldo menor ou igual a o Saque, realizara o Saque
            this.saldo -= pValor;
            System.out.println("-- Saldo Atual = " + this.saldo);
        } else {// Caso nao tenha um saque maior que o saldo
            System.out.println("--- Saldo Insuficiente para o Saque ---");
        }
        System.out.println("-- Fim do Saque --");
        System.out.println(" ");
    }
}
