package in.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Course;
import in.nit.model.Empolyee;
import in.nit.model.Hibernateutil;

public class Test {

	public static void main(String[] args) {
		Session ses = Hibernateutil.getsf().openSession();
        Transaction tx = null;
		try (ses){
			tx=ses.beginTransaction();
			Course c1= new Course (131."HIB".200.0);
			Course c2= new Course (132."SPR".200.0);
			Course c3= new Course (133."BOOT".200.0);
			Empolyee s1 = new	Empolyee ();
			s1.setEmpId(10);
			s1.setEmpName("siva");
			s1.setEmpMail("s@gm.com");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
