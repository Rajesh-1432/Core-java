package test;

import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.Emp1Dao;
import model.Emp1;

public class Emp1_jdbc_IOC {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("resources/Emp1_jdbc.xml");
		Emp1Dao e=con.getBean("empdao",Emp1Dao.class);
		
		Scanner sc= new Scanner(System.in);
		while(true)	{
			System.out.println("1.Emp Insert");
			System.out.println("2.Emp update");
			System.out.println("3.Emp Delete");
			System.out.println("Enter Your choice");
			int n1=sc.nextInt();
			switch (n1) {
			case 1:
				System.out.println("Ennter how many records u want to insert");
				int k=sc.nextInt();
				for(int i=1;i<=k;i++) {
					System.out.println("Enter Eid::");
					int veid=sc.nextInt();
					System.out.println("Enter Ename::");
					String vename=sc.next();
					System.out.println("Enter Esal");
					double vesal=sc.nextDouble();
					e.empsave(new Emp1(veid, vename, vesal));
					System.out.println("inserted Succsfully");
				}
				break;
			case 2:
				System.out.println("what do you want to update");
				while(true) {
					System.out.println("1.update Name");
					System.out.println("2.update salary");
					int l=sc.nextInt();
					switch (l) {
					case 1:
						System.out.println("Enter Eid::");
						int ueid=sc.nextInt();
						System.out.println("Enter Ename::");
						String uename=sc.next();
						e.empUpdate2(new Emp1(ueid, uename, 0));
						System.out.println("Updated succesful");
						
						break;
					case 2:
						System.out.println("Enter Eid::");
						int ueid2=sc.nextInt();
						System.out.println("Enter Esal::");
						double uesal=sc.nextDouble();
						e.empUpdate1(new Emp1(ueid2, "", uesal));
						System.out.println("Updated succesful");
						break;

					default:
						System.out.println("Invalid choice");
						break;
					}
					
				}
			case 3:
				System.out.println("Enter Eid::");
				int deid=sc.nextInt();
				e.empDelete(new Emp1(deid, "", 0));
				System.out.println("deleted succesfully");
				break;
				
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

}
