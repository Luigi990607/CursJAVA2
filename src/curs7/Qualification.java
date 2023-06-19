package curs7;

public class Qualification extends Teacher {

	public Qualification(int experienceYears, String course, String schedule) {
		// TODO Auto-generated constructor stub
		super.course = course;
        super.experienceYears = experienceYears;
        super.schedule = schedule;
	}

    public void verify(){
        if(experienceYears >3 && course.equals("Java") && schedule.equals("Afternoon")){
            System.out.println("You qualify to teach at this school!");
        } else {
            System.out.println("You do not qualify!");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Qualification teacher1 = new Qualification(4, "Java" , "Afternoon");
        Qualification teacher2 = new Qualification(4, "C++", "Morning");
        teacher1.verify();
        teacher2.verify();
    
	}

}
