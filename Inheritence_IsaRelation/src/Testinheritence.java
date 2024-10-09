import java.time.LocalDate;

public class Testinheritence {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1);
		GraduateStudent g = new GraduateStudent(1,"deepali","pune",LocalDate.of(2003,1,1),new float[]{80.0f,50.0f},78);
		System.out.println(g);
		
		MasterStudent m=new MasterStudent(2,"Ram","Latur",LocalDate.of(2000, 2, 4),new float[]{30.0f,20.4f},"bio","Botny",45.0f);
       System.out.println(m);		
	}

}
