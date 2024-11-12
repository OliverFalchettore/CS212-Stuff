package lab18;



public class Wallet {
  private MoneyList walletContents = new MoneyList();
  
  public Wallet(){
	  
  }
  public void addToWallet(Money m){
	  walletContents.append(m);
	  
  }
  public void print () {
	  MoneyNode p = walletContents.first.next;
	  while (p != null) {
		  System.out.println(p.data.toString());
		  p = p.next;
	  }
  }
  public String getValue() {
	   int dollars = 0;
	   int cents = 0;
	   
	   MoneyNode p = walletContents.first.next;
	   
	   for (int i = 0; i < walletContents.getLength(); i++) {	
		   if(p.data instanceof Bill) {
			   dollars += ((Bill) p.data).getValue();
		   }else {
			   cents += ((Coin) p.data).getValue();
		   }
	   }
	   
	   if (cents >= 100) {
		   cents += (cents % 100);
	   }
	   
	   dollars += (cents / 100);
	   
	   return "Total: " + dollars + "." + cents;	   
	  
  }
}
