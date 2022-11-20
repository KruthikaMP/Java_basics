package _221047003;

public class Student
{
private int studID;
private String studName,course;
public Student(int studID, String studName, String course) {
 this.studID = studID;
 this.studName = studName;
 this.course=course;
}
public int getstudID() {
 return studID;
}
public void setrollno(int studID) {
 this.studID = studID;
}

public String getstudName() {
	 return studName;
	}

public String getcourse() {
 return course;
}
public String toString()
{
return studID+" "+studName+" " +course;
}
public void setstudName(String studName) {
 this.studName = studName;
}
public void setcourse(String course) {
	 this.course = course;
	}
}