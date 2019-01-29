package problem;

public class picture {

	String type;
	int pixsize;
	String texted;
	
	void setDataForpicture(String tp, int ps, String txt) {
		
	type=  tp;
	pixsize= ps;
	texted= txt;
	
	}
	
	void showDataForpicture() {
		System.out.println("_____________picture's data_______");
		System.out.println("type="+type);
		System.out.println("pixsize="+pixsize);
		System.out.println("texted or not?="+texted);
		// syso ctrl + space
		
	}
}