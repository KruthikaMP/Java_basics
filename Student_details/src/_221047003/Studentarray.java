package _221047003;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Studentarray {
	
	   private static final Logger logger = Logger.getLogger("MyLogA");
	   private static void configureRootLogger() {
	        try {
	            FileHandler fh = new FileHandler("StudentLogFile.log");
	            fh.setFormatter(new SimpleFormatter());
	            Logger.getLogger("").addHandler(fh);
	        } catch (IOException e) {
	            logger.warning("Could not add handler to log to file");
	        }
	    }
	List<Student> c=new ArrayList<Student>();
	int studID;
	String studName,course;
	Scanner sc = new Scanner(System.in);
	Scanner s1 = new Scanner(System.in); 
	Iterator<Student> i=c.iterator();
	boolean found;
	
	public void addStudent()
	{
	 configureRootLogger();
	 System.out.println("1. Enter Student ID: ");
	 studID = sc.nextInt();
	 System.out.println("2. Enter Student Name");
	 studName = s1.next();
	 System.out.println("3. Enter Student course");
	 course = s1.next();
	 c.add(new Student(studID,studName,course)); 
	 logger.info("Adding new student record");
	}
	public void viewStudent()
	{
		         configureRootLogger();
		         Iterator<Student> i2=c.iterator();
		
				 while(i2.hasNext())
				 {
				 Student s1=i2.next();
				 System.out.println(s1);
				 }
				 logger.info("Viewing student records");
    }
	public void searchStudent()
	{
		configureRootLogger();
	found=false;
	 System.out.println("Enter StudentID to search");
	 studID=sc.nextInt();
	 i=c.iterator();
	 while(i.hasNext())
	 {
	 Student s=i.next();
	 if(s.getstudID()==studID)
	 {
	 System.out.println(s);
	 found=true;
	 }
	 }
	 logger.info("Searching student record");
	 if(!found)
	 {
	 logger.info("Record not found");
	 }
}
	public void deleteStudent()
	{
		configureRootLogger();
	 found=false;
	 System.out.println("Enter StudentID to delete");
	 studID=sc.nextInt();
	 i=c.iterator();
	 while(i.hasNext())
	 {
	 Student s=i.next();
	 if(s.getstudID()==studID)
	 {
	 i.remove();
	 found=true;
	 }
	 }
	 logger.info("Deleting student record");
	 if(!found)
	 {
		 logger.info("Record not found");
	 }
     }
	public void updateStudent()
	{
		configureRootLogger();
	 found=false;
	 System.out.println("Enter StudentID to update");
	 studID=sc.nextInt();
	 ListIterator<Student> l= c.listIterator();
	 while(l.hasNext())
	 {
	 Student p=l.next();
	 if(p.getstudID()==studID)
	 {
	 System.out.print("Enter new Student name");
	 studName=s1.next();
	 
	 System.out.print("Enter course");
	 course=s1.next();
	 l.set(new Student(studID,studName,course));
	 found=true;
	 }
	 }
	 logger.info("Updating student record");
	 if(!found)
	 {
		logger.info("Record not found");
	 }
	 else
	 {
		 logger.info("Record updated");
	 }
}
}
