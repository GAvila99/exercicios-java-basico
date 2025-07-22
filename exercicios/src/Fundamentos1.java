package exercicios.src;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Fundamentos1 {
    public static void main (String[] args){
        // Obtém o ano atual do sistema:
        // OffsetDateTime.now() pega a data e hora atual com fuso horário,
        // getYear() extrai apenas o ano dessa data.
        int anoAtual = OffsetDateTime.now().getYear(); // pega
        Scanner input = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = input.nextLine();
        System.out.println("Qual ano de nascimento?");
        int ano = Integer.parseInt(input.nextLine());
        System.out.printf("Ola %s, voce tem %d anos!",nome, (anoAtual-ano));
        input.close();
        }
}
