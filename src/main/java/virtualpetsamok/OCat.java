package virtualpetsamok;

public class OCat extends Organic {

	public OCat(String name, String description) {
		super(name, description);
	}



	@Override
	public String getPetType() {

		return "Organic";
	}

}
