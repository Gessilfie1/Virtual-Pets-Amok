package virtualpetsamok;

public class OCat extends Organic {

	public OCat(String name, String description) {
		super(name, description);
	}

	public void emptyLitterBox() {
		this.removewaste(5);
	}

	@Override
	public String getPetType() {

		return "Organic";
	}

}
