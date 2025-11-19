public class Imovel{
    private String nome;
    private double preco;
    private double aluguel;
    private Jogador dono;

    public Imovel(String nome, double preco, double aluguel) {
        this.nome = nome;
        this.preco = preco;
        this.aluguel = aluguel;
        this.dono = null;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getAluguel() {
        return aluguel;
    }
    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }
    public Jogador getDono() {
        return dono;
    }
    public void setDono(Jogador dono) {
        this.dono = dono;
    }

    public void acao(Jogador j) {
        if(dono == null){

        }else if(dono != j){
            j.pagar(aluguel);
            dono.receber(aluguel);
        }
    }
}
