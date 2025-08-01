import java.util.Scanner;

public class main{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o nome do titular: ");
    String nome = input.nextLine();
    System.out.print("Digite o deposito inicial: ");
    double depositoInicial = Double.parseDouble(input.nextLine());
    double limiteChequeEspecial;
    if (depositoInicial <= 500){
      limiteChequeEspecial = 50;
    }else if(depositoInicial > 500){
      limiteChequeEspecial = depositoInicial * 0.5;
    }
    Conta conta = new Conta(nome, depositoInicial, limiteChequeEspecial);

    
    
    int opcao;
    do{
      exibirMenu();
      opcao = Integer.parseInt(input.nextLine());
      
    }while(opcao != 0);
  }
  public static void exibirMenu(){
    System.out.print("""
      1. Consultar saldo
      2. Consultar cheque especial
      3. Despositar dinheiro
      4. Sacar dinheiro
      5. Pagar boleto""");
  }
}