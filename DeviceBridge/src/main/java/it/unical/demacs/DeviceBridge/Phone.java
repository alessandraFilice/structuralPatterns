package it.unical.demacs.DeviceBridge;
//uso dell'astrazione 
public class Phone extends Device{
	public Phone(Build build1, Build build2)
    {
        super(build1, build2);
    }
 
    @Override
    public void manufacture()
    {
        System.out.print("Phone ");
        build1.production();
        build2.production();
    }
}
