package Decorator;

public class BlackCakeFactory implements Cake{

	@Override
	public Chocolate_cake getCake() {
		return new Black_cake();
	}

	@Override
	public ToppingAdditions getThing(String type, Chocolate_cake cake) {
		if (type=="paper")
			return new ToppingPaper(cake);
			else if (type=="giftbox")
				return new ToppingGiftBox(cake);
			else 
				return null;
	}

}
