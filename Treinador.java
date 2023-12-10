import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Treinador implements Comparable<Treinador> {

    private String nome;
    private List<Pokemon> dex;
    private int vitorias;

    public Treinador(String nome) {
        this.nome = nome;
        this.dex = new ArrayList<>();
        this.vitorias = 0;
    }

    public int getVitorias() {
        return vitorias;
    }

    public String getNome() {
        return nome;
    }

    public boolean adicionarPokemon(Pokemon pokemon) {
        for (Pokemon p : dex) {
            if (pokemon.getNome().equalsIgnoreCase(p.getNome()) && pokemon.getHP() == p.getHP()
                    && pokemon.getAtaque() == p.getAtaque() && pokemon.getVelocidade() == p.getVelocidade()) {
                return false;
            }
        }
        this.dex.add(pokemon);
        return true;
    }

    public int nroPokemons() {
        return dex.size();
    }

    public List<Pokemon> getPokedex() {
        return dex;
    }

    public String pokeMaisForte() {
        StringBuilder resultado = new StringBuilder();
        Pokemon maisForte = dex.stream()
                .max(Comparator.comparingDouble(Pokemon::getAtaque))
                .orElse(null);

        if (maisForte != null) {
            resultado.append(maisForte.toString());
        } else {
            resultado.append("Nenhum Pokémon na dex.");
        }

        return resultado.toString();
    }

    public String listaPokemons() {
        StringBuilder resultado = new StringBuilder();
        List<String> pokemonStrings = dex.stream()
                .map(Pokemon::toString)
                .collect(Collectors.toList());

        for (String pokemon : pokemonStrings) {
            resultado.append(pokemon).append("\n");
        }

        if (pokemonStrings.isEmpty()) {
            resultado.append("Nenhum Pokémon na dex.");
        }

        return resultado.toString();
    }

    public String verShinys() {
        StringBuilder resultado = new StringBuilder();
        List<String> shinyPokemonStrings = dex.stream()
                .filter(pokemon -> "sim".equals(pokemon.getShiny()))
                .map(Pokemon::toString)
                .collect(Collectors.toList());

        for (String shinyPokemon : shinyPokemonStrings) {
            resultado.append(shinyPokemon).append("\n");
        }
        if (shinyPokemonStrings.isEmpty()) {
            resultado.append("Esse treinador não possui Shinys.");
        }

        return resultado.toString();
    }

    public Pokemon escolhePoke() {
        if (this.dex.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int indiceAleatorio = random.nextInt(nroPokemons());
        Pokemon pokemonEscolhido = (Pokemon) dex.get(indiceAleatorio).clone();

        return pokemonEscolhido;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(getNome())
                .append(", Vitórias: ").append(getVitorias());
        return sb.toString();
    }

    public void setNome(String n) {
        this.nome = n;
    }

    @Override
    public int compareTo(Treinador t1) {
        return Integer.compare(t1.getVitorias(), this.getVitorias());
    }

    public void setVitorias(int v) {
        vitorias = v;
    }
}