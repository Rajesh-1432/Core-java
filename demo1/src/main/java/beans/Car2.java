package beans;

public class Car2 {
String carname;
Engine2 engine;
Breaks breaks;

public void setCarname(String carname) {
	this.carname = carname;
}
public void setEngine(Engine2 engine) {
	this.engine = engine;
}
public void setBreaks(Breaks breaks) {
	this.breaks = breaks;
}
public void show() {
	System.out.println("CarName::"+carname);
	System.out.println("Model year::"+engine.getModelYear());
	System.out.println("Breaking model::"+breaks.getBname());
	
}
}
