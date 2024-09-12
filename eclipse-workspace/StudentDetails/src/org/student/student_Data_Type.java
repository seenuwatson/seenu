package org.student;

public class student_Data_Type {  
	public  void studentNumberDetails() {
	                                                  // data type variableName = value;
	byte age =127;                                   /// byte value -128 to 127
	short wight = 81;                               //// short value -32768 to 32767
	int BMI = 2700;                                ///// int value ( 9 digit)
	long numberofday = 45676677l;                 ////// long value (19) digit 
	 float salary = 63000.6688f;                 /////// float value before 9 digit and after point 7 digit
	 double hight = 180.634;                    //////// double before 19 digit and after point 15 digit
	        
	 char gender = 'M';                                                                                        ///      ///
	 String name = "beat crikcket player dhoni           ";                                                   /////   //////
	 System.out.println(age+wight);                                                                          /////// ////////
	 System.out.println(age+"\n"+wight+"\n"+BMI+"\n"+numberofday+"\n"+salary+"\n"+hight);                   /////////////////    
	 System.out.print("nummber 1"+name);                                                                     ///////////////
	 System.out.println(  gender);                                                                            ////////////
	}                                                                                                          /////////
	                                                                                                            //////
	public static void main( String [] argm) {                                                                   ///
		student_Data_Type dee=new student_Data_Type();	                                                         //
	 dee.studentNumberDetails();   
     
     
 Student_Firstday_Class student=new Student_Firstday_Class();
   	student.studentMerks();
   	student.studentName();
   	student.studentMobile();
	}}
	 