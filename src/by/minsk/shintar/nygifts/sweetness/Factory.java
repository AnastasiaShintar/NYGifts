package by.minsk.shintar.nygifts.sweetness;

import by.minsk.shintar.nygifts.sweetness.candy.Candy;
import by.minsk.shintar.nygifts.sweetness.cookie.Cookie;
import by.minsk.shintar.nygifts.sweetness.SweetBox;

public class Factory {

	private Sweetness[] sweetness = new Sweetness[20];

	{
		sweetness[0] = new Candy(Flavor.NUTTY, "Грильяж", 11, 51);
		sweetness[1] = new Candy(Flavor.NUTTY, "Белочка", 12, 54);
		sweetness[2] = new Candy(Flavor.CHERRY, "Choco Cherry", 12, 49);
		sweetness[3] = new Candy(Flavor.STRAWBERRY, "Choco Strawberry", 10, 49);
		sweetness[4] = new Candy(Flavor.COFFEE, "Coffee Cream", 9, 56);
		sweetness[5] = new Candy(Flavor.CHERRY_RUM, "Пьяная вишня", 9, 48);
		sweetness[6] = new Candy(Flavor.PRUNES, "Prunes in chocolate", 14, 47);
		sweetness[7] = new Candy(Flavor.COCONUT, "Coco-Choco", 13, 56);
		sweetness[8] = new Candy(Flavor.CHERRY, "Cherry Lollipop", 7, 55);
		sweetness[9] = new Candy(Flavor.BANANA, "Banana Lollipop", 8, 45);
		sweetness[10] = new Candy(Flavor.COCONUT, "Coconut Lollipop", 8, 45);
		sweetness[11] = new Candy(Flavor.KIWI, "Kiwi Lollipop", 7, 49);
		sweetness[12] = new Candy(Flavor.MINT, "Mint Lollipop", 8, 57);
		sweetness[13] = new Candy(Flavor.MINT_PEPER, "Hot Mint Peper", 8, 43);
		sweetness[14] = new Cookie(Flavor.BLUEBERRY, "Macaron Blueberry", 20, 71);
		sweetness[15] = new Cookie(Flavor.COCONUT, "Macaron Coconut", 20, 71);
		sweetness[16] = new Cookie(Flavor.STRAWBERRY, "Macaron Strawberry", 20, 72);
		sweetness[17] = new Cookie(Flavor.NUTTY, "Macaron Nutty", 21, 72);
		sweetness[18] = new Cookie(Flavor.CHERRY, "Macaron Cherry", 25, 74);
		sweetness[19] = new Cookie(Flavor.COFFEE, "Macaron Coffee", 22, 73);
	}

	public SweetBox packaging(String name) {

		SweetBox sweetBox = null;
		if (name.equals("Набор сладостей №1")) {
			sweetBox = new SweetBox(name, 10);
			sweetBox.formBox(sweetness[19]);
			sweetBox.formBox(sweetness[18]);
			sweetBox.formBox(sweetness[17]);
			sweetBox.formBox(sweetness[0]);
			sweetBox.formBox(sweetness[2]);
			sweetBox.formBox(sweetness[1]);
			sweetBox.formBox(sweetness[13]);
			sweetBox.formBox(sweetness[12]);
			sweetBox.formBox(sweetness[11]);
			sweetBox.formBox(sweetness[10]);

			System.out.println(sweetBox.toString());
		}

		else if (name.equals("Набор сладостей №2")) {
			sweetBox = new SweetBox(name, 7);
			sweetBox.formBox(sweetness[16]);
			sweetBox.formBox(sweetness[15]);
			sweetBox.formBox(sweetness[14]);
			sweetBox.formBox(sweetness[3]);
			sweetBox.formBox(sweetness[4]);
			sweetBox.formBox(sweetness[5]);
			sweetBox.formBox(sweetness[6]);

			System.out.println(sweetBox.toString());
		}

		else if (name.equals("Набор сладостей №3")) {
			sweetBox = new SweetBox(name, 17);
			sweetBox.formBox(sweetness[16]);
			sweetBox.formBox(sweetness[15]);
			sweetBox.formBox(sweetness[14]);
			sweetBox.formBox(sweetness[3]);
			sweetBox.formBox(sweetness[4]);
			sweetBox.formBox(sweetness[5]);
			sweetBox.formBox(sweetness[6]);
			sweetBox.formBox(sweetness[17]);
			sweetBox.formBox(sweetness[18]);
			sweetBox.formBox(sweetness[19]);
			sweetBox.formBox(sweetness[10]);
			sweetBox.formBox(sweetness[11]);
			sweetBox.formBox(sweetness[12]);
			sweetBox.formBox(sweetness[13]);
			sweetBox.formBox(sweetness[0]);
			sweetBox.formBox(sweetness[1]);
			sweetBox.formBox(sweetness[2]);

			System.out.println(sweetBox.toString());
		} else {
			System.out.println("Указанный Вами набор недоступен. Введите название набора из предлагаемого перечня.");
		}
		return sweetBox;

	}

}
