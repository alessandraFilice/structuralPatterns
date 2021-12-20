package it.unical.demacs.PaninotecaDecorator1;
//Decorator concreto, quindi gli ingredienti da aggiungere non già contati nel prezzo del panino
public class ExtraSauceDecorator extends ExtraAdditionDecorator{
	
	public ExtraSauceDecorator(Product consumation){
        this.consumation = consumation;
    }
	
	@Override
	public String getProductName() {
		return consumation.getProductName()+" con salsa extra";
	}

	@Override
	public double getPrice() {
		return consumation.getPrice()+0.30;
	}

}
