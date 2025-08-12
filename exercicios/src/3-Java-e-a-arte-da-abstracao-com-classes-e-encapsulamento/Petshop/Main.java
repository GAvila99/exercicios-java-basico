import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    Maquina maq = new Maquina(false);
    int opcao = 10;
    do{
    acoes();
    opcao = Integer.parseInt(input.nextLine());  
    System.out.println("");

        switch (opcao) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:

                break;
            case 8:

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
        1. Dar banho no pet
        2. Abastecer com água
        3. Abastecer com shampoo
        4. verificar nivel de água
        5. verificar nivel de shampoo
        6. verificar se tem pet no banho
        7. colocar pet na maquina
        8. retirar pet da máquina
        0. limpar maquina
        Sua escolha: """);
    }
}