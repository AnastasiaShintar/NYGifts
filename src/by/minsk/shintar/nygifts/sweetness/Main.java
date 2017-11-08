package by.minsk.shintar.nygifts.sweetness;

import java.util.Scanner;

import by.minsk.shintar.nygifts.sweetness.SweetBox;

public class Main {

	public static void main(String[] args) {

		Factory factory = new Factory();

		System.out.println("Введите название подарочного набора:\n" + "Набор сладостей №1\n" + "Набор сладостей №2\n"
				+ "Набор сладостей №3");
		Scanner in = new Scanner(System.in);
		
		String selectBox;
		SweetBox boxX;
		
		while((boxX = factory.packaging(in.nextLine()))== null) {
		
		}


		if (boxX != null) {
			System.out.println();
			System.out.println("Укажите номер действия, которое хотите произвести с набором:\n"
					+ "1 - Получить весс-нетто выбранного подарка;\n"
					+ "2 - Произвести сортировку набора по весу сладостей;\n"
					+ "3 - Найти конфету в подарочном наборе по заданному диапазону содержания сахара;\n"
					+ "0 - Выход");
			int actnumber;
			while ((actnumber = in.nextInt()) != 0) {

				switch (actnumber) {
				case 1:
					boxX.getWeightBox();
					break;
				case 2:
					boxX.sortweightSweet();
					break;
				case 3:
					System.out.println("Укажите минимальное значение диапазона:");
					int minSugar = in.nextInt();
					System.out.println("Укажите максимальное значение диапазона:");
					int maxSugar = in.nextInt();
					boxX.findCandy(minSugar, maxSugar);
					break;
				default:
					System.out.println("Введите правильный номер команды!");
				}
			}
			System.out.println("Всего хорошего!");

		}
	}

}
