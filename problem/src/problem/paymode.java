package problem;

public class paymode {

	String debitc;
	String creditc;
	String scratchcard;
	
		sender[] senders; //1 to many
										//SENDER  AND RECEIVER HERE IS ANOTHER CLASS, YOU CAN SEE
		receiver[] receivers;
	
	void setpaymodeDetails(String debitc, String creditc, String scratchcard, sender[] senders, receiver[] receivers) {
		
		this.creditc= creditc;
		this.debitc= debitc;
		this.scratchcard= scratchcard;
		this.senders= senders;
		this.receivers= receivers;
	}

    void showpaymodeDetails() {
    	System.out.println("______________Showing data for paymode_________");
    	System.out.println("creditc="+ creditc);
    	System.out.println("debitc="+ debitc);
    	System.out.println("scratchcard="+ scratchcard);
    	System.out.println("_____________");
    	
    /*	for (sender sRef : senders ){
    				sRef.showsenderDetails();
    								}
    	
    	for (receiver rRef : receivers){
    				rRef.showreceiverDetails();
    								}
    	*/
    	
    	for(int i=0;i<senders.length;i++){
			senders[i].showsenderDetails();
    	}
    	for(int i=0;i<receivers.length;i++){
			receivers[i].showreceiverDetails();
    	
    	}
    	
    System.out.println("_________________________");				
    	
    }
}