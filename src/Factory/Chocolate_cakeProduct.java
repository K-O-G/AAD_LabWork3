package Factory;

public abstract class Chocolate_cakeProduct {
	
	public String receipt;
	public String typeofChocolate;
	public String paper;
	public String giftbox;
	
	void ShowReceipt()
	{
		System.out.println("Receipt:" + receipt);
	}
	void ShowTypeofChocolate()
	{
		System.out.println("Type is:" + typeofChocolate);
	}
	void ShowAdditions()
	{
		System.out.println("Paper is:" + paper);
		System.out.println("Gift box is:"+ giftbox);
	}
}
