package beans;

public class Car {
String Carname;
Engine engine;
Color color;
public void setCarname(String carname) {
	Carname = carname;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}
public void setColor(Color color) {
	this.color = color;
}
public void CarInfo() {
	System.out.println("CarName::"+Carname);
	System.out.println("ModelYear::"+engine.getModelYear());
	System.out.println("Color::"+color.clr);
}
}
