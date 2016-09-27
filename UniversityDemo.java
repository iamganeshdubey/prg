package solutions;

public class UniversityDemo {

	public static void main(String[] args)
	{
	
	University u= new University();
	u.addshools("1", "bansi", 20, 8);	
	u.addshools("2", "akshay", 80, 6);
	u.addshools("3", "divi", 90, 8);
	u.addshools("4", "bassu", 50, 8);
	u.addshools("5", "rohit", 30, 6);
	u.addshools("6", "mukesh", 40, 6);
	u.addshools("7", "ram", 70, 6);
	u.addshools("8", "prashant", 10, 8);
	u.displayinfo();
System.out.println("total students in university :"+u.totalstrength_of_university());
u.display_no_of_students_in_each_school();
	}
}
