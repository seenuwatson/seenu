package org.Lang;
  
  
public class StateDetils {
	public void southIndia() {
		System.out.println("65%");
	}
	public void northIndia() {
		System.out.println("47%");
	}
	public static void main (String []args) {
		LanguageInfo san=new  LanguageInfo();
		 
	     san.tamilLanguage();
	     san.englishLanguage();
	     san.hindiLanguage();
	    
	     StateDetils san2 =new   StateDetils();
			
	     
	     
	     
	     san2.southIndia();
	     san2.northIndia(); 
	     
	}
	

	
}
