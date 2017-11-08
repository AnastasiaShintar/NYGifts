package by.minsk.shintar.nygifts.sweetness;

import java.util.Scanner;

import by.minsk.shintar.nygifts.sweetness.SweetBox;

public class Main {

	public static void main(String[] args) {

		Factory factory = new Factory();

		System.out.println("������� �������� ����������� ������:\n" + "����� ��������� �1\n" + "����� ��������� �2\n"
				+ "����� ��������� �3");
		Scanner in = new Scanner(System.in);
		
		String selectBox;
		SweetBox boxX;
		
		while((boxX = factory.packaging(in.nextLine()))== null) {
		
		}


		if (boxX != null) {
			System.out.println();
			System.out.println("������� ����� ��������, ������� ������ ���������� � �������:\n"
					+ "1 - �������� ����-����� ���������� �������;\n"
					+ "2 - ���������� ���������� ������ �� ���� ���������;\n"
					+ "3 - ����� ������� � ���������� ������ �� ��������� ��������� ���������� ������;\n"
					+ "0 - �����");
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
					System.out.println("������� ����������� �������� ���������:");
					int minSugar = in.nextInt();
					System.out.println("������� ������������ �������� ���������:");
					int maxSugar = in.nextInt();
					boxX.findCandy(minSugar, maxSugar);
					break;
				default:
					System.out.println("������� ���������� ����� �������!");
				}
			}
			System.out.println("����� ��������!");

		}
	}

}
