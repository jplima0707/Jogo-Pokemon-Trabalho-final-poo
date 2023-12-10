import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Gerenciador {

    List<Pokemon> listaPoke;
    List<Treinador> listaTreinador;
    int countTreinador;
    int countPoke;

    public Gerenciador() {
        this.listaPoke = new ArrayList<>();
        this.listaTreinador = new ArrayList<>();
        this.countTreinador = 0;
        this.countPoke = 0;
    }

    public void adicionaPokemonNoGerenciador(Pokemon p) {
        listaPoke.add(p);
        countPoke++;
    }

    public List<Pokemon> getListaPokeGeral() {
        return listaPoke;
    }

    public String imprimeListaPoke() {
        StringBuilder resultado = new StringBuilder();

        for (Pokemon p : listaPoke) {
            resultado.append(p.toString()).append("\n").append("\n");
        }
        return resultado.toString();
    }

    public void adicionaTreinadorNoGerenciador(Treinador t) {
        listaTreinador.add(t);
        countTreinador++;
    }

    public int getCountPoke() {
        return countPoke;
    }

    public int getCountTreinador() {
        return countTreinador;
    }

    public List<Treinador> getListaTreinadores() {
        return listaTreinador;
    }

    public Treinador achaTreinador(String nome) {
        for (Treinador t : listaTreinador) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                return t;
            }
        }
        return null;
    }

    public List<Treinador> adversariosPossiveis(Treinador t) {
        List<Treinador> adversariosPossiveis = new ArrayList<>(getListaTreinadores());
        adversariosPossiveis.remove(t);
        return adversariosPossiveis;
    }

    public List<Treinador> mostrarRankingVitorias() {
        List<Treinador> ranking = new ArrayList<>(listaTreinador);
        Collections.sort(ranking);
        return ranking;
    }

    public String[] getNomesTreinadores() {
        String[] listaNomes = new String[listaTreinador.size()];
        for (int i = 0; i < listaTreinador.size(); i++) {
            listaNomes[i] = listaTreinador.get(i).getNome();
        }
        return listaNomes;
    }

    public String[] getNomesAdversarios(Treinador t) {
        List<Treinador> adversarios = adversariosPossiveis(t);
        String[] listaNomesAd = new String[adversarios.size()];
        for (int i = 0; i < adversarios.size(); i++) {
            listaNomesAd[i] = adversarios.get(i).getNome();
        }
        return listaNomesAd;
    }

    public String pesquisaPoke(String s, Treinador t) {
        StringBuilder resultado = new StringBuilder();
        List<Pokemon> lista = t.getPokedex();
        for (Pokemon p : lista) {
            if (p.getNome().toLowerCase().contains(s)) {
                resultado.append(p.toString()).append("\n");
            }
        }
        return resultado.toString();
    }

    public void abrirTela(JFrame menu, JFrame tela) {
        menu.setVisible(false);
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        tela.setResizable(false);
    }

    public void aumentaVitorias(Treinador treinador) {
        treinador.setVitorias(treinador.getVitorias() + 1);
    }

    public boolean verificarCriacao(String nome, int HP, int ataque, int velocidade) {

        if (!nome.matches("^[a-zA-Z]+$")) {
            JOptionPane.showMessageDialog(null, "NOME NÃO PODE CONTER NÚMEROS OU CARACTERES ESPECIAIS");
            return false;
        }

        if (HP <= 0 || ataque <= 0 || velocidade <= 0) {
            JOptionPane.showMessageDialog(null, "ATRIBUTOS NÃO PODEM SER ZERO OU NEGATIVOS");
            return false;
        }

        int limiteMaximoHP = 100;
        if (HP > limiteMaximoHP) {
            JOptionPane.showMessageDialog(null, "HP NÃO PODE PASSAR DO LIMITE");
            return false;
        }
        return true;
    }

    public String getMediaAtaque() {

        double somador = 0;
        for (Pokemon p : listaPoke) {
            somador += p.getAtaque();
        }
        double media = (somador / listaPoke.size());
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(media);
    }

    public boolean treinadorExistente(String s) {
        for (Treinador t : listaTreinador) {
            if (t.getNome().equalsIgnoreCase(s)) {
                return true;
            }
        }
        return false;
    }

}