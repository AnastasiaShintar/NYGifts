package by.minsk.shintar.nygifts.sweetness;

import java.util.Arrays;

import by.minsk.shintar.nygifts.sweetness.candy.Candy;

public class SweetBox {

	private String boxName;
	private Sweetness[] sweetSet;
	private int sweetCount = 0;

	public SweetBox(String boxName, int boxSize) {
		this.boxName = boxName;
		this.sweetSet = new Sweetness[boxSize];
	}

	public void formBox(Sweetness sweetness) {
		if (sweetCount < this.sweetSet.length) {
			sweetSet[this.sweetCount] = sweetness;
			sweetCount++;
		} else
			System.out.println("� ������� ������ ��� ����� ��� ���������!!! ������������!");

	}

	public int getWeightBox() {
		int currentWeight = 0;
		for (int i = 0; i < sweetSet.length; i++) {
			if (sweetSet[i] != null) {
				currentWeight += sweetSet[i].getWeight();
			}
		}
		System.out.println("��� ������ ���������� " + currentWeight + " �����(�).");
		System.out.println("");
		return currentWeight;

	}

	public void sortweightSweet() {

		for (int i = sweetSet.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {

				if (sweetSet[j].getWeight() > sweetSet[j + 1].getWeight()) {
					Sweetness t = sweetSet[j];
					sweetSet[j] = sweetSet[j + 1];
					sweetSet[j + 1] = t;
				}
			}
		}
		System.out.println("���������� ����������� ������ �� ����: \n" + this);
	}

	public void findCandy(int min, int max) {
		for (int i = 0; i < sweetSet.length; i++) {
			Sweetness currentSweet = sweetSet[i];
			if (currentSweet != null && currentSweet instanceof Candy) {
				if (currentSweet.getSugarContent() >= min && currentSweet.getSugarContent() <= max) {
					System.out.println(currentSweet.toString());
				}
			}
		}
	}

	@Override
	public String toString() {
		return boxName + " \n ������ (������, ���(�), ���������� ������(�):\n " + Arrays.toString(sweetSet)+ "\n ����� ������ � ������: " + sweetCount;
	}

}
