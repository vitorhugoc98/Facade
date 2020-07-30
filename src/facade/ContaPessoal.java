package facade;
public class ContaPessoal implements Conta{

    @Override
    public void fazerEmprestimo() {
        System.out.println("Fazendo empréstimo para conta Pessoal.");
    }

    @Override
    public void abrirConta() {
        System.out.println("Conta pessoal aberta.");
    }
    
}
