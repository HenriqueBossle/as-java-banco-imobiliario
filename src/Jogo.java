import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Jogo {
    List<Imovel> imoveis;
    List<Jogador> jogadores;

    public Jogo() {
        imoveis = new LinkedList<>();
        jogadores = new LinkedList<>();
    }

    public void adicionarJogador(Jogador j) {
        jogadores.add(j);
    }

    public void listarJogadores() {
        for (Jogador j : jogadores) {
            System.out.println(j.nome);
        }
    }
}
