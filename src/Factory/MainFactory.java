package Factory;

/**
 * Created by Home on 11.03.2017.
 */
public class MainFactory {
    ChocolateCakeProduct chocolateCake;
    void createCake(CakeCreator cake)
    {
        setCake(cake);
    }
    void setCake(CakeCreator cake)
    {
        chocolateCake=cake.getCake();
    }

    ChocolateCakeProduct getCake()
    {
        return chocolateCake;
    }


    void getReceipt()
    {
        chocolateCake.ShowReceipt();
    }

    void getType()
    {
        chocolateCake.ShowTypeofChocolate();
    }
    public static void main(String[] args)
    {
        MainFactory mC= new MainFactory();
        mC.createCake(new BlackCakeCreator());
        mC.getType();
        mC.getReceipt();
    }
}
