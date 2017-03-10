
public class BlackCakeFactory implements Cake{

	public BlackCakeFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Chocolate_cake getCake() {
		// TODO Auto-generated method stub
		return new Black_cake();
	}

	@Override
	public ToppingAdditions getThing(String type, Chocolate_cake cake) {
		// TODO Auto-generated method stub
		if (type=="paper")
			return new ToppingPaper(cake);
			else if (type=="giftbox")
				return new ToppingGiftBox(cake);
			else 
				return null;
	}

}
