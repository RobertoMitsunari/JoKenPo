package controller;


public class ThreadJogo extends Thread {

	private String jogadorEquipA;
	private String jogadorEquipB;
	private int vitoriasJog1;
	private int vitoriasJog2;
	private static int pontosEquipeA;
	private static int pontosEquipeB;
	private static int jogos;
	
	
	

	public ThreadJogo(String jogadorEquipA, String jogadorEquipB) {
		super();
		this.jogadorEquipA = jogadorEquipA;
		this.jogadorEquipB = jogadorEquipB;
	}

	private int jogar() {
		vitoriasJog1 = 0;
		vitoriasJog2 = 0;
		int jogadaJog1;
		int jogadaJog2;
		while (vitoriasJog1 < 3 && vitoriasJog2 < 3) {
			jogadaJog1 = (int) ((Math.random() * 3) + 1);
			jogadaJog2 = (int) ((Math.random() * 3) + 1);
			switch (joKenPo(jogadaJog1, jogadaJog2)) {
			case 1:
				vitoriasJog1++;
				break;
			case 2:
				vitoriasJog2++;
			}
		}
		if (vitoriasJog1 == 3) {
			return 1;
		} else if (vitoriasJog2 == 3) {
			return 2;
		} else {
			return 0;
		}

	}

	private int joKenPo(int atk1, int atk2) {
		// 1 = Papel, 2 = Tesoura, 3 = Pedra
		switch (atk1) {
		case 1:
			if (atk2 == 2) {
				return 2;
			} else if (atk2 == 3) {
				return 1;
			} else {
				return 0;
			}
		case 2:
			if (atk2 == 3) {
				return 2;
			} else if (atk2 == 1) {
				return 1;
			} else {
				return 0;
			}
		case 3:
			if (atk2 == 1) {
				return 2;
			} else if (atk2 == 2) {
				return 1;
			} else {
				return 0;
			}
		default:
			return 0;
		}
	}

	@Override
	public void run() {
		switch (jogar()) {
		case 1:
			System.out.println(jogadorEquipA + " vs " + jogadorEquipB + " pontuação: " + vitoriasJog1 + " x " + vitoriasJog2 + " Jogador: " + jogadorEquipA + " da equipe A, ganhou!");
			pontosEquipeA++;
			break;
		case 2:
			System.out.println(jogadorEquipA + " vs " + jogadorEquipB + " pontuação: " + vitoriasJog1 + " x " + vitoriasJog2 + " Jogador: " + jogadorEquipB + " da equipe B, ganhou!");
			pontosEquipeB++;
			break;
		}
		jogos++;
		if (jogos == 5) {
			if(pontosEquipeA > pontosEquipeB) {
				System.out.println("Equipe A venceu");
			}else {
				System.out.println("Equipe B venceu");
			}
		}
		super.run();
	}

}
