package AbstractFactory;



/**
 * Created by Home on 11.03.2017.
 */
public class CakeFactory implements Roshen {
    @Override
    public ChocolateCakeProduct createCake(String chocolate) {
        if (chocolate.equals("black")){
            return new BlackCake();
        }
        else {
            return new WhiteCake();
        }
    }
}
