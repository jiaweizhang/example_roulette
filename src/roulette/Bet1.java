import util.ConsoleReader;

public class Bet1 extends Bet {

	public Bet1(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even"))
				|| (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}

	@Override
	public String placeBet() {
		String result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
		return result;
	}

	@Override
	public boolean promptUser(Wheel myWheel) {
		// TODO Auto-generated method stub
		return false;
	}

}
