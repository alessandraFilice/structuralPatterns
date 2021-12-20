package it.unical.demacs.DeviceBridge;
//implementazione concreta dell'implementatore
public class Assemble implements Build{
	@Override
    public void production()
    {
        System.out.print(" and assembled\n");
    }

}
