package it.unical.demacs.PaninotecaDecorator1;
/*Questa classe modella tutti gli ingredienti aggiuntivi nel panino,quindi fa da base per il decorator
 */

public abstract class ExtraAdditionDecorator extends Product {
	 protected Product consumation;
	 @Override
	 public abstract String getProductName();
}
