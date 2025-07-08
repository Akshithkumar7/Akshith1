package dsaprj.mca.dsa;

public class MAkepayment extends Payment{
	void pay() {
		System.out.println("cash");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MAkepayment p=new MAkepayment();
		p.pay();
		p.printbill();

	}

}
