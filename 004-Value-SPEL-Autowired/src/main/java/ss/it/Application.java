package ss.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import ss.it.beans.Customer;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		// get spring bean object
		Customer c = ctx.getBean(Customer.class);

		System.out.println("Customer object : " + c);

		// claose the continer object
		((ConfigurableApplicationContext) ctx).close();
		
		/*
		 
		 Customer object : Customer(name=A, uid=123456, age=27,
		  path=F:/NATARAJ DVD 2 NEW/IDEs & Editors/eclipse/eclipse-jee-2021-09-R-win32-x86_64/eclipse//plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_16.0.2.v20210721-1149/jre/bin/server;
		   F:/NATARAJ DVD 2 NEW/IDEs & Editors/eclipse/eclipse-jee-2021-09-R-win32-x86_64/eclipse//plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_16.0.2.v20210721-1149/jre/bin;
		   C:\Program Files\Common Files\Oracle\Java\javapath;
		   C:\ProgramData\Oracle12c\product\12.1.0\dbhome_1\bin;
		   E:\app\msuresh\product\12.1.0\dbhome_1\bin;
		   C:\Program Files\Python39;C:\Program Files\Python39\Scripts;
		   C:\Program Files\Java\jdk-16\bin;
		   C:\Program Files\Java\jdk1.8.0_92\bin;
		   C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;
		   C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;
		   C:\Program Files\MySQL\MySQL Server 8.0\bin;
		   C:\Program Files\MySQL\MySQL Shell 8.0\bin\;
		   F:\NATARAJ DVD 1 NEW\Maven\apache-maven-3.6.3-bin;
		   C:\Program Files\Common Files\Oracle\Java\javapath;
		   C:\ProgramData\Oracle12c\product\12.1.0\dbhome_1\bin;
		   E:\app\msuresh\product\12.1.0\dbhome_1\bin;
		   C:\Program Files\Python39;C:\Program Files\Python39\Scripts;
		   C:\Program Files\Java\jdk-16\bin;C:\Program Files\Java\jdk1.8.0_92\bin;
		   C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;
		   C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;
		   C:\Program Files\MySQL\MySQL Server 8.0\bin;;C:\Users\suresh\AppData\Local\Microsoft\WindowsApps;;
		   F:\NATARAJ DVD 2 NEW\IDEs & Editors\eclipse\eclipse-jee-2021-09-R-win32-x86_64\eclipse;,
		    osname=Windows 10)

		 
		 
		 */

	}

}
