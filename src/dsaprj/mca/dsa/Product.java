 package dsaprj.mca.dsa;

public class Product {

		static int preID;
		String preName;
		double prePrice;
		void f1() {
	}
public Product(String preName, double prePrice) {
			super();
			this.preName = preName;
			this.prePrice = prePrice;
		}
@Override
public String toString() {
	return "Product [preName=" + preName + ", prePrice=" + prePrice + "]";
}
}

