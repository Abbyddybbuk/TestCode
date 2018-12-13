public class GardenPivot {
	private String garden;

	@Override
	public boolean equals(Object obj) {
	    return (obj instanceof GardenPivot && ((((GardenPivot) obj).garden.equals(this.garden))));
	}		

	public String getGarden() {
		return garden;
	}

	public void setGarden(String garden) {
		this.garden = garden;
	}
	
	
}
