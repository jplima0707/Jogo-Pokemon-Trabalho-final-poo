import javax.swing.JOptionPane;

public class Batalha {

	private String legendaBatalha(int n, Pokemon atacante, Pokemon poke, Pokemon poke2) {
		String nomeP1 = poke.getNome();
		String nomeP2 = poke2.getNome();
		String hpPoke1 = nomeP1 + " HP: " + poke.exibirBarraDeVida();
		String hpPoke2 = nomeP2 + " HP: " + poke2.exibirBarraDeVida();
		if (n == 0) {
			return hpPoke1 + "        " + hpPoke2 + "\n"
					+
					atacante.getNome() + " errou o ataque!" +
					" Dano Causado: " + atacante.getDano() + ";" + "\n";
		}
		if (n == 1) {
			return hpPoke1 + "        " + hpPoke2 + "\n"
					+
					atacante.getNome() + " acertou um crítico!" +
					" Dano Causado: " + atacante.getDano() + ";" + "\n";
		} else {
			return hpPoke1 + "        " + hpPoke2 + "\n"
					+
					atacante.getNome() + " Dano Causado: " + atacante.getDano() + ";" + "\n";
		}
	}

	public String batalhar(Treinador t1, Treinador t2, Gerenciador gerenciador) {
		StringBuilder resultadoBatalha = new StringBuilder();
		int rodada = 1;
		Pokemon p1 = t1.escolhePoke();
		if (p1 == null) {
			JOptionPane.showMessageDialog(null, t1.getNome().toUpperCase() + " NÃO POSSUI POKEMONS");
		}
		Pokemon p2 = t2.escolhePoke();
		if (p2 == null) {
			JOptionPane.showMessageDialog(null, t2.getNome().toUpperCase() + " NÃO POSSUI POKEMONS");
		}
		resultadoBatalha.append(p1.getNome()).append(" VS ").append(p2.getNome()).append("\n\n");

		while (p1.setVivo() && p2.setVivo()) {
			resultadoBatalha.append("Round ").append(rodada).append("\n");

			if (p1.getVelocidade() > p2.getVelocidade()) {
				resultadoBatalha.append(legendaBatalha(p1.atacar(), p1, p1, p2)).append("\n");
				p2.setDanoSofrido(p1.getDano());

				if (!p2.setVivo()) {
					break;
				}

				resultadoBatalha.append(legendaBatalha(p2.atacar(), p2, p1, p2)).append("\n");
				p1.setDanoSofrido(p2.getDano());
				rodada++;
			} else {
				resultadoBatalha.append(legendaBatalha(p2.atacar(), p2, p1, p2)).append("\n");
				p1.setDanoSofrido(p2.getDano());

				if (!p1.setVivo()) {
					break;
				}

				resultadoBatalha.append(legendaBatalha(p1.atacar(), p1, p1, p2)).append("\n");
				p2.setDanoSofrido(p1.getDano());
				rodada++;
			}
		}

		if (p1.getVivo()) {
			curar(p2);
			curar(p1);
			resultadoBatalha.append(p1.getNome()).append(" ganhou!");
			gerenciador.aumentaVitorias(t1);
		} else {
			gerenciador.aumentaVitorias(t2);
			curar(p2);
			curar(p1);
			resultadoBatalha.append(p2.getNome()).append(" ganhou!");
		}

		return resultadoBatalha.toString();
	}

	private void curar(Pokemon p) {
		p.setDanoSofrido(0);
		p.setVivo();
	}

}
