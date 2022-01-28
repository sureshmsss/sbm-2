package ss.it.test;

import java.util.Date;
import java.util.ArrayList;

import ss.it.model.Employee;
import ss.it.model.Employee2;
import ss.it.model.Person;

public class App {

	public <T> T show(Class<T> clazz) throws Exception {
		return (T) clazz.getDeclaredConstructor(new Class[] {}).newInstance();
	}

	public <T extends Person> T show1(Class<T> clazz) throws Exception {
		return clazz.getDeclaredConstructor(new Class[] {}).newInstance();
	}

	public static void main(String[] args) throws Exception {

		App a1 = new App();
		Employee e = a1.show(Employee.class);
		Employee2 e2 = a1.show(Employee2.class);
		Date d1 = a1.show(Date.class);
		ArrayList al = a1.show(ArrayList.class);
		System.out.println(e + "=>\n" + e2 + "=>\n" + al + "=>\n" + d1);
		System.out.println("\n===========");

		Employee emp = a1.show1(Employee.class);
		Employee2 emp2 = a1.show1(Employee2.class);
//		Date d2 = a1.show1(Date.class);
//		ArrayList al1 = a1.show1(ArrayList.class);
		System.out.println(emp + "=>\n" + emp2);// + "=>" + d2 + "=>" + al1);
	}

}
