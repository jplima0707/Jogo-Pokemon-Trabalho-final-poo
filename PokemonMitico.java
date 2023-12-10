import java.util.Random;

public class PokemonMitico extends Pokemon {

  public PokemonMitico(String nome, int HP, double ataque, int velocidade, boolean shiny, TIPOS tipo) {
    super(nome, HP, ataque, velocidade, shiny, tipo);
    ataque += ataque * 0.3;
  }

  @Override
  public int atacar() {
    Random random = new Random();
    int numeroAleatorio = random.nextInt(10) + 1;
    if (numeroAleatorio <= 1) { // errou
      dano = 0;
      return 0;
    }
    if (numeroAleatorio == 10) { // critico
      dano = getAtaque() + getAtaque() * 0.35;
      return 1;
    } else {
      dano = getAtaque();
      return 2; // dano normal
    }

  }
}
