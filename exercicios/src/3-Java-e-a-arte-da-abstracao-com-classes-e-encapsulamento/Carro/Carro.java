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
        if (!this.ligaCarro) {
            // Tenta ligar o carro
            if (this.marcha == 0) {
                this.ligaCarro = true;
                System.out.println("\nVROMMMMMM... Carro ligado!");
            } else {
                System.out.println("\n[AVISO] O carro deve estar em PONTO MORTO para ligar.");
            }
        } else {
            // Tenta desligar o carro
            if (this.velocidade == 0 && this.marcha == 0) {
                this.ligaCarro = false;
                System.out.println("\nVROOOOOM-SHHHH... Carro desligado.");
            } else {
                System.out.println("\n[AVISO] O carro deve estar PARADO e em PONTO MORTO para desligar.");
            }
        }
        System.out.println("");
    }
    
    //verifica se o acrro esta ligado, depois passa a marcha
    public void mudarMarcha(int opcao){
        if (!this.ligaCarro) {
            System.out.println("\n[AVISO] O carro precisa estar ligado para mudar a marcha.");
            return;
        }

        if (opcao == 6) { // aumentar a marcha
            if (this.marcha < 6) {
                this.marcha++;
                if(this.marcha == 0){
                     System.out.println("\nMarcha: Ponto Morto");
                } else {
                     System.out.printf("\nEngatou a %dª Marcha.\n", this.marcha);
                }
            } else {
                System.out.println("\n[AVISO] Já está na marcha mais alta (6ª).");
            }
        } else { // reduzir a marcha
            if (this.marcha > 0) {
                this.marcha--;
                 if(this.marcha == 0){
                     System.out.println("\nMarcha: Ponto Morto");
                } else {
                    System.out.printf("\nReduziu para a %dª Marcha.\n", this.marcha);
                }
            } else {
                System.out.println("\n[AVISO] Já está em Ponto Morto.");
            }
        }
        System.out.println("");
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
        System.out.println("");
    }
    
    //acelera e desacelera o carro
    public void mudarVelocidade(int opcao) {
        if (this.ligaCarro) {
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
        }else if (!this.ligaCarro) {
            System.out.println("O carro deve estar ligado para mudar a velocidade.");
            if (this.marcha == 0) {
                System.out.println("Não é possível mudar de velocidade em Ponto Morto. Passe a marcha.");
            }
            
        }
        System.out.println("");
    }

    //mostra status do carro
    public void mostrarStatus() {
        System.out.println("\n--- STATUS DO CARRO ---");
        System.out.println("Ignição: " + (this.ligaCarro ? "Ligado" : "Desligado"));
        System.out.println("Velocidade: " + this.velocidade + " km/h");
        if (this.marcha == 0) {
            System.out.println("Marcha: Ponto Morto");
        } else {
            System.out.println("Marcha: " + this.marcha + "ª");
        }
        System.out.println("-----------------------");
        System.out.println("");
    }

    public boolean getLigaCarro(){
        return this.ligaCarro;
    }

}