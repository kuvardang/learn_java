package problem;

public class sender {

	//attributes
	String phonenum;
	int amount;
	String address;
	double latitude;
	double longitude;
	

     void setsenderDetails(String phonenum, int amount, String address, double latitude, double longitude){
      this.phonenum= phonenum;
      this.amount= amount;
      this.address= address;
      this.latitude= latitude;
      this.longitude= longitude;

}
    void showsenderDetails() {
	    System.out.println("____Showing you sender's data_______");
	    System.out.println("PHONENUM="+ phonenum);
	    System.out.println("AMOUNT="+ amount);
	    System.out.println("ADDRESS="+ address);
	    System.out.println("latitude and longitude="+ latitude);
	    System.out.println("___________________________________");
	  
    }
}
