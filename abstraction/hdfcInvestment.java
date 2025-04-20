package abstraction;

public class hdfcInvestment implements MainBank {

	@Override
	public void showInvestment() {
		System.out.println("investment in HDFC abnk "+ MainBank.hdfcInvestment);
		
	}
	public static void main(String[] args) {
		hdfcInvestment h = new hdfcInvestment();
		h.showInvestment();
		
		sbiInvestment s = new sbiInvestment();
		s.showInvestment();
	}
	

	
}
