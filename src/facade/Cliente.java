package facade;
public class Cliente {
    public static void main(String[] args) {
        FacadeConta conta00 = new FacadeConta();
        FacadeConta conta01 = new FacadeConta();
        
        conta00.criarContaEmpresarial();
        conta00.fazerEmprestimoEmpresarial();
        
        conta01.criarContaPessoal();
        conta01.fazerEmprestimoPessoal();
    }
    
}
