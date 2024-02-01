/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabanco;

public class Conta {
    public int numConta;  
    protected String tipo;
    private String dono; 
    private float saldo; 
    private boolean status; 

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
  
    public void abrirConta(int numeroConta, String tipo, String nome) {
        this.setTipo(tipo);
        this.setNumConta(numeroConta);
        this.setDono(nome);
        if(this.status == true) {
            System.out.println("Conta já se encontra aberta");
        }else {
            if(this.tipo == "CC"){
                this.setSaldo(50);
                this.status = true;
                System.out.println("Conta CC aberta com sucesso");
            }else if(this.tipo == "CP"){
                this.setSaldo(150);
                this.status = true;
                System.out.println("Conta CP aberta com sucesso");
            }else {
                System.out.println("Tipo não foi informado de maneira correta!");
            }
        }
    }
    
    public void fecharConta() {
        if(this.saldo > 0) {
            System.out.println("A conta contem dinherio");
        }else if(this.saldo < 0) {
            System.out.println("A conta de dividas pendentes!");
        }else if(this.status = false) {
            System.out.println("Conta já se encontra fechada!");
        }else {
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void despositar(float valor) {
        if(this.status == false) {
            System.out.println("Deve-se abrir uma conta primeiro");
        }else {
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso");
        }
    }
    
    public void sacar(float valor) {
        if(this.status == false) {
            System.out.println("Deve-se abrir uma conta primeiro");
        }else if(this.saldo < valor) {
            System.out.println("Valor maior que o corespondente na conta!");
        }else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }
    
    public void pagarMensalidade() {
        float valorMensal;
        if(this.tipo == "CC"){
            valorMensal = 12;
        }else {
            valorMensal = 20;
        }
        
        if(this.status = false){
            System.out.println("Deve se abrir uma conta primeiro");
        }else if(this.saldo < valorMensal){
            System.out.println("Saldo insuficiente para pagamento!");
        }else {
            this.saldo -= valorMensal;
            System.out.println("Pagamento realizado com sucesso: R$" + valorMensal);
        }
    }
    
    public void status() {
        System.out.println("------------------------------");
        System.out.println("Informacoes sobre a conta!!");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}
