package it.unical.demacs.DeviceBridge;
//implementazione concreta dell'implementatore
public class Produce implements Build{
	@Override
    public void production()
    {
        System.out.print("Produced");
    }
}
