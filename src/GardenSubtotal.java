import java.util.ArrayList;
import java.util.List;

public class GardenSubtotal {

	public static void main(String[] args) {
		List<GardenPojo> gardenList = new ArrayList<>();

		GardenPojo g1 = new GardenPojo();
		g1.setGarden("BURHIGANG");
		g1.setDestination("HBDP");
		g1.setComponent("3CSAO34");
		g1.setBags(21);
		g1.setQty(966.0);
		gardenList.add(g1);

		GardenPojo g2 = new GardenPojo();
		g2.setGarden("BURHIGANG");
		g2.setDestination("PULP");
		g2.setComponent("3SDO34");
		g2.setBags(35);
		g2.setQty(1400.0);
		gardenList.add(g2);

		GardenPojo g3 = new GardenPojo();
		g3.setGarden("BURHIGANG");
		g3.setDestination("PULP");
		g3.setComponent("3CSDO34");
		g3.setBags(25);
		g3.setQty(1024.0);
		gardenList.add(g3);

		GardenPojo g10 = new GardenPojo();
		g10.setGarden("BURHIGANG");
		g10.setDestination("KOLP");
		g10.setComponent("3CSFO34");
		g10.setBags(35);
		g10.setQty(1190.0);
		gardenList.add(g10);

		GardenPojo g4 = new GardenPojo();
		g4.setGarden("BURHIGANG");
		g4.setDestination("NONP");
		g4.setComponent("3CSEO34");
		g4.setBags(22);
		g4.setQty(726.0);
		gardenList.add(g4);

		GardenPojo g5 = new GardenPojo();
		g5.setGarden("LIMBUGURI");
		g5.setDestination("SAMP");
		g5.setComponent("4EO44");
		g5.setBags(119);
		g5.setQty(3927.0);
		gardenList.add(g5);

		GardenPojo g7 = new GardenPojo();
		g7.setGarden("LIMBUGURI");
		g7.setDestination("SAMP");
		g7.setComponent("4MO44");
		g7.setBags(25);
		g7.setQty(750.0);
		gardenList.add(g7);

		GardenPojo g6 = new GardenPojo();
		g6.setGarden("LIMBUGURI");
		g6.setDestination("NONP");
		g6.setComponent("4BO44");
		g6.setBags(20);
		g6.setQty(620.0);
		gardenList.add(g6);

		GardenPojo g8 = new GardenPojo();
		g8.setGarden("SILONIJAN");
		g8.setDestination("SAMP");
		g8.setComponent("4MO44");
		g8.setBags(80);
		g8.setQty(2480.0);
		gardenList.add(g8);

		GardenPojo g9 = new GardenPojo();
		g9.setGarden("SILONIJAN");
		g9.setDestination("SAMP");
		g9.setComponent("4EO44");
		g9.setBags(80);
		g9.setQty(2800.0);
		gardenList.add(g9);

		for (GardenPojo garden : gardenList) {
			System.out.println(garden.getGarden() + " " + garden.getDestination() + " " + garden.getComponent() + " "
					+ garden.getBags() + " " + garden.getQty());
		}

		System.out.println();
		System.out.println();
		gardenList = fetchSubTotals(gardenList);

		for (GardenPojo garden : gardenList) {
			System.out.println(garden.getGarden() + " " + garden.getDestination() + " " + garden.getComponent() + " "
					+ garden.getBags() + " " + garden.getQty());
		}

	}

	private static List<GardenPojo> fetchSubTotals(List<GardenPojo> gardenList) {
		List<GardenPojo> finalgardenList = new ArrayList<>();
		List<GardenPivot> gardenPivotList = new ArrayList<>();
		int grandTotalNumOfBags = 0;
		Double grandTotalQty = 0.00;

		for (GardenPojo gardenRow : gardenList) {
			GardenPivot gardenPivot = new GardenPivot();
			gardenPivot.setGarden(gardenRow.getGarden());

			if (gardenPivotList.indexOf(gardenPivot) == -1)
				gardenPivotList.add(gardenPivot);
		}

		int k = 0;
		for (GardenPivot gardenPivot : gardenPivotList) {
			int gardenwiseNumOfBags = 0;
			Double gardenwiseQty = 0.0;

			for (int i = 0; i < gardenList.size(); i++) {
				if ((gardenPivot.getGarden().equals(gardenList.get(i).getGarden()))) {
					gardenwiseNumOfBags = gardenwiseNumOfBags + gardenList.get(i).getBags();
					gardenwiseQty = gardenwiseQty + gardenList.get(i).getQty();
				}
			}

			grandTotalNumOfBags = grandTotalNumOfBags + gardenwiseNumOfBags;
			grandTotalQty = grandTotalQty + gardenwiseQty;

			int destinationwiseNumOfBags = 0;
			Double destinationwiseQty = 0.0;
			int firstRecordInd = 1;
			int size = gardenList.size();
			for (int j = k; j <= size; j++) {
				if (j == gardenList.size()) {
					finalgardenList.add(addSubSectionDestinationTotal(destinationwiseNumOfBags, destinationwiseQty));
					break;
				}

				if ((gardenPivot.getGarden().equals(gardenList.get(j).getGarden()))) {
					if (finalgardenList.indexOf(gardenList.get(j)) == -1) {

						if (firstRecordInd != 1) {
							finalgardenList
									.add(addSubSectionDestinationTotal(destinationwiseNumOfBags, destinationwiseQty));
						}
						destinationwiseNumOfBags = 0;
						destinationwiseQty = 0.0;
						firstRecordInd++;
					}
					finalgardenList.add(gardenList.get(j));
					destinationwiseNumOfBags = destinationwiseNumOfBags + gardenList.get(j).getBags();
					destinationwiseQty = destinationwiseQty + gardenList.get(j).getQty();

				} else {
					finalgardenList.add(addSubSectionDestinationTotal(destinationwiseNumOfBags, destinationwiseQty));
					k = j;
					break;
				}
			}

			GardenPojo gardenSubtotal = new GardenPojo();
			gardenSubtotal.setComponent("Gardenwise Total:");
			gardenSubtotal.setGarden(" ");
			gardenSubtotal.setDestination(" ");
			gardenSubtotal.setBags(gardenwiseNumOfBags);
			gardenSubtotal.setQty(gardenwiseQty);
			finalgardenList.add(gardenSubtotal);
		}

		GardenPojo gardenGrandtotal = new GardenPojo();
		gardenGrandtotal.setComponent("Grand Total:");
		gardenGrandtotal.setGarden(" ");
		gardenGrandtotal.setDestination(" ");
		gardenGrandtotal.setBags(grandTotalNumOfBags);
		gardenGrandtotal.setQty(grandTotalQty);
		finalgardenList.add(gardenGrandtotal);

		return finalgardenList;

	}

	private static GardenPojo addSubSectionDestinationTotal(int destinationwiseNumOfBags, Double destinationwiseQty) {
		GardenPojo destinationSubtotal = new GardenPojo();
		destinationSubtotal.setComponent("Destinationwise Total");
		destinationSubtotal.setGarden(" ");
		destinationSubtotal.setDestination(" ");
		destinationSubtotal.setBags(destinationwiseNumOfBags);
		destinationSubtotal.setQty(destinationwiseQty);
		return destinationSubtotal;

	}

}
