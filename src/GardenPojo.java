public class GardenPojo {
	private String garden;
	private String destination;
	private String component;
	private int bags;
	private Double qty;

	@Override
	public boolean equals(Object obj) {
	    return (obj instanceof GardenPojo && ((((GardenPojo) obj).garden.equals(this.garden)) && ((GardenPojo) obj).destination.equals(this.destination)));
	}		
	
	public String getGarden() {
		return garden;
	}

	public void setGarden(String garden) {
		this.garden = garden;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public int getBags() {
		return bags;
	}

	public void setBags(int bags) {
		this.bags = bags;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

}
