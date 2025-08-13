import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    Maquina maq = new Maquina(false, 0, 0);
    int opcao = 10;
    do{
    acoes();
    opcao = Integer.parseInt(input.nextLine());  
    System.out.println("");

        switch (opcao) {
            case 1:
                maq.darBanho();
                break;
            case 2:
                maq.abastecerAgua();
                break;
            case 3:
                maq.abastecerShampoo();
                break;
            case 4:
                maq.verificarAgua();
                break;
            case 5:
                maq.verificarShampoo();
                break;
            case 6:
                maq.verificarPet()
                break;
            case 7:
                maq.colocarPet();
                break;
            case 8:
                maq.retirarPet();
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