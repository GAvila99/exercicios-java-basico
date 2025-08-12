import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    Carro carro = new Carro(false, 0, 0);
    int opcao = 10;
    do{
    acoes();
    opcao = Integer.parseInt(input.nextLine());  
    System.out.println("");
    if (opcao == 0){
        opcao = carro.getLigaCarro() ? 0 : 10;
        opcao ? System.out.println("Saiu do carro...") : System.out.println("Carro ligado...");
    }
    
        switch (opcao) {
            case 1:
                carro.ligaCarro();
                break;
            case 2:
                carro.mudarVelocidade(opcao);
                break;
            case 3:
                carro.mudarVelocidade(opcao);
                break;
            case 4:
                carro.virarCarro(opcao);
                break;
            case 5:
                carro.virarCarro(opcao);
                break;
            case 6:
                carro.mudarMarcha(opcao);
                break;
            case 7:
                carro.mudarMarcha(opcao);
                break;
            case 8:
                carro.mostrarStatus();
                break;
            case 0:
                opcao = 0;
                break;
            default:
                break;
        }
    }while(opcao != 0);


    input.close();
    }


    public static void acoes(){
        System.out.print("""
        1. Ligar/Desligar Carro
        2. Acelerar
        3. Desacelerar
        4. Dobrar a Esquerda
        5. Dobrar a Direita
        6. Passar Marcha
        7. Voltar Marcha
        8. Olhar Staus do Carro
        0. Sair do Carro
        Sua escolha: """);
    }
}