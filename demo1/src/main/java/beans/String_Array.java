package beans;

public class String_Array {
	String []carname;
	Engine1 []engine;
	public void setCarname(String[] carname) {
		this.carname = carname;
	}
	public void setEngine1(Engine1[] engine) {
		this.engine = engine;
	}
	public void show() {
		for(String str:carname) {
			System.out.println(str);
		}
		for(Engine1 e1:engine) {
			System.out.println(e1.getModelYear());
		}
	}

}
