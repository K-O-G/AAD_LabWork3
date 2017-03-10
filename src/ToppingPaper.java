
public class ToppingPaper extends ToppingAdditions{
	private Chocolate_cake cake;
	public ToppingPaper(Chocolate_cake cake)
	{
		this.cake=cake;
		topping();
	}
	void topping() {
		// TODO Auto-generated method stub
		cake.paper=cake.paper+" red paper";
	}
}
