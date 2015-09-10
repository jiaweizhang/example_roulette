import util.ConsoleReader;

public class Bet2 extends Bet {

	public Bet2(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		// TODO Auto-generated method stub
		int start = Integer.parseInt(betChoice);
		return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}

	@Override
	public String placeBet() {
		String result = ""
				+ ConsoleReader.promptRange("Enter first of three consecutive numbers", 1, Wheel.NUM_SPOTS - 3);
		return result;
	}

	@Override
	public boolean promptUser(Wheel myWheel) {
		// TODO Auto-generated method stub
		return false;
	}

}
