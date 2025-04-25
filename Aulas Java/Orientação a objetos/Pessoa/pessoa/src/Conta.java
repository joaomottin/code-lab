public class Conta {
    public int numConta;
    public String titular;
    public float saldo;

    public Conta(int numConta, String titular, int saldo){
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = 0f;
    }

    public void depositar (float valor){
        if (valor > 0) saldo += valor;
    }

    public boolean sacar (float valor){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }
    public String imprimir(){
        return "O saldo da conta é R$ " + saldo;
    }
}
