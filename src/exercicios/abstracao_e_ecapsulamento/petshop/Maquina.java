package exercicios.abstracao_e_ecapsulamento.petshop;

public class Maquina{
  private boolean vagaLivre;
  private int shampoo;
  private int agua;
  private boolean maquinaSuja; 
    private boolean petLimpo;

  public Maquina(boolean vagaLivre, int shampoo, int agua, boolean maquinaSuja, boolean petLimpo){
      this.vagaLivre = true;
      this.shampoo = 0;
      this.agua = 0;
      this.maquinaSuja = false;
      this.petLimpo = false;
  }
    //da banho no pet se tiver pet na maquina, agua e shampoo suficiente e maquina nao estiver suja
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
       if(maquinaSuja == true){
           System.out.println("Maquina suja...\n");    
       }
       if(petLimpo == true){
           System.out.println("Pet já está limpo...\n");
       }
       if(vagaLivre == false && agua >= 3 && shampoo >= 1 && maquinaSuja == false && petLimpo == false){
           System.out.println("Dando banho no pet...\n");
           this.agua = this.agua - 10;
           this.shampoo = this.shampoo - 2;
           this.maquinaSuja = false;
           this.petLimpo = true;
       }
   }
        
    
   
  //abastece com agua 
  public void abastecerAgua(){
      if (this.agua + 2 > 30){
          System.out.println("Nivel maximo de agua atingido...\n");
      }else{
          System.out.println("Abasteceu com agua...\n");
          this.agua = this.agua + 2;
      }
  }

  //abastece com shampoo 
  public void abastecerShampoo(){
      if (this.shampoo + 2 > 10){
          System.out.println("Nivel maximo de shampoo atingido...\n");
      }else{
          System.out.println("Abasteceu com shampoo...\n");
          this.shampoo = this.shampoo + 2;
      }
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

  //coloca pet na maquina se tiver vaga e maquina nao estiver suja
  public void colocarPet(){
      if(this.vagaLivre == false){
          System.out.println("Já tem pet na maquina...\n");
      }
      if(this.maquinaSuja == true){
          System.out.println("Maquina suja...\n");
      }
      if(this.vagaLivre == true && this.maquinaSuja == false){
          System.out.println("Colocou o pet na maquina...\n");
          this.vagaLivre = false;
      }
  }

  //retira pet da maquina
  public void retirarPet(){
      if(vagaLivre == true){
          System.out.println("Não tem pet na maquina...\n");
      }else{
          if(petLimpo == false){
              System.out.println("Pet não está limpo...\n");
              System.out.println("Retirou o pet da maquina...\n");
              this.maquinaSuja = true;
          }else{
            System.out.println("Retirou o pet da maquina...\n");
            this.petLimpo = false;
            this.vagaLivre = true;
          }
      }
  }

  //limpa a maquina
  public void limparMaquina(){
      if(this.agua - 3 < 0){
          System.out.println("Não tem agua suficiente...\n");
      }
      if(this.shampoo - 1 <= 0){
          System.out.println("Não tem shampoo suficiente...\n");
      }
      if(vagaLivre == false){
          System.out.println("Tem pet na maquina...\n");        
      }
      if(maquinaSuja == false){
          System.out.println("Maquina não está suja...\n");
      }
      if(this.agua >= 3 && this.shampoo >= 1 && this.vagaLivre == true && this.maquinaSuja == true){
          System.out.println("Limpando a maquina...\n");
          this.agua = this.agua - 3;
          this.shampoo = this.shampoo - 1;
          this.maquinaSuja = false;
      }
  }        
}