import java.text.DecimalFormat;
import java.util.Random;

public class Pokemon implements Cloneable {

	public enum TIPOS {
		AGUA, FOGO, INSETO, PLANTA, FADA, NORMAL, DRAGAO, FANTASMA, TERRA, METAL, VOADOR, ELETRICO, PEDRA, SOMBRIO,
		LUTADOR, PSIQUICO
	};

	private String nome;
	private int HP;
	private TIPOS tipo;
	protected double dano; // varia com criticos ou erro.
	private boolean vivo;
	private boolean shiny;
	private double ataque; // ataque padrao. Nao muda.
	private double danoSofrido;
	private int velocidade;

	public Pokemon(String nome, int hP, double ataque, int velocidade, boolean shiny, TIPOS tipo) {
		this.nome = nome;
		this.HP = hP;
		this.dano = 0;
		this.tipo = tipo;
		this.shiny = shiny;
		this.ataque = ataque;
		this.vivo = setVivo();
		this.danoSofrido = 0;
		this.velocidade = velocidade;
	}

	public int atacar() {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(10) + 1;
		if (numeroAleatorio <= 2) { // errou
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

	public double getAtaque() {
		return ataque;
	}

	public boolean getVivo() {
		return vivo;
	}

	public boolean setVivo() {
		if (danoSofrido < HP) {
			this.vivo = true;
			return true;
		} else {
			this.vivo = false;
			return false;
		}
	}

	public String getNome() {
		return nome;
	}

	public int getHP() {
		return HP;
	}

	public String vida() {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(HP - danoSofrido);
	}

	public double getDano() {
		return dano;
	}

	public String getShiny() {
		if (shiny) {
			return "sim";
		} else
			return "nao";
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: ").append(getNome())
				.append(", Tipo: ").append(tipo)
				.append(", HP: ").append(getHP())
				.append(", Ataque: ").append(getAtaque())
				.append(", Velocidade: ").append(getVelocidade())
				.append(", Shiny: ").append(getShiny());
		return sb.toString();
	}

	public double getDanoSofrido() {
		return danoSofrido;
	}

	public void setDanoSofrido(double d) {
		this.danoSofrido += d;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setNome(String s) {
		nome = s;
	}

	public void setShiny(boolean b) {
		shiny = b;
	}

	public void setAtaque(int i) {
		ataque = i;
	}

	public void setVelocidade(int i) {
		velocidade = i;
	}

	public void setHP(int i) {
		HP = i;
	}

	public TIPOS geTIPOS() {
		return tipo;
	}

	public void setTipo(Pokemon.TIPOS t) {
		tipo = t;
	}

	public String exibirBarraDeVida() {
		int qtdBarras = (int) Math.ceil((double) (getHP() - getDanoSofrido()));

		StringBuilder barras = new StringBuilder();

		for (int i = 0; i < qtdBarras; i++) {
			barras.append("|");
		}
		return barras.toString() + vida();
	}

	public Pokemon clone() {
		try {
			return (Pokemon) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e);
		}
	}
}
