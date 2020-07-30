package facade;
public class FacadeConta {
    private Conta contaEmpresarial; 
    private Conta contaPessoal; 
    
    public FacadeConta(){
        contaEmpresarial = new ContaEmpresarial(); 
        contaPessoal = new ContaPessoal(); 
    }
    
    public void criarContaEmpresarial(){
            contaEmpresarial.abrirConta();
    }
    
    public void criarContaPessoal(){
            contaPessoal.abrirConta();
    }
    
    public void fazerEmprestimoEmpresarial(){
            contaEmpresarial.fazerEmprestimo();
    }
    
    public void fazerEmprestimoPessoal(){
            contaEmpresarial.fazerEmprestimo();
    }
}
