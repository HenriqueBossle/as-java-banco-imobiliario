public class Inicio extends Casa{
    private int salarioPorVolta;

    public Inicio(String nome, int posicao, int salarioPorVolta){
        super(nome, posicao);
        this.salarioPorVolta = salarioPorVolta;
    }

    public int getSalarioPorVolta() {
        return salarioPorVolta;
    }

    @Override
    public void acao(Jogador j){

    }
}
