import java.util.Scanner;
import br.inatel.poo.computador.Computador;
import br.inatel.poo.computador.HardwareBasico;
import br.inatel.poo.computador.MemoriaUSB;
import br.inatel.poo.computador.SistemaOperacional;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean flag = true; // 'flag' para a volta do menu principal
        boolean flag2 = true; // 'flag' para continuar comprando
        int op; // opção se quer ver as promoções ou 'sair'
        int op2; // opção de compra das promoções
        int continuar; // opção se deseja continuar comprando ou não
        Computador[] computadores = new Computador[3]; // array dos computadores
        Cliente cliente = new Cliente("", "");

        //Criando a promoção 1
        SistemaOperacional so1 = new SistemaOperacional("macOS Sequoia", 64);
        HardwareBasico H1 = new HardwareBasico("Pentium Core i3 (2200 Mhz)\n8 Gb de Memória RAM", 500f);
        MemoriaUSB M1 = new MemoriaUSB("Pen-drive", 16);
        Computador computador1 = new Computador("Apple", 491, H1, so1, M1);

        //Adicionando a memória Na promoção 1
        computador1.addMemoriaUSB(M1);
        computadores[0] = computador1;

        //Criando a promoção 2
        SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);
        HardwareBasico H2 = new HardwareBasico("Pentium Core i5 (3370 Mhz)\n16 Gb de Memória RAM", 1000f);
        MemoriaUSB M2 = new MemoriaUSB("Pen-drive", 32);
        Computador computador2 = new Computador("Samsung", 491+1234, H2, so2, M2);

        //Adicionando a memória Na promoção 2
        computador2.addMemoriaUSB(M2);
        computadores[1] = computador2;

        //Criando a promoção 3
        SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);
        HardwareBasico H3 = new HardwareBasico("Pentium Core i7 (4500 Mhz)\n32 Gb de Memória RAM", 2000f);
        MemoriaUSB M3 = new MemoriaUSB("HD externo", 1000);
        Computador computador3 = new Computador("Dell", 491+5678, H3, so3, M3);

        //Adicionando a memória Na promoção 3
        computador3.addMemoriaUSB(M3);
        computadores[2] = computador3;

        // Loop do menu principal
        while(flag)
        {
            System.out.println("\nSeja bem-vindo ao PCMania!");
            System.out.println("\nSelecione uma das opções abaixo:");
            System.out.println("(1) Cadastro (é necessário um cadastro para realizar a compra) \n(2) Visualizar promoções\n(0) Sair");
            System.out.println("\nDigite a opção desejada: ");
            op = entrada.nextInt();

            // Seleção para ver as promoções ou para o código (sair)
            switch(op){
                case 1:
                    System.out.print("\nDigite o nome do cliente: ");
                    entrada.nextLine();
                    String nome = entrada.nextLine();
                    cliente.setNome(nome);

                    System.out.print("\nDigite o CPF do cliente: ");
                    String cpf = entrada.nextLine();
                    cliente.setCpf(cpf);

                    System.out.println("\nCliente cadastrado com sucesso!");
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                    break;

                // Promoções
                case 2:
                    if (cliente.getNome().equals("") || cliente.getCpf().equals("")) {
                        System.out.println("\n Cadastre o cliente primeiro!");
                    } else {
                        System.out.println("\n-------> Promoção 1");
                        computador1.mostrarPCConfigs();
                        System.out.println("\n-------> Promoção 2");
                        computador2.mostrarPCConfigs();
                        System.out.println("\n-------> Promoção 3");
                        computador3.mostrarPCConfigs();

                        while (flag2) {
                            System.out.print("\nQual promoção deseja comprar? (1, 2, 3 ou 0 para finalizar): ");
                            op2 = entrada.nextInt();

                            if (op2 == 0) {
                                flag2 = false;
                            } else if (op2 >= 1 && op2 <= 3) {
                                // Adiciona no array do cliente
                                for (int i = 0; i < cliente.computadores.length; i++) {
                                    if (cliente.computadores[i] == null) {
                                        cliente.computadores[i] = computadores[op2 - 1];
                                        break;
                                    }
                                }

                                System.out.println("Pedido enviado...");

                                // Pergunta se deseja continuar
                                System.out.print("Deseja comprar mais algum computador? [1] Sim [2] Não: ");
                                continuar = entrada.nextInt();
                                if (continuar == 2) {
                                    flag2 = false;
                                }
                            } else {
                                System.out.println("Opção inválida!");
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("\n------ Compra ------");
                    System.out.println("Cliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf());
                    System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());
                    flag = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}