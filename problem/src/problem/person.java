package problem;

public class person {
	
	// attributes
	String name;
	char gender;
	String haircolour;
	
	// pRef is refernce to picture object
	// 5th obj ( has a reln)
	picture pRef;
	
	// methods
	void setDataForperson(String nm, char gen, String hc){
		
		name= nm;
		gender= gen;
		haircolour= hc;
		
	}

    void showDataForperson() {
    	System.out.println("==========person's data=========");
    	System.out.println("name="+name);
    	System.out.println("gender="+gender);
    	System.out.println("haircolour="+haircolour);
    	System.out.println("____Showing you all my fraands picture details___");
    	pRef.showDataForpicture();
    	
    }
}
