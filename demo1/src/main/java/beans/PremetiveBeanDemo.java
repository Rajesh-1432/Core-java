package beans;

public class PremetiveBeanDemo {
int a;
boolean b1;
double d1;
float f1;
char ch;
byte b2;
String str1;
public PremetiveBeanDemo(int a, boolean b1, double d1, float f1, char ch, byte b2, String str1) {
	super();
	this.a = a;
	this.b1 = b1;
	this.d1 = d1;
	this.f1 = f1;
	this.ch = ch;
	this.b2 = b2;
	this.str1 = str1;
}

public void show() {
	System.out.println("int::"+a);
	System.out.println("boolean::"+b1);
	System.out.println("float::"+f1);
	System.out.println("double::"+d1);
	System.out.println("charcter::");
	System.out.println("Byte::"+b2);
	System.out.println("String::"+str1);
}
}
