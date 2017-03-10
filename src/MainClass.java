

public class MainClass {
	Chocolate_cake ChC;
	ToppingAdditions TA;
	void createCake(Cake cake)
	{
		setCake(cake);
		setPaper(cake);
		setGiftBox(cake);
		setPaper(cake);
		setGiftBox(cake);
	}
	void setCake(Cake cake)
	{
		ChC=cake.getCake();
	}
	Chocolate_cake getCake()
	{
		return ChC;
	}
	void setPaper(Cake cake)
	{
		TA=cake.getThing("paper",ChC);
	}
	void getAdditions()
	{
		ChC.ShowAdditions();
	}
	void getReceipt()
	{
		ChC.ShowReceipt();
	}
	void setGiftBox(Cake cake)
	{
		TA=cake.getThing("giftbox",ChC);
	}
	void getType()
	{
		ChC.ShowTypeofChocolate();
	}
	public static void main(String[] args)
	{
		MainClass mC= new MainClass();
		mC.createCake(new BlackCakeFactory());
		mC.getType();
		mC.getReceipt();
		mC.getAdditions();
	}
}
