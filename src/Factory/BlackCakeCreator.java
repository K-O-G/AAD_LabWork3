package Factory;

public class BlackCakeCreator implements CakeCreator {



	@Override
	public ChocolateCakeProduct getCake() {
		return new BlackCake();
	}


}
