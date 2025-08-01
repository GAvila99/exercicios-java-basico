public classe Conta{
  private String nome;
  private double depositoInicial;
  private double limiteChequeEspecial;

  public Conta(String nome, double depositoInicial, double limiteChequeEspecial){
    this.nome = nome;
    this.depositoInicial = depositoInicial;
    this.limiteChequeEspecial = limiteChequeEspecial;
  }
  public String getNome(){
    return nome;
  }
  public double getDepositoInicial(){
    return depositoInicial;
  }
  public double getLimiteChequeEspecial(){
    return limiteChequeEspecial;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  
}