package beans;

public class Product {
int pid;
String pname;
double price;
public Product(int pid,String pname,double price) {
	this.pid=pid;
	this.pname=pname;
	this.price=price;
}
public void ProductInfo() {
	System.out.println("pId::"+pid);
	System.out.println("Pname::"+pname);
	System.out.println("Price::"+price);
}
}
