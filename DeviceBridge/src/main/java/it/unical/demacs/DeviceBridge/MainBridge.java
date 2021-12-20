package it.unical.demacs.DeviceBridge;
//applicazione del bridge con la creazione dei due dispositivi
public class MainBridge {
	public static void main(String[] args)
    {
        Device device1 = new Phone(new Produce(), new Assemble());
        device1.manufacture();
        Device device2 = new Tablet(new Produce(), new Assemble());
        device2.manufacture();
    }
}
