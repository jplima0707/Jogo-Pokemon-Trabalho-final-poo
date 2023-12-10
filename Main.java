
public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Gerenciador gerenciador = menu.getGerenciador();
        menu.setVisible(true);

        Treinador Joao = new Treinador("Joao");
        gerenciador.adicionaTreinadorNoGerenciador(Joao);
        Pokemon deino = new Pokemon("Deino", 25, 4, 3, false, Pokemon.TIPOS.DRAGAO);
        Joao.adicionarPokemon(deino);
        gerenciador.adicionaPokemonNoGerenciador(deino);
        Pokemon charmander = new Pokemon("Charmander", 25, 4, 3, true, Pokemon.TIPOS.FOGO);
        Pokemon turtwig = new Pokemon("Turtwig", 30, 4, 4, false, Pokemon.TIPOS.PLANTA);
        Pokemon zekrom = new PokemonLendario("Zekrom", 50, 10, 2, false, Pokemon.TIPOS.ELETRICO);
        Joao.adicionarPokemon(charmander);
        Joao.adicionarPokemon(turtwig);
        Joao.adicionarPokemon(zekrom);
        gerenciador.adicionaPokemonNoGerenciador(charmander);
        gerenciador.adicionaPokemonNoGerenciador(turtwig);
        gerenciador.adicionaPokemonNoGerenciador(zekrom);

        Treinador Rafael = new Treinador("Rafael");
        gerenciador.adicionaTreinadorNoGerenciador(Rafael);

        Pokemon gastly = new Pokemon("Gastly", 28, 5, 5, false, Pokemon.TIPOS.FANTASMA);
        Pokemon eevee = new Pokemon("Eevee", 25, 4, 4, true, Pokemon.TIPOS.NORMAL);
        Pokemon teddiursa = new Pokemon("Teddiursa", 26, 3, 3, false, Pokemon.TIPOS.NORMAL);
        Pokemon giratina = new PokemonLendario("Giratina", 50, 10, 2, false, Pokemon.TIPOS.FANTASMA);

        Rafael.adicionarPokemon(gastly);
        Rafael.adicionarPokemon(eevee);
        Rafael.adicionarPokemon(teddiursa);
        Rafael.adicionarPokemon(giratina);

        gerenciador.adicionaPokemonNoGerenciador(gastly);
        gerenciador.adicionaPokemonNoGerenciador(eevee);
        gerenciador.adicionaPokemonNoGerenciador(teddiursa);
        gerenciador.adicionaPokemonNoGerenciador(giratina);

        Treinador Matheus = new Treinador("Matheus");
        gerenciador.adicionaTreinadorNoGerenciador(Matheus);

        Pokemon gible = new Pokemon("Gible", 28, 5, 5, true, Pokemon.TIPOS.DRAGAO);
        Pokemon ditto = new Pokemon("Ditto", 25, 4, 4, false, Pokemon.TIPOS.NORMAL);
        Pokemon litwick = new Pokemon("Litwick", 26, 3, 3, false, Pokemon.TIPOS.FANTASMA);
        Pokemon darkrai = new PokemonLendario("Darkrai", 50, 10, 2, false, Pokemon.TIPOS.SOMBRIO);
        Matheus.adicionarPokemon(gible);
        Matheus.adicionarPokemon(ditto);
        Matheus.adicionarPokemon(litwick);
        Matheus.adicionarPokemon(darkrai);

        gerenciador.adicionaPokemonNoGerenciador(gible);
        gerenciador.adicionaPokemonNoGerenciador(ditto);
        gerenciador.adicionaPokemonNoGerenciador(litwick);
        gerenciador.adicionaPokemonNoGerenciador(darkrai);
    }
}
