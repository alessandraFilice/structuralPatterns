package it.unical.demacs.PaninotecaDecorator1;
/*classe astratta da cui deriveranno tutti i prodotti della  paninoteca.
 * Prodotto è la generica consumazione del cliente alla paninoteca
 */
public abstract class Product {
	 String productName = "";
	 
	 public String getProductName() {
		 return productName;
	 }
	 
	 public abstract double getPrice();
}
