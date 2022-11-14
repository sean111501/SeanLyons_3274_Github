/**
 * Describes a quantity of an article to purchase.
 * 
 * @author Sean Lyons Date: 11/8/2022 - We removed the format 11/10/2022 - We
 *         are entering the getters
 * 
 */
public class LineItem {
	private int quantity;
	private Product theProduct;

	/**
	 * Constructs an item from the product and quantity.
	 * 
	 * @param aProduct  the product
	 * @param aQuantity the item quantity
	 */
	public LineItem(Product aProduct, int aQuantity) {
		theProduct = aProduct;
		quantity = aQuantity;
	}

	/**
	 * Computes the total cost of this line item.
	 * 
	 * @return the total price
	 */
	public double getTotalPrice() {
		return theProduct.getPrice() * quantity;
	}

	public String getDescription() {
		return theProduct.getDescription();
	}

	public double getPrice() {
		return theProduct.getPrice();
	}

	public int getQuantity() {
		return quantity;
	}

}
