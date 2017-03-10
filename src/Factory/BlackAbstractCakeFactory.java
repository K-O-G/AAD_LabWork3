package Factory;

public class BlackAbstractCakeFactory implements AbstractCake {



	@Override
	public Chocolate_cakeProduct getCake() {
		return new Black_cake();
	}


}
