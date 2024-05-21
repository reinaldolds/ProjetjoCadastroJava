import java.util.ArrayList;
public class Cadastrados {
    private ArrayList<Funcionario> funcionarios= new ArrayList<>();

    public void cadastrar_f(Funcionario f){
            funcionarios.add(f);

        System.out.println("Funcionário cadastrado com sucesso.\n");
    }

    public void cadastrar_a( Atendente at01){
        funcionarios.add(at01);

        System.out.println("Funcionário cadastrado com sucesso.\n");
    }

    public void cadastrar_c( Caixa caixa){
        funcionarios.add(caixa);

        System.out.println("Funcionário cadastrado com sucesso.\n");
    }

    public void cadastrar_g( Gerente gerente){
        funcionarios.add(gerente);

        System.out.println("Funcionário cadastrado com sucesso.\n");
    }

    public void cadastrar_l( Lancheiro lancheiro){
        funcionarios.add(lancheiro);

        System.out.println("Funcionário cadastrado com sucesso.\n");
    }


    public void listar(){
        System.out.println("\nInformações Cadastradas\n");
        for(Funcionario f: funcionarios){
                if (f instanceof Atendente) {
                    Atendente at = (Atendente) f;
                    System.out.println("\n"+TipoFuncionario.ATENDENTE+":");
                }else if (f instanceof Caixa) {
                    Caixa cx = (Caixa) f;
                    System.out.println("\n"+TipoFuncionario.CAIXA+":");
                } else if (f instanceof Gerente) {
                    Gerente gerente = (Gerente) f;
                    System.out.println("\n"+TipoFuncionario.GERENTE+":");
                } else if (f instanceof Lancheiro) {
                    Lancheiro lancheiro = (Lancheiro) f;
                    System.out.println("\n"+TipoFuncionario.LANCHEIRO+":");
                }

            System.out.println("Matrícula: "+f.getMatricula());
            System.out.println("Nome: " + f.getNome());
            System.out.println("Idade: " + f.getIdade());
            System.out.println("Telefone: " + f.getTelefone());
            System.out.println("Endereço: " + f.getEndereco());
            System.out.println("E-mail: " + f.getEmail());
            System.out.println("Tempo de trabalho: " + f.getTempo_trabalho()+" (Horas/mês)");

            if (f instanceof Atendente){
                Atendente atendente = new Atendente();
                atendente.Atividade();
                System.out.println(atendente.superior());
            }else if (f instanceof Caixa){
                Caixa caixa = new Caixa();
                caixa.Atividade();
                System.out.println(caixa.superior());
            }else if (f instanceof Gerente){
            Gerente gerente = new Gerente();
            gerente.Atividade();
            }else if (f instanceof Lancheiro){
            Lancheiro lancheiro = new Lancheiro();
            lancheiro.Atividade();
            System.out.println(lancheiro.superior());
            }

        }

    }
    public boolean removerPorMatricula(int matricula){
        return funcionarios.removeIf(a -> a.getMatricula() == matricula) ||
                funcionarios.removeIf(c -> c.getMatricula() == matricula) ||
                funcionarios.removeIf(g -> g.getMatricula() == matricula) ||
                funcionarios.removeIf(l -> l.getMatricula() == matricula);
    }
    public void removerTudo(){
        funcionarios.clear();
    }


    public boolean alterarFuncionario(int matricula, Funcionario novoFuncionario) {
        for (Funcionario at01 : funcionarios) {
            if (at01.getMatricula() == matricula) {
                atualizarFuncionario(at01, novoFuncionario);
                return true;
            }
        }
        for (Funcionario caixa : funcionarios) {
            if (caixa.getMatricula() == matricula) {
                atualizarFuncionario(caixa, novoFuncionario);
                return true;
            }
        }
        for (Funcionario gerente : funcionarios) {
            if (gerente.getMatricula() == matricula) {
                atualizarFuncionario(gerente, novoFuncionario);
                return true;
            }
        }
        for (Funcionario lancheiro : funcionarios) {
            if (lancheiro.getMatricula() == matricula) {
                atualizarFuncionario(lancheiro, novoFuncionario);
                return true;
            }
        }
        return false;
    }

    private void atualizarFuncionario(Funcionario original, Funcionario novo) {
        original.setNome(novo.getNome());
        original.setIdade(novo.getIdade());
        original.setCpf(novo.getCpf());
        original.setTelefone(novo.getTelefone());
        original.setEndereco(novo.getEndereco());
        original.setEmail(novo.getEmail());
        original.setSalario(novo.getSalario());
        original.setTempo_trabalho(novo.getTempo_trabalho());
    }
    public Funcionario pesquisarPorMatricula(int matricula) {
        for (Funcionario f : funcionarios) {
            if (f.getMatricula() == matricula) {
                return f;
            }
        }
        return null;
    }

}

