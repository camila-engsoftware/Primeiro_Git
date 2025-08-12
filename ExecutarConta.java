import java.util.Scanner;

public class ExecutarConta{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Conta a1 = new Conta();
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite seu saldo: ");
        int saldo = entrada.nextInt();
        
        a1.setSaldo(saldo);

        a1.banco = ("Bradesco");
        a1.compra = 300;
                
        a1.getSaldoFinal();

        System.out.println("Nome: " + nome + "Banco: " + a1.banco + "Compra: " + a1.getCompra() + "Saldo: " + a1.getSaldo());
        
        System.out.println("Saldo final: " + a1.getSaldoFinal());

        entrada.close();
    }
}