public class Imposto extends Casa{
    private double taxa;

    public Imposto(String nome, int posicao, double taxa) {
        super(nome, posicao);
        this.taxa = taxa;
    }

    @Override
    public void acao(Jogador j){
        System.out.println(j.getNome() + "deve pagar imposto");
        j.pagar(taxa);
    }
}
