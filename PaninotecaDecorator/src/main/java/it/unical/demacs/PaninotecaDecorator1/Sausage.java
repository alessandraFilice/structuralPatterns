package it.unical.demacs.PaninotecaDecorator1;
/*Entità del dominio: i prodotti venduti dalla paninoteca, che sono panini con hamburger e oanini con salsisiccia*/

public class Sausage extends Product{
	public Sausage() {
		productName="Panino con salsiccia";
	}

	@Override
	public double getPrice() {
		return 2.50;
	}
}
