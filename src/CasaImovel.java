public class CasaImovel extends Casa{
    private Imovel imovel;
    public CasaImovel(String nome, int posicao, Imovel imovel){
        super(nome, posicao);
        this.imovel = imovel;
    }

    @Override
    public void acao(Jogador j){
        imovel.acao(j);
    }
}
