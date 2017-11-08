package by.minsk.shintar.nygifts.sweetness;

public abstract class Sweetness {

	private Flavor flavor;
	private String name;
	private int weight;
	private int sugarContent;

	public Sweetness(Flavor flavor, String name, int weight, int sugarContent) {
		super();
		this.flavor = flavor;
		this.name = name;
		this.weight = weight;
		this.sugarContent = sugarContent;
	}

	public int getWeight() {
		return weight;
	}

	public int getSugarContent() {
		return sugarContent;
	}

	@Override
	public String toString() {

		return this.name + " (" + this.flavor + " " + this.weight + " " + this.sugarContent + ")\n";

	}

}
