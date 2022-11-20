package _221047003;
import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{       
        int ch;
		Studentarray student=new Studentarray();
		do
	 {
	System.out.println("1. Add Student Record");
	System.out.println("2. View Student Record");
	System.out.println("3. Search Student Record");
	System.out.println("4. Delete Student Record");
	System.out.println("5. Update Student Record");
	System.out.println("0. Exit");
	Scanner sc = new Scanner(System.in);
	ch = sc.nextInt();
	switch (ch){
	 case 1:
		 student.addStudent(); 
	      break;
	 case 2:
		 student.viewStudent();	 
	 	 break;
	 case 3:
		 student.searchStudent();		 
		 break;
	 case 4:
		 student.deleteStudent();	 
	 break;
	 case 5:
		 student.updateStudent();	 
	 break;
	 case 0:
	 break;
	 default:
	}
	}while(ch !=0);
	}
    }
	