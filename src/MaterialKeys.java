
public class MaterialKeys {
	private String matnrType;
	private String supplier;

	@Override
	public boolean equals(Object obj) {
	    return (obj instanceof MaterialKeys && ((((MaterialKeys) obj).matnrType == this.matnrType) && ((MaterialKeys) obj).supplier == this.supplier));
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
}
