import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                
                ██╗░░░██╗██╗██████╗░████████╗██╗░░░██╗░█████╗░██╗░░░░░  ██████╗░░█████╗░███╗░░██╗██╗░░██╗
                ██║░░░██║██║██╔══██╗╚══██╔══╝██║░░░██║██╔══██╗██║░░░░░  ██╔══██╗██╔══██╗████╗░██║██║░██╔╝
                ╚██╗░██╔╝██║██████╔╝░░░██║░░░██║░░░██║███████║██║░░░░░  ██████╦╝███████║██╔██╗██║█████═╝░
                ░╚████╔╝░██║██╔══██╗░░░██║░░░██║░░░██║██╔══██║██║░░░░░  ██╔══██╗██╔══██║██║╚████║██╔═██╗░
                ░░╚██╔╝░░██║██║░░██║░░░██║░░░╚██████╔╝██║░░██║███████╗  ██████╦╝██║░░██║██║░╚███║██║░╚██╗
                ░░░╚═╝░░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░░╚═════╝░╚═╝░░╚═╝╚══════╝  ╚═════╝░╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝
                """);

        String name = "Matheus Pereira";
        String accountType = "Conta Corrente";
        double balance = 2500.00;

        System.out.printf("""
                *************************************
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo conta:     %s
                Saldo inicial   R$%.2f
                *************************************
                """, name, accountType, balance);

        int option;
        do {
            System.out.println("Operações\n\n");
            System.out.println("""
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    """);

            System.out.println("Digite a operação desejada: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.printf("Seu saldo é: R$%.2f\n", balance);
                    break;
                case 2:
                    System.out.print("Digite quantia a receber: ");
                    balance += scanner.nextDouble();
                    System.out.print("Quantia recebida com sucesso!\n");
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Digite quantia a ser transferida: ");
                    double value = scanner.nextDouble();
                    if (value > balance) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        balance -= value;
                        System.out.print("Transferência realizada com sucesso!\n");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Digite uma operação válida: ");
                    break;
            }
            scanner.nextLine();
            System.out.print("Pressione qualquer tecla para continuar: ");
            scanner.nextLine();
        } while (option != 4);
    }
}