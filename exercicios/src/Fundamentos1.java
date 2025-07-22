package exercicios.src;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Fundamentos1 {
    public static void main (String[] argb){
        int anoAtual = OffsetDateTime.now().getYear();
        Scanner input = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = input.nextLine();
        System.out.println("Qual ano de nascimento?");
        int ano = Integer.parseInt(input.nextLine());
        System.out.printf("Ola %s, voce tem %d anos!",nome, (anoAtual-ano));
        input.close();
        }
}
