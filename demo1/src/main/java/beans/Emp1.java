package beans;
import java.util.*;
import java.util.Map.Entry;
public class Emp1 {
HashMap m;
public void setM(HashMap m) {
	this.m = m;
}
public void show() {
Set s=m.entrySet();
Iterator it=s.iterator();
while(it.hasNext()) {
	Entry e=(Entry)it.next();
	System.out.println(e.getKey()+":::"+e.getValue());
}
}
}
