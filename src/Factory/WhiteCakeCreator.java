package Factory;

public class WhiteCakeCreator implements CakeCreator {

	@Override
	public ChocolateCakeProduct getCake() {
		return new WhiteCake();
	}



}
