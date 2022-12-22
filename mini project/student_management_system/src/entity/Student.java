package entity;
import java.util.Scanner;

public class Student extends Person{

	   int rollno;
	  String department;
	  double totalMarks;
	  

	  public Student(){
		  
	  }
	  Student(int rollno, String firstName, String lastName, String department , String city, double totalMarks){
           this.rollno =  rollno;
           this.firstName = getFirstName();
           this.lastName = getLastName();
           this.department = department;
           this.city = getCity();
           this.Gender=getGender();
           this.totalMarks = totalMarks;
	  
  }
	  
	  public  void insert() {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Student rollNo");
		  rollno=sc.nextInt();
		  
		  System.out.println("Enter Student FirstName");
		  setFirstName(sc.next());
		  
		  System.out.println("Enter Student LastName");
		  setLastName(sc.next());
		  
		  System.out.println("Enter Stduent department");
		  department=sc.next();
		  
		  System.out.println("Enter Stduent city");
		  setCity(sc.next()); 
		  
		  System.out.println("Enter Student Gender");
		  setGender(sc.next());
		  
		  System.out.println("Enter Student total Marks");
		  totalMarks=sc.nextDouble();  
		  
	  }

	public void display() {
		  System.out.println("rollNo:"+rollno+"\n"+"First Name "+getFirstName()+"\n"
				  +"Last Name "+getLastName()+"\n"+"Gender "+getGender()+"\n"+"Department "+department+"\n"
				  +"City "+getCity()+"\n"+"total Marks "+totalMarks);
	  }
	  
	  
		public Student searchByStudentId(Student[] array , int rollno) {
			
			for(int i = 0 ; i < array.length ; i++) {
				
				if(array[i].rollno  == rollno)//110
					return array[i];
				
			}
			
			
			return null;
			
		}

		public Student[] searchByDepartment(Student[] array, String department) {
			
			Student[] arr = new Student[array.length];
			
			   for(int i = 0 , j = 0; i< array.length ; i++) {
				   
				   if(array[i].department .equals(department)) {
					   arr[j] = array[i];
				   }   
			   }
			return arr;
		}
		public Student[] searchByFirstName(Student[] array,String firstName) {
			
			Student[] arr=new Student[array.length];
			
			  for(int i = 0 , j = 0; i< array.length ; i++) {
				   
				   if(array[i].getFirstName() .equals(firstName)) {
					    arr[j] = array[i];
				   }   
			   }
			
			return arr;
			
		}
		public Student[] searchByLastName(Student[] array,String lastName) {
			Student[] arr=new Student[array.length];
			
			  for(int i = 0 , j = 0; i< array.length ; i++) {
				   
				   if(array[i].getLastName() .equals(lastName)) {
					    arr[j] = array[i];
				   }   
			   }
			return arr;
		}
		public Student[] searchByGender(Student[] array,String Gender) {
			Student[] arr=new Student[array.length];
			
			  for(int i = 0 , j = 0; i< array.length ; i++) {
				   
				   if(array[i].getGender() .equals(Gender)) {
					    arr[j] = array[i];
				   }   
			   }
			
			return arr;
			
		}
		public Student[] searchByCity(Student[] array,String city) {
			Student[] arr=new Student[array.length];
			
			  for(int i = 0 , j = 0; i< array.length ; i++) {
				   
				   if(array[i].getCity() .equals(city)) {
					    arr[j] = array[i];
				   }   
			   }
			
			return arr;
			
		}
		public void exit() {
			System.out.println("Exit Student record successfully");
		}
	  

}