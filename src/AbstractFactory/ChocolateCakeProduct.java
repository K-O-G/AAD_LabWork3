package AbstractFactory;

public abstract class ChocolateCakeProduct {
	
	public String receipt;
	public String typeofChocolate;
	
	void ShowReceipt()
	{
		System.out.println("Receipt:" + receipt);
	}
	void ShowTypeofChocolate()
	{
		System.out.println("Type is:" + typeofChocolate+" cake");
	}

}
