package problem;

/*
class person {
	
}

class picture{ 
	
}
*/
public class snapchat {

	public static void main(String[] args) {
		
		person p1 = new person();
		picture p2 = new picture();
		p1.pRef=p2;
		
		// for priniting hashcodes
		System.out.println("p1 is"+p1);
		System.out.println("p2 is"+p2);
		
		p1.setDataForperson("Kuvar",'M', "Black");
		p2.setDataForpicture("coloured", 20000, "yes");
		
		p1.showDataForperson();
		//p1.showDataFor();
	}
	

}
