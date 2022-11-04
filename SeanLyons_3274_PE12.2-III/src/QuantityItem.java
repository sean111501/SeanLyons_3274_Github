/**
 * 
 * @author Sean Lyons Date: 11/1/2022
 *
 */
public class QuantityItem extends AbstractItem {
	private int Quantity;
	private double TotalPrice;
	private String ProductName;
	private double Price;

	public int getQuantity() {
		return Quantity;
	}

	public QuantityItem(Product product, int x) {
		Quantity = x;
		ProductName = product.getDescription();
		Price = product.getPrice();

	}

	@Override
	public double getTotalPrice() {

		return TotalPrice = Quantity * Price;
	}

	@Override
	public String getDescription(int length) {
		return String.format("%-" + (length - 13) + "s%8.2f%5d", ProductName, Price, Quantity, TotalPrice);

	}

}