package studentpro;

import java.util.Scanner;

import entity.Student;


public class Menu {

	
	  static Student e=new Student();
	   static Student[] array =null;
	   

	   
	public static void options(){
		int option=0,option1=0,option2=0,num=0,num1=0;
		Scanner sc = new Scanner(System.in);
		
	
		do{	
			  System.out.println(" 1. menu");
			  System.out.println(" 2. Exit");

			  
			   option = sc.nextInt();
			   
			  switch(option) {
				case 1:
						 
					do {
					       System.out.println("1. Insert student record");
					       System.out.println("2. View student records");
					       System.out.println("3. Search student record by roll Number");
					       System.out.println("4. Search student record by First Name");
					       System.out.println("5. Search student record by Last Name");
					       System.out.println("6. Search student record by department");
					       System.out.println("7. Search student record by Gender");
					       System.out.println("8. Search student record by city");
						   System.out.println("9. Exit student portal");

		                   option1 = sc.nextInt();
		                   
							switch(option1)
							{
							case 1:
									System.out.println("number of records");
									num = sc.nextInt();
									array=new Student[num];
									for(int i=0;i<num;i++) {
										
										array[i]=new Student();
										array[i].insert();	
										System.out.println("------------------------------");
									}
									break;
							case 2:
									
									for(int i=0;i<num;i++) {
									
										array[i].display();
										System.out.println("-----------------------------");
									}
									break;
							case 3:
									
									System.out.println(" enter student rollno ");
									int rollNo = sc.nextInt();
									
									Student  std1 = e.searchByStudentId(array , rollNo);// base address ( address of first element)
								
									if(std1 == null) {
										System.out.println(" No such record found");
										System.out.println("------------------------------");
									}
									
									else
										std1.display();
										System.out.println("------------------------------");
				
									break;
									
							case 4:
									
									
									System.out.println(" enter student first Name: ");
									String empFirst = sc.next();// 
									
									Student [] std2 = new Student[array.length];
											std2= e.searchByFirstName(array , empFirst);
									
									for(int i = 0 ; i < std2.length ; i++) {
										if(std2[i] != null) {
										std2[i].display();
										System.out.println("-----------------------------");
										}
										else {
											System.out.println("No record found");
											System.out.println("-----------------------------");
										}
										
									}
				
									break;
							case 5:
									
								System.out.println(" enter student last Name: ");
								String stdLast = sc.next();// 
								Student [] std3 = new Student[array.length];
										std3= e.searchByLastName(array , stdLast);
								
								for(int i = 0 ; i < std3.length ; i++) {
									if(std3[i] != null) {
									std3[i].display();
									System.out.println("------------------------------");
									}
									else {
										System.out.println("No record found");
										System.out.println("------------------------------");
									}
								}
			
								break;
									
							case 6:
								System.out.println(" enter student Department Name: ");
								String dept = sc.next();// 
								Student [] std = new Student[array.length];
										std= e.searchByDepartment(array , dept);
								
								for(int i = 0 ; i < std.length ; i++) {
									if(std[i] != null) {
									std[i].display();
									System.out.println("------------------------------");
									}
									else {
										System.out.println("No record found");
										System.out.println("-----------------------------");
									}
								}
			
								break;
									
							case 7:
									
									System.out.println(" enter Student Gender : ");
									String stdGender = sc.next();// 
									Student [] std4 = new Student[array.length];
									std4= e.searchByGender(array , stdGender);
									
									for(int i = 0 ; i < std4.length ; i++) {
										if(std4[i] != null) {
											std4[i].display();
										System.out.println("------------------------------");
										}
										else {
											System.out.println("No record found");
											System.out.println("-----------------------------");
										}
									}
				
									break;
							case 8:
										System.out.println(" enter Student city : ");
										String stdcity = sc.next();// 
										Student [] std5 = new Student[array.length];
										std5= e.searchByCity(array , stdcity);
										
										for(int i = 0 ; i < std5.length ; i++) {
											if(std5[i] != null) {
												std5[i].display();
											System.out.println("------------------------------");
											}
											else {
												System.out.println("No record found");
												System.out.println("-----------------------------");
											}
										}
									break;
										
									
							case 9:	
										e.exit();
										break;
										
									}
						
						}while(option1!=9);
		
				break;
				
		case 2:
			System.out.println("Exit  Application Successfully");
			System.exit(0);
	    }
		}while(option!=4);

	}
	
}
