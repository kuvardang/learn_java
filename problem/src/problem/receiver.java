package problem;

public class receiver {

	String name;
	int accountnum;
	
	void setreceiverDetails(String name, int accountnum) {
	this.name= name;
	this.accountnum= accountnum;

}
	void showreceiverDetails() {
		System.out.println("_____showing data for receiver___");
		System.out.println("name="+name);
		System.out.println("accountnum="+ accountnum);
		System.out.println("___________________________");
	}
}