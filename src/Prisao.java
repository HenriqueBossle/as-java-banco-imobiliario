public class Prisao extends Casa{
    private int rodadasPreso;

    public Prisao(String nome, int posicao, int rodadasPreso)
    {
        super(nome, posicao);
        this.rodadasPreso = rodadasPreso;
    }

    @Override
    public void acao(Jogador j){
        System.out.println(j.getNome() + "foi preso, ficara 3 rodadas sem jogar");
        
    }
}
