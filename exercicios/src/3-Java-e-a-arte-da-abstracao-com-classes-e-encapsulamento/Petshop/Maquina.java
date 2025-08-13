public class Maquina{
  private boolean vagaLivre;
  private int shampoo;
  private int agua;

  public Maquina(boolean vagaLivre, int shampoo, int agua){
      this.vagaLivre = true;
      this.shampoo = 0;
      this.agua = 0;
  }
    //da banho no pet se tiver pet na maquina, agua e shampoo
   public void darBanho(){
       if(vagaLivre == true){
           System.out.println("Não tem pet na maquina...\n");
       }
       if(agua < 3){
           System.out.println("Não tem agua suficiente...\n");
       }
       if(shampoo < 1){
           System.out.println("Não tem shampoo suficiente...\n");
       }
       if(vagaLivre == false && agua >= 3 && shampoo >= 1){
           System.out.println("Dando banho no pet...\n");
           this.agua = this.agua - 3;
           this.shampoo = this.shampoo - 1;
       }
   }
    
    
   
  //abastece com agua
  public void abastecerAgua(){
       this.agua = this.agua + 2;
  }

  //abastece com shampoo
  public void abastecerShampoo(){
       this.shampoo = this.shampoo + 2;
  }

  //verifica se tem pet na maquina
  public void verificarPet(){
      if(vagaLivre == true){
          System.out.println("Não tem pet na maquina...\n");
      }else{
          System.out.println("Tem pet na maquina...\n");
      }
  }

  //verifica nivel agua
  public void verificarAgua(){
    System.out.println("Nivel de agua: " + this.agua + "L\n");
  }

  //verifica nivel shampoo
  public void verificarShampoo(){
    System.out.println("Nivel de shampoo: " + this.shampoo + "L\n");
  }

  //coloca pet na maquina
  public void colocarPet(){
      if(vagaLivre == true){
          System.out.println("Colocou o pet na maquina...\n");
          this.vagaLivre = false;
      }else{
          System.out.println("Já tem pet na maquina...\n");
      }
  }

  //retira pet da maquina
  public void retirarPet(){
      if(vagaLivre == true){
          System.out.println("Não tem pet na maquina...\n");
      }else{
          System.out.println("Retirou o pet da maquina...\n");
      }
  }

  //limpa a maquina
  public void limparMaquina(){
      this.agua = this.agua - 3;
      this.shampoo = this.shampoo - 1;
  }
}