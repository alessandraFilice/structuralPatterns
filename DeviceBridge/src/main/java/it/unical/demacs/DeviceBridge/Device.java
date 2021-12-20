package it.unical.demacs.DeviceBridge;
//astrazione nel bridge
abstract class Device {
	 protected Build build1;
	 protected Build build2;
	 
     protected Device(Build build1, Build build2)
	    {
	        this.build1 = build1;
	        this.build2 = build2;
     }
	 
    abstract public void manufacture();
}
