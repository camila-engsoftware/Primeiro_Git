//criação da classe e atributos dos objetos
public class Conta { 
    
    private String nome;
    public String banco;
    public int compra;
    private int saldo;
    private int saldoFinal;

    // construtor (define como criar os objetos)
    public Conta(String nome, String banco, int compra, int saldo) {
        this.nome = nome;
        this.banco = banco;
        this.compra = compra;
        setSaldo(saldo);     
    }
    public Conta(){
    }
    // encapsulamento
    public String getNome(){
        return nome;
    }
    public String getBanco(){
        return banco;
    }
    public int getCompra(){
        return compra;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        if (saldo<0) {
            System.out.println("Saldo negativo em: " + saldo);
        } else {
            this.saldo = saldo;
            }
    }
    public void calcularSaldo (){
        saldoFinal = saldo - compra;
        System.out.println("Saldo final de: " + saldoFinal);
    }
    public int getSaldoFinal(){
        return saldoFinal;
    }   
}