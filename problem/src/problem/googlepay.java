package problem;

public class googlepay {

	public static void main(String[] args) { 
		
		sender[] arr = new sender[2];
		
				for (int i=0; i<arr.length; i++) {
				arr[i] = new sender();
			
		}
		
		receiver[] orr = new receiver[3];
		
				for (int i=0; i<orr.length; i++) {
				orr[i] = new receiver();
			
		}
			arr[0].setsenderDetails("8968510111", 5, "255 street", 679.70, 908.90);
			arr[1].setsenderDetails("8986851011", 200, "256 street", 709.80, 80.90 );
		
			orr[0].setreceiverDetails("abhi", 6789976);
			orr[1].setreceiverDetails("kuvs", 98786);
			orr[2].setreceiverDetails("vass", 78765);
		
			
	 paymode p1 = new paymode();
	 p1.setpaymodeDetails("SBIVALA", "PNBVALA", "GPVALA", arr, orr);
	 
	/* paymode p2 = new paymode();
	 p2.setpaymodeDetails("ohi", "hmm", "wow", arr, orr); */
	 
				System.out.println("KITNE KHARCH DIYE?");
				System.out.println(p1.debitc+"spent");
	}
}
