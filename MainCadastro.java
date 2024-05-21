import javax.swing.JOptionPane;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
public class MainCadastro {
    private static Set<Integer> matriculas = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cadastrados cadastrados = new Cadastrados();
        int op;
        int res;
        int menu;

        do {
            System.out.println("\nLanchonete Menu Opções:");
            System.out.println("\n1- Cadastrar \n2 - Alterar \n3 - Pesquisar" +
                    " \n4 - Remover por Matrícula \n5 - Remover tudo \n6 - Exibir Lista" +
                    " \n7 - Sair");
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    System.out.println("\nLanchonete");
                    System.out.println("Cadastramento de Colaboradores");
                    System.out.println("\nFunção: \n1 - Atendente \n2 - Caixa \n3 - Gerente \n4 - Lancheiro");
                    op = sc.nextInt();
                    int matricula = obterMatriculaUnica(sc);
                    switch (op){
                        case 1:
                            Atendente at01 = new Atendente();
                            System.out.println("Matrícula: ");
                            at01.setMatricula(matricula);
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
                            System.out.println("Matrícula: ");
                            caixa.setMatricula(matricula);
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
                            System.out.println("Matrícula: ");
                            gerente.setMatricula(matricula);
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
                            System.out.println("Matrícula: " );
                            lancheiro.setMatricula(matricula);
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
                    break;
                case 2://Alterar
                    alterarFuncionario(sc, cadastrados);
                    break;
                case 3://pesquisar
                    pesquisarFuncionario(sc, cadastrados);
                    break;
                case 4:
                    removerFuncionario(sc, cadastrados);
                    break;
                case 5:
                    System.out.println("Tem certeza que deseja remover tudo?\n1 - sim\n2 - não");
                    int apagar = sc.nextInt();
                    if (apagar != 1 && apagar != 2){
                        System.out.println("Opção inválida, tente novamente");
                    } else if (apagar == 1) {
                        cadastrados.removerTudo();
                    }else{
                        System.out.println("Sem remoção de todos.");
                    }
                    break;
                case 6:
                    cadastrados.listar();
                    break;
                case 7:
                    System.out.println("Sistema Encerrado");
                    return;

                default:
                    System.out.println("Opção incorreta, tente novamente.");

            }



            System.out.println("\nDeseja continuar?\n1 - sim\n2 - não");
            res = sc.nextInt();
        }while(res == 1);


        cadastrados.listar();
        System.out.println("Sistema Finalizado.");

        sc.close();
    }

    private static void pesquisarFuncionario(Scanner sc, Cadastrados cadastrados) {
        System.out.println("Digite a matrícula do funcionário a ser pesquisado:");
        int matricula = sc.nextInt();
        Funcionario funcionario = cadastrados.pesquisarPorMatricula(matricula);
        if (funcionario != null) {
            System.out.println(funcionario);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private static void removerFuncionario(Scanner sc, Cadastrados cadastrados) {
        System.out.println("Digite a matrícula do funcionário a ser removido:");
        int matricula = sc.nextInt();
        if (cadastrados.removerPorMatricula(matricula)) {
            System.out.println("Funcionário removido com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
    private static void alterarFuncionario(Scanner sc, Cadastrados cadastrados) {
        System.out.println("Digite a matrícula do funcionário a ser alterado:");
        int matricula = sc.nextInt();
        sc.nextLine();  // Limpar o buffer do scanner

        System.out.println("Digite os novos dados do funcionário:");
        Funcionario novoFuncionario = new Funcionario();
        System.out.println("Nome:");
        novoFuncionario.setNome(sc.nextLine());
        System.out.println("Idade:");
        novoFuncionario.setIdade(sc.nextInt());
        System.out.println("CPF:");
        novoFuncionario.setCpf(sc.nextInt());
        System.out.println("Telefone:");
        novoFuncionario.setTelefone(sc.nextLong());
        sc.nextLine();  // Limpar o buffer do scanner
        System.out.println("Endereço:");
        novoFuncionario.setEndereco(sc.nextLine());
        System.out.println("E-mail:");
        novoFuncionario.setEmail(sc.nextLine());
        System.out.println("Salário:");
        novoFuncionario.setSalario(sc.nextDouble());
        System.out.println("Carga (horas/mês):");
        novoFuncionario.setTempo_trabalho(sc.nextDouble());

        if (cadastrados.alterarFuncionario(matricula, novoFuncionario)) {
            System.out.println("Funcionário alterado com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }


    private static int obterMatriculaUnica(Scanner sc){
        int matricula;
        while (true){
            System.out.println("Digita a Matrícula:");
            matricula = sc.nextInt();
            if(!matriculas.contains(matricula)){
                matriculas.add(matricula);
                break;
            }else{
                System.out.println("Essa matricula já existe, tentar outra.");
            }
        }
        return matricula;
    }
}
