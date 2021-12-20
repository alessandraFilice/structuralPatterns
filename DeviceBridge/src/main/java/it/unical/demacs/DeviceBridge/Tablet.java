package it.unical.demacs.DeviceBridge;
//uso dell'astrazione 
public class Tablet  extends Device{
	public Tablet(Build build1, Build build2)
    {
        super(build1, build2);
    }
 
    @Override
    public void manufacture()
    {
        System.out.print("Tablet ");
        build1.production();
        build2.production();
    }

}
