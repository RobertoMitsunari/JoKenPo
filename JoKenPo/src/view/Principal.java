package view;

import controller.ThreadJogo;

public class Principal {
	public static void main(String[] args) {
		String[] jogadoresEquipA = {"Jos�","Gabriel","Diego","Erik","Matheus"};
		String[] jogadoresEquipB = {"Gustavo","Bruno","Jo�o","Lucas","Rafael"};
		Thread joKenPoThread;
		for(int i = 0;i < 5;i++) {
			joKenPoThread = new ThreadJogo(jogadoresEquipA[i],jogadoresEquipB[i]);
			joKenPoThread.start();
		}
	}
}
