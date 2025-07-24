package exercicios.src;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Fundamentos {
    public static void main (String[] args){
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
                case 4:
                    exercicio4(input);
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

    public static void exercicio1 (Scanner input){
            // Obtém o ano atual do sistema:
            // OffsetDateTime.now() pega a data e hora atual com fuso horário,
            // getYear() extrai apenas o ano dessa data.
            int anoAtual = OffsetDateTime.now().getYear(); // pega
            System.out.println("Qual seu nome?");
            String nome = input.nextLine();
            System.out.println("Qual ano de nascimento?");
            int ano = Integer.parseInt(input.nextLine());
            System.out.printf("Ola %s, voce tem %d anos!",nome, (anoAtual-ano));
        }
    
    public static void exercicio2 (Scanner input){
        System.out.print("Lado do Quadrado: ");
        double lado = Double.parseDouble(input.nextLine());
        System.out.print("Altura do Quadrado: ");
        double altura = Double.parseDouble(input.nextLine());
        System.out.printf("\n fómula: %.2f X %.2f = %.2fm\u00b2", lado, altura, (lado*altura));
        input.close();
    }

    public static void exercicio3 (Scanner input){
        System.out.print("Base do retangulo: ");
        double base = Double.parseDouble(input.nextLine());
        System.out.print("Altura do retangulo: ");
        double altura = Double.parseDouble(input.nextLine());
        System.out.printf("\n fómula: %.2f X %.2f = %.2fm\u00b2", base, altura, (base*altura));
        input.close();
    }

    public static void exercicio4 (Scanner input){
        System.out.print("Informe seu nome: ");
        String nome1 = input.nextLine();
        System.out.print("Informe sua idade: ");
        int idade1 = Integer.parseInt(input.nextLine());
        System.out.print("Informe outro nome: ");
        String nome2 = input.nextLine();
        System.out.print("Informe outra idade: ");
        int idade2 = Integer.parseInt(input.nextLine());
        int diferenca = Math.abs(idade1 - idade2);
        System.out.printf("A diferença de idade de %s para %s é de %d anos", nome1, nome2, diferenca);
    }

}
