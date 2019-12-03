package myPackage;

abstract public  class Vehicle {
	
	public int speed;
    public String name;
     public  Vehicle(int speed, String name)
      {
    	  this.speed = speed;
    	  this.name = name;
      }
     public abstract void show();
      public final int getSpeed()
      {
    	  return speed;
      }
      public  String getName()
      {
    	  return name;
      }
}
