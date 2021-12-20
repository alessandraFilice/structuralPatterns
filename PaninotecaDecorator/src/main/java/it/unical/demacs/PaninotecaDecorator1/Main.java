package it.unical.demacs.PaninotecaDecorator1;

public class Main {
	public static void main(String[] args) {
		 //Hamburger
		 Product hamburger = new Hamburger();
		 System.out.println("Prodotto:" +hamburger.productName +" = " + hamburger.getPrice() + "€");
		 Product sausage = new Sausage();
		 //voglio aggiungere la salsa al burger
		 Product hamburgerWithSouce = new ExtraSauceDecorator(hamburger);
		 System.out.println("Prodotto:" +hamburgerWithSouce.getProductName() +" = " + hamburgerWithSouce.getPrice() + "€");
		 //voglio aggiungere la salsa e i funghi al burger
		 Product hamburgerWithSauceAndMushrooms = new ExtraSauceDecorator(new ExtraMushroomsDecorator(hamburger));
		 System.out.println("Prodotto:" +hamburgerWithSauceAndMushrooms.getProductName() +" = " + hamburgerWithSauceAndMushrooms.getPrice());
		 //boglio aggiungere la salsa in un panino con salsiccia
		 Product sausageWithSauce = new ExtraSauceDecorator(sausage);
		 System.out.println("Prodotto:" +sausageWithSauce.getProductName() +" = " + sausageWithSauce.getPrice());
	 }
}
