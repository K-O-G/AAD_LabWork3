package AbstractFactory;

/**
 * Created by Home on 11.03.2017.
 */
public class MainAbstractFactory {
    Roshen factory;
    ChocolateCakeProduct chocolateCake;
    void createCake(ChocolateCakeProduct cake)
    {
        setCake(cake);
    }
    void setCake(ChocolateCakeProduct cake)
    {
        chocolateCake=new CakeFactory().createCake(cake.typeofChocolate);
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
        MainAbstractFactory mC= new MainAbstractFactory();
        mC.createCake(new BlackCake());
        mC.getType();
        mC.getReceipt();
    }
}
