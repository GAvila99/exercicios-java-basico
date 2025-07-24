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
               // case 4:
               //     exercicio4(input);
                default:
                    break;
            } 
        }while (opcao != 0);
        System.out.println("\n=============== PROGRAMA ENCERRADO! ==============="); 
        input.close();
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
        System.out.println("Insira um numero: ");
        int number1 = Integer.parseInt(input.nextLine());
        System.out.println("Insira um numero maior: ");
        int number2 = Integer.parseInt(input.nextLine());
        while (number2 < number1) {
            System.out.println("Insira um numero maior: ");
            number2 = Integer.parseInt(input.nextLine());
        }
        System.out.println("Escoha para listar par ou impar: ");
        String imparOuPar = input.nextLine().toLowerCase();
        switch (imparOuPar) {
            case "impar":
                
                break;
            
            case "par":

                break;
            default:
                break;

        }

        public void verificador (num1; num2; valor){
            for (int i = num1; i <= num2; i++){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        }

}
