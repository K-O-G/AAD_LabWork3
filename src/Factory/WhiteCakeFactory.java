package Factory;

public class WhiteCakeFactory implements AbstractCake {

	@Override
	public Chocolate_cakeProduct getCake() {
		// TODO Auto-generated method stub
		return new White_cake();
	}



}
