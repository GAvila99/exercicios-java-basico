package exercicios.src;

import java.util.Scanner;

public class Estruturas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int opcao;
        do{
            opcao = menu(input);       
            switch (opcao) {
                case 1:
                    exercicio1(input);                    
                    break;
                case 2:
                    exercicio2(input);
                    break;
                case 3:
                    exercicio3(input);
                    break;
                case 4:
                    exercicio4(input);
                    break;
                default:
                    break;
            } 
        }while (opcao != 0);
        System.out.println("\n=============== PROGRAMA ENCERRADO! ==============="); 
        input.close();
    }
    
 

    public static void exercicio1(Scanner input){
        System.out.print("Digite um numero: ");
        int number = Integer.parseInt(input.nextLine());
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", number, i, number * i);
        } 
    }

    public static void exercicio2(Scanner input){
        System.out.print("Digite sua altura: ");
        float altura = Float.parseFloat(input.nextLine());
        System.out.print("Digite sua peso: ");
        float peso = Float.parseFloat(input.nextLine());
        float imc = peso / (altura * altura);
        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        }else if(imc >= 18.6 & imc <= 24.9){
            System.out.println("Peso ideal");
        }else if(imc >= 25 & imc <= 29.9){
            System.out.println("Levemente acima do peso");
        }else if(imc >= 30 & imc <= 34.9){
            System.out.println("Obesidade Grau II (Severa)");
        }else if(imc >= 35 & imc <= 39.9){
            System.out.println("Obesidade Grau I");
        }else{
            System.out.println("Obesidade III (Mórbida)");
        }   
    }

    public static void exercicio3(Scanner input){
        Estruturas str = new Estruturas();
        System.out.print("Insira um numero: ");
        int number1 = Integer.parseInt(input.nextLine());
        System.out.print("Insira um numero maior: ");
        int number2 = Integer.parseInt(input.nextLine());
        while (number2 < number1) {
            System.out.print("Insira um numero maior: ");
            number2 = Integer.parseInt(input.nextLine());
        }
        System.out.println("Escoha para listar par ou impar: ");
        String imparOuPar = input.nextLine().toLowerCase();
        switch (imparOuPar) {
            case "impar":
                str.verificadorDeNumero(number1, number2, "impar");
                break;
            
            case "par":
                str.verificadorDeNumero(number1, number2, "par");
                break;
            default:
                break;

        }        
    }

    public static void exercicio4(Scanner input){
        System.out.print("Informe um numero: ");
        int numeroInicial = Integer.parseInt(input.nextLine());
         int numeroInformado;   
        do{ 
            System.out.print("Informe outro numero: ");
            numeroInformado = Integer.parseInt(input.nextLine());
            while(numeroInformado < numeroInicial){        
                    System.out.print("Informe outro numero: ");        
                    numeroInformado = Integer.parseInt(input.nextLine());
                }
            System.out.printf("%d X %d = %d | Resta: %d\n",numeroInformado, numeroInicial, numeroInformado/numeroInicial, numeroInformado%numeroInicial);
        }while(numeroInformado%numeroInicial != 0);   
    }

   public static int menu(Scanner input){
        System.out.println("\n=============== MENU ==============="); 
        System.out.println("1. EXERCICIO 1");
        System.out.println("2. EXERCICIO 2");
        System.out.println("3. EXERCICIO 3");
        System.out.println("4. EXERCICIO 4");
        System.out.println("0. SAIR");   
        System.out.print("Selecione a opcao desejada: ");
        int opcao = Integer.parseInt(input.nextLine());
        return opcao;
    }
    
    public void verificadorDeNumero (int num1, int num2, String valor){
        for (int i = num1; i <= num2; i++){
            if(valor.equals("par")){    
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
            if(valor.equals("impar")){    
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }
    }
}
