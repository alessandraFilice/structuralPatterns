package it.unical.demacs.AlberoNatalePrototype;

/*Questa è la classe che rappresenta il Prototype ed espone un metodo per poter clonare le classi che la estenderanno. 
 * Il design originale di questo pattern creazionale prevede il fatto che venga definito appunto un metodo per la clonazione degli oggetti. 
 * In Java questo meccanismo  è fornito dal metodo clone() della superclasse Object.
*/
public abstract class AlberoPrototype implements Cloneable{
	public String tipoDecorazione;
	
	public AlberoPrototype (String tipoDecorazione) {
		this.tipoDecorazione = tipoDecorazione;
	
	}
	public String getTipoDecorazione() {
		return tipoDecorazione;
	}
	public void setTipoDecorazione(String tipoDecorazione) {
		this.tipoDecorazione = tipoDecorazione;
	}
	
	@Override
	public AlberoPrototype clone(){
		try{
			return (AlberoPrototype) super.clone();
		}
		catch(CloneNotSupportedException e){
			System.out.println("Errore!");
			return null;
		}
	}
	
	public abstract void printModel();
	
}
