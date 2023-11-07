package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Autowire_Demo {
String carname;
@Autowired
@Qualifier(value="e3")
Engine3 engine3;

public void setCarname(String carname) {
	this.carname = carname;
}
public void show() {
	System.out.println("CarName::"+carname);
	System.out.println("ModelYear::"+engine3.getModelyear());
}

}
