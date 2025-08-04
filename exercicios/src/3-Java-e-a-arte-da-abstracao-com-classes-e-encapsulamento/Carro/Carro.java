public class Carro{
    private boolean ligaCarro;
    private int marcha;
    private int velocidade;

    public Carro(boolean LigaCarro, int velocidade, int marcha){
        this.ligaCarro = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    //ligaa e desliga o carro, verifica se esta em ponto morto antes de desligar
    public void ligaCarro(){
        if(marcha == 0){
            if(ligaCarro == false){
                this.ligaCarro = true;
                System.out.println("""
                \nVROMMMMMM
                Carro ligado...
                """);
            }else{
                if(marcha == 0){
                    this.ligaCarro = false;
                    System.out.println("""
                    VROOOOOM-SHHHH
                    Carro desligado..  
                    """);
                }else{
                    System.out.println("O carro deve esta em PONTO MORTO para desligar...");
                }
                
            }
        }else{
            System.out.println("O Carro deve esta em ponto morto...");
        }
    }
    
    //verifica se o acrro esta ligado, depois passa a marcha
    public void mudarMarcha(int opcao){
        if(ligaCarro == true){
            if(opcao == 6){
                if(marcha <= 6){
                    this.marcha++;
                    System.out.printf("Engatou a %d\u00b0 Marcha\n", this.marcha);
                }else{
                    System.out.println("O Carro a esta em ponto Morto...");
                }
            }else if(opcao == 7){
                if(marcha > 0){
                    this.marcha--;
                    System.out.printf("Engatou a %d\u00b0 Marcha\n", this.marcha);
                }else{
                    
                }
            }
        }else{
            System.out.println("O Carro deve estar ligado...");
        }
    }

    //muda direcao se estiver andando(velocidade > 0) 
    public void virarCarro(int opcao){
        if(ligaCarro == true){
            if(velocidade > 0){
                if (opcao == 4){
                    System.out.println("Dobrou a squerda...\n");
                }else if (opcao == 5){
                    System.out.println("Dobrou a Direita...\n");
                }
            }else{
                System.out.println("O Carro esta parado...");
            }
        }else{
            System.out.println("Carro desligado...");
        }
    }
    

    public void mudarVelocidade(int opcao){
        if (opcao == 2){
            if(marcha)
        }else if(opcao == 3){

        }
    }
    

}