import java.util.LinkedList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Imovel> imoveis;
    private double saldo;
    private Casa casaAtual;
    private boolean falido = false;

    public Jogador(String nome, double saldo) {
        this.nome = nome;
        this.imoveis = new LinkedList<>();
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public List<Imovel> getImoveis() {
        return imoveis;
    }
    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }
    public boolean isFalido() {
        return falido;
    }

    public void receber(double valor) {
        this.saldo += valor;
    }
    public void pagar(double valor) {
        this.saldo -= valor;
        if (saldo < 0) {
            falido = true;
        }
    }
    public void adquirirImovel(Imovel imovel){
        imoveis.add(imovel);
        pagar(imovel.getPreco());
        imovel.setDono(this);
        System.out.println(imovel.getNome() + "adquiriado por: " + nome);
    }

    public double calcularPatrimonio(){
        double patrimonio = saldo;
        for(Imovel imovel : imoveis){
            patrimonio += imovel.getPreco();
        }
        return patrimonio;
    }
}
