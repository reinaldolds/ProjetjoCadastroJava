import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.Scanner;
public class MainCadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cadastrados cadastrados = new Cadastrados();
        int op;
        int res;


        do {
            int cont=0;

            System.out.println("\nLanchonete");
            System.out.println("Cadastramento de Colaboradores");
            System.out.println("\nFunção: \n1 - Atendente \n2 - Caixa \n3 - Gerente \n4 - Lancheiro");
            op = sc.nextInt();
            switch (op){
                case 1:
                    Atendente at01 = new Atendente();
                    System.out.println("Matrícula: " + (cont+1));
                    System.out.println("Nome:");
                    at01.setNome(sc.next());
                    sc.nextLine();
                    System.out.println("Idade:");
                    at01.setIdade(sc.nextInt());
                    System.out.println("CPF:");
                    at01.setCpf(sc.nextInt());
                    System.out.println("Telefone:");
                    at01.setTelefone(sc.nextLong());
                    System.out.println("Endereço:");
                    at01.setEndereco(sc.next());
                    sc.nextLine();
                    System.out.println("E-mail:");
                    at01.setEmail(sc.nextLine());
                    System.out.println("Salário:");
                    at01.setSalario(sc.nextDouble());
                    System.out.println("Carga (horas/mês):");
                    at01.setTempo_trabalho(sc.nextDouble());

                    cadastrados.cadastrar_a(at01);
                    break;
                case 2:
                    Caixa caixa = new Caixa();
                    System.out.println("Matrícula: " + (cont+1));
                    System.out.println("Nome:");
                    caixa.setNome(sc.next());
                    sc.nextLine();
                    System.out.println("Idade:");
                    caixa.setIdade(sc.nextInt());
                    System.out.println("CPF:");
                    caixa.setCpf(sc.nextInt());
                    System.out.println("Telefone:");
                    caixa.setTelefone(sc.nextLong());
                    System.out.println("Endereço:");
                    caixa.setEndereco(sc.next());
                    sc.nextLine();
                    System.out.println("E-mail:");
                    caixa.setEmail(sc.nextLine());
                    System.out.println("Salário:");
                    caixa.setSalario(sc.nextDouble());
                    System.out.println("Carga (horas/mês):");
                    caixa.setTempo_trabalho(sc.nextDouble());

                    cadastrados.cadastrar_c(caixa);
                    break;
                case 3:
                    Gerente gerente = new Gerente();
                    System.out.println("Matrícula: " + (cont+1));
                    System.out.println("Nome:");
                    gerente.setNome(sc.next());
                    sc.nextLine();
                    System.out.println("Idade:");
                    gerente.setIdade(sc.nextInt());
                    System.out.println("CPF:");
                    gerente.setCpf(sc.nextInt());
                    System.out.println("Telefone:");
                    gerente.setTelefone(sc.nextLong());
                    System.out.println("Endereço:");
                    gerente.setEndereco(sc.next());
                    sc.nextLine();
                    System.out.println("E-mail:");
                    gerente.setEmail(sc.nextLine());
                    System.out.println("Salário:");
                    gerente.setSalario(sc.nextDouble());
                    System.out.println("Carga (horas/mês):");
                    gerente.setTempo_trabalho(sc.nextDouble());

                    cadastrados.cadastrar_g(gerente);
                    break;
                case 4:
                    Lancheiro lancheiro = new Lancheiro();
                    System.out.println("Matrícula: " + (cont+1));
                    System.out.println("Nome:");
                    lancheiro.setNome(sc.next());
                    sc.nextLine();
                    System.out.println("Idade:");
                    lancheiro.setIdade(sc.nextInt());
                    System.out.println("CPF:");
                    lancheiro.setCpf(sc.nextInt());
                    System.out.println("Telefone:");
                    lancheiro.setTelefone(sc.nextLong());
                    System.out.println("Endereço:");
                    lancheiro.setEndereco(sc.next());
                    sc.nextLine();
                    System.out.println("E-mail:");
                    lancheiro.setEmail(sc.nextLine());
                    System.out.println("Salário:");
                    lancheiro.setSalario(sc.nextDouble());
                    System.out.println("Carga (horas/mês):");
                    lancheiro.setTempo_trabalho(sc.nextDouble());

                    cadastrados.cadastrar_l(lancheiro);
                    break;
                default:
                    System.out.println("opção incorreta, tente novamente.");
            }




            System.out.println("Deseja continuar?\n1 - sim\n2 - não");
            res = sc.nextInt();
        }while(res == 1);

            System.out.println("Cadastro Finalizado.");



        cadastrados.listar();

        sc.close();
    }
}
