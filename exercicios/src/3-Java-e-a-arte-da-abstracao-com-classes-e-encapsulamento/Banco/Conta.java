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
    saldo += valor;
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
    System.out.println("Digite o codigo do boleto:");
    String codigo = System.console().readLine();
    System.out.println("Digite o valor do boleto:");
    valor = Double.parseDouble(System.console().readLine());
    if(valor <= saldo + limiteChequeEspecial){
      saldo -= valor;
    }
  }
  
}