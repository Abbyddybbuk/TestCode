
public class MaterialPojo {
	private String matnr;
	private String matnrType;
	private String supplier;
	private int quantity;
	private int price;
	
	@Override
	public boolean equals(Object obj) {
	    return (obj instanceof MaterialPojo && ((((MaterialPojo) obj).matnrType == this.matnrType) && ((MaterialPojo) obj).supplier == this.supplier));
	}	
	
	public String getMatnrType() {
		return matnrType;
	}

	public void setMatnrType(String matnrType) {
		this.matnrType = matnrType;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getMatnr() {
		return matnr;
	}

	public void setMatnr(String matnr) {
		this.matnr = matnr;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
