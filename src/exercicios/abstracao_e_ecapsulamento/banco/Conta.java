package exercicios.abstracao_e_ecapsulamento.banco;

public class Conta{
  private String nome;
  private double limiteChequeEspecial;
  private double saldo;
  

  public Conta(String nome, double saldo, double limiteChequeEspecial){
    this.nome = nome;
    this.limiteChequeEspecial = limiteChequeEspecial;
    this.saldo = saldo;   
  }
  //metodo para obter o nome
  public String getNome(){
    return nome;
  }
  //metodo para obter o saldo
  public double getSaldo(){
    return saldo;
  }
  //metodo para obter o limite do cheque especial
  public double getLimiteChequeEspecial(){
    return limiteChequeEspecial;
  }
  //metodo para alterar o nome
  public void setNome(String nome){
    this.nome = nome;
  }
  //metodo para alterar o limite do cheque especial
  public void setLimiteChequeEspecial(double limiteChequeEspecial){
    this.limiteChequeEspecial = limiteChequeEspecial;
  }
  //exibicao dos dados
  public String toString(){
    return "Nome: " + nome + "\nSaldo: " + saldo + "\nLimite Cheque Especial: " + limiteChequeEspecial +"\n";
  }

  //metodo para depositar dinheiro
  public void depositar(double valor){
    if (saldo < 0){
      double juros = (saldo/100)*20;
      double devido = saldo;
      System.out.printf("Dinheiro depositado: %.2f\n",valor);
      System.out.printf("Abatimento: %.2f\n",devido+juros);
      saldo = valor + (devido + juros);
    }else{
      System.out.printf("Dinheiro depositado: %.2f\n",valor);
      saldo += valor;
    }
  }
  //exibe total disponivel
  public String exibirChequeEspecial(){
    return "Cheque especial: " + (limiteChequeEspecial + saldo) + "\n";
  }

  //metodo para sacar dinheiro
  public void sacar(double valor){
    if(valor <= saldo + limiteChequeEspecial){
      saldo -= valor;
    }else{
      System.out.println("Saldo insuficiente!");
    }
  }

  // metodo para pagar boleto
  public void pagarBoleto(double valor){
    if(valor <= saldo + limiteChequeEspecial){
      saldo -= valor;
    }
  }
  
}