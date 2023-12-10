import java.util.Random;

public class PokemonLendario extends Pokemon {

	public PokemonLendario(String nome, int HP, double ataque, int velocidade, boolean shiny, TIPOS tipo) {
		super(nome, HP, ataque, velocidade, shiny, tipo);
		ataque += ataque * 0.5;
	}

	@Override
	public int atacar() {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(10) + 1;
		if (numeroAleatorio == 10) { // critico
			dano = getAtaque() + getAtaque() * 0.35;
			return 1;
		} else {
			dano = getAtaque();
			return 2; // dano normal
		}
	}
}
