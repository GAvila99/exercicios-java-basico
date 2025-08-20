package exercicios.abstracao_e_ecapsulamento.banco;

import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Bem vindo ao banco!"); 
    System.out.print("Digite o nome do titular: ");
    String nome = input.nextLine();
    System.out.print("Digite o deposito inicial: ");
    double saldo = Double.parseDouble(input.nextLine());
    double limiteChequeEspecial = definirLimiteChequeEspecial(saldo);
    Conta conta = new Conta(nome, saldo, limiteChequeEspecial);
    
    double valor;
    int opcao;
    do{
      exibirMenu();
      opcao = Integer.parseInt(input.nextLine());
      switch(opcao){
        case 1:
          System.out.printf("Saldo: %.2f\n",conta.getSaldo());
          break;
        case 2:
          System.out.printf("Saldo: %.2f\n",conta.getLimiteChequeEspecial());
          break;
        case 3:
          System.out.print("Digite o valor a ser depositado: ");
          valor = Double.parseDouble(input.nextLine());
          conta.depositar(valor);
          break;
        case 4:
          System.out.print("Digite o valor a ser sacado: ");
          valor = Double.parseDouble(input.nextLine());
          conta.sacar(valor);
          break;
        case 5:
          System.out.print("Digite o codigo do boleto: ");
          System.console().readLine();
          System.out.print("Digite o valor do boleto: ");
          valor = Double.parseDouble(System.console().readLine());
          conta.pagarBoleto(valor);
          break;
        case 6:
          System.out.println(conta.exibirChequeEspecial());
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
      }
      
    }while(opcao != 0);
    input.close();
  }

  public static double definirLimiteChequeEspecial(double depositoInicial){
    double limiteChequeEspecial = 0;
    if (depositoInicial <= 500){
      limiteChequeEspecial = 50;
    }else if(depositoInicial > 500){
      limiteChequeEspecial = depositoInicial * 0.5;
    }
    return limiteChequeEspecial;
  }
  
  public static void exibirMenu(){
    System.out.print("""
      +++++++++++++++ Menu +++++++++++++++
      1. Consultar saldo
      2. Consultar cheque especial
      3. Despositar dinheiro
      4. Sacar dinheiro
      5. Pagar boleto
      6. Verificar limite de cheque especial
      0. Sair
      
      Escolha uma opcao:  """);
  }
}