package it.unical.demacs.PaninotecaDecorator1;
/*I prodotti venduti dalla paninoteca, che sono panini con hamburger e panini con salsisiccia*/
public class Hamburger extends Product {
    public Hamburger() {
        productName = "Hamburger";
    }
    @Override
    public double getPrice() {
        return 2.00;
    }
}