import java.util.ArrayList;

import org.generation.classes.Employee;
import org.generation.classes.Manager;
import org.generation.classes.Person;
import org.generation.util.EmailFormatException;

public class testPOO {
	public static void main(String[] args) {
		Employee alberto = new Employee("Alberto Trejo", 22, "alberto.trejo@gmail.com",
				"TEXL010101XY1", "Domicilio conocido", "TI", 250.00);
		Person hugo = new Employee("Hugo Rojas", 21, "hugo@gmail.com", "XAXX010101XX1", "Casa", "Development", 233.20);
		Manager vale = new Manager("Valeria Arquieta", 23, "vale@gmail.com", "XAXX0000000XXA", "Oficina", "Development IT", 450.25, 35, 0.25f);
		//No se puede instanciar la clase person porque es abstracta
		//Person daniel = new Person ("Daniel", 18);
		
	System.out.println(alberto.toString());
	System.out.println(alberto.calculateSalary(30));
	
	System.out.println(vale);
	System.out.println(vale.calculateSalary(30));
	

	System.out.println("Total: " + Person.getTotal());
	try { 
	    hugo.setEmail("hugoengmail.com");
	} catch (EmailFormatException e) {
		System.out.println(e.getMessage());
	}//e.printstackTrace ();
	}
}//class testPOO