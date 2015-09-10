import util.ConsoleReader;

public class Bet0 extends Bet {

	public Bet0(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		// TODO Auto-generated method stub
		return myWheel.getColor().equals(betChoice);
	}

	@Override
	public boolean promptUser(Wheel myWheel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String placeBet() {
		String result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
		return result;
	}

}
