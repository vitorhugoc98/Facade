package facade;
public class ContaEmpresarial implements Conta{

    @Override
    public void fazerEmprestimo() {
        System.out.println("Fazendo emprestimo para conta Empresarial.");
    }

    @Override
    public void abrirConta() {
        System.out.println("Conta empressarial aberta.");
    }
    
}
