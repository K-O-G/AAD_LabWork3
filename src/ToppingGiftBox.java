
public class ToppingGiftBox extends ToppingAdditions{
	private Chocolate_cake cake;
	
	public ToppingGiftBox(Chocolate_cake cake)
	{
		this.cake=cake;
		topping();
	}
	void topping() {
		// TODO Auto-generated method stub
		cake.giftbox=cake.giftbox+"Happy Birthday GiftBox";
	}
}
