package DAO;



import org.springframework.jdbc.core.JdbcTemplate;


import model.Emp1;

public class Emp1Dao {
JdbcTemplate jt;

public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
public int empsave(Emp1 e) {
	String vsql="insert into emp values("+e.getEid()+",'"+e.getEname()+"',"+e.getEsal()+")";
	return jt.update(vsql);
}
public int empUpdate1(Emp1 e) {
	String vsql="update emp set ename='"+e.getEname()+"' where eid="+e.getEid()+"";
	return jt.update(vsql);
}
public int empUpdate2(Emp1 e) {
	String vsql="update emp set esal='"+e.getEsal()+"' where eid="+e.getEid()+"";
	return jt.update(vsql);
}

public int empDelete(Emp1 e) {
	String vsql="delete from emp where eid="+e.getEid()+"";
	return jt.update(vsql);
}
	

}
