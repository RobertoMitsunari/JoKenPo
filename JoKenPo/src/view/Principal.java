package view;

import controller.ThreadJogo;

public class Principal {
	public static void main(String[] args) {
		String[] jogadoresEquipA = {"José","Gabriel","Diego","Erik","Matheus"};
		String[] jogadoresEquipB = {"Gustavo","Bruno","João","Lucas","Rafael"};
		Thread joKenPoThread;
		for(int i = 0;i < 5;i++) {
			joKenPoThread = new ThreadJogo(jogadoresEquipA[i],jogadoresEquipB[i]);
			joKenPoThread.start();
		}
	}
}
