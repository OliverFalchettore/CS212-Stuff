package lab18;
public class Bill extends Money{
   private int dollars;
   
   public Bill (int d) {
	  if(d == 1 || d == 5 || d == 10 || d == 20 || d == 50 || d == 100) {
		  dollars = d;
	  }
	  else {
		  throw new IllegalBillException("Bill does not exist");
	  }
   }
   public int getValue () {
      return dollars;
   }
   
   public String toString() {
	   return "$ " + dollars + ".00";
   }
}
