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
    

    public void mudarVelocidade(int opcao) {
        if (!this.ligaCarro) {
            System.out.println("O carro deve estar ligado para mudar a velocidade.");
            return;
        }

        if (this.marcha == 0) {
            System.out.println("Não é possível acelerar em Ponto Morto. Passe a marcha.");
            return;
        }

        int limiteMax;
        int limiteMin;

        // define os limites de velocidade com base na marcha
        switch (this.marcha) {
            case 1: limiteMin = 0; limiteMax = 20; break;
            case 2: limiteMin = 21; limiteMax = 40; break;
            case 3: limiteMin = 41; limiteMax = 60; break;
            case 4: limiteMin = 61; limiteMax = 80; break;
            case 5: limiteMin = 81; limiteMax = 100; break;
            case 6: limiteMin = 101; limiteMax = 120; break;
            default: limiteMin = 0; limiteMax = 0; break;
        }

        if (opcao == 2) { // acelerar
            if (this.velocidade < 120) {
                if (this.velocidade + 1 <= limiteMax) {
                    this.velocidade++;
                    System.out.printf("Velocidade atual: %d km/h\n", this.velocidade);
                } else {
                    System.out.printf("Para ir mais rápido, passe para a %d\u00b0 marcha.\n", this.marcha + 1);
                }
            } else {
                System.out.println("Velocidade máxima atingida (120 km/h).");
            }
        } else if (opcao == 3) { // desacelerar
            if (this.velocidade > 0) {
                if (this.velocidade - 1 >= limiteMin) {
                    this.velocidade--;
                    System.out.printf("Velocidade atual: %d km/h\n", this.velocidade);
                } else {
                    System.out.printf("Para ir mais devagar, volte para a %d\u00b0 marcha.\n", this.marcha - 1);
                }
            } else {
                System.out.println("O carro já está parado.");
            }
        }
    }
    

}