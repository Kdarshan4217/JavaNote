import java.time.LocalDate;
import java.util.Arrays;

public class Student extends Person  {
private float[] Marks;

public float[] getMarks() {
	return Marks;
}

public void setMarks(float[] marks) {
	Marks = marks;
}

public Student() {
	
	System.out.println("this is student deflut constructor");
	
}

public Student(int pid, String name, String adress, LocalDate bdate,float[] marks) {
	super(pid, name, adress, bdate);
	System.out.println("this is student para constructor ");
	this.Marks = marks;
	

}

@Override
public String toString() {
	return super.toString()+"Student [Marks=" + Arrays.toString(Marks) + "]";
}





}
