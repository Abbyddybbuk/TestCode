import java.util.ArrayList;
import java.util.List;

public class MaterialSort {

	public static void main(String[] args) {
		List<MaterialPojo> materialList = new ArrayList<>();

		MaterialPojo material1 = new MaterialPojo();
		material1.setMatnr("M111");
		material1.setMatnrType("Food");
		material1.setSupplier("TEST1");
		material1.setQuantity(10);
		material1.setPrice(20);
		materialList.add(material1);

		MaterialPojo material2 = new MaterialPojo();
		material2.setMatnr("M112");
		material2.setMatnrType("Food");
		material2.setSupplier("TEST2");
		material2.setQuantity(11);
		material2.setPrice(30);
		materialList.add(material2);

		MaterialPojo material3 = new MaterialPojo();
		material3.setMatnr("M113");
		material3.setMatnrType("Food");
		material3.setSupplier("TEST1");
		material3.setQuantity(7);
		material3.setPrice(35);
		materialList.add(material3);

		MaterialPojo material4 = new MaterialPojo();
		material4.setMatnr("M114");
		material4.setMatnrType("Food");
		material4.setSupplier("TEST2");
		material4.setQuantity(8);
		material4.setPrice(40);
		materialList.add(material4);

		MaterialPojo material5 = new MaterialPojo();
		material5.setMatnr("M115");
		material5.setMatnrType("Cosmetic");
		material5.setSupplier("TEST3");
		material5.setQuantity(1);
		material5.setPrice(9);
		materialList.add(material5);

		MaterialPojo material6 = new MaterialPojo();
		material6.setMatnr("M116");
		material6.setMatnrType("Cosmetic");
		material6.setSupplier("TEST4");
		material6.setQuantity(2);
		material6.setPrice(18);
		materialList.add(material6);

		MaterialPojo material7 = new MaterialPojo();
		material7.setMatnr("M117");
		material7.setMatnrType("Cosmetic");
		material7.setSupplier("TEST3");
		material7.setQuantity(3);
		material7.setPrice(27);
		materialList.add(material7);

		MaterialPojo material8 = new MaterialPojo();
		material8.setMatnr("M118");
		material8.setMatnrType("Clothes");
		material8.setSupplier("TEST4");
		material8.setQuantity(1);
		material8.setPrice(7);
		materialList.add(material8);

		MaterialPojo material9 = new MaterialPojo();
		material9.setMatnr("M119");
		material9.setMatnrType("Clothes");
		material9.setSupplier("TEST5");
		material9.setQuantity(2);
		material9.setPrice(13);
		materialList.add(material9);

		MaterialPojo material10 = new MaterialPojo();
		material10.setMatnr("M119");
		material10.setMatnrType("Clothes");
		material10.setSupplier("TEST4");
		material10.setQuantity(2);
		material10.setPrice(13);
		materialList.add(material10);

		for (MaterialPojo material : materialList) {
			System.out.println(material.getMatnr() + " " + material.getMatnrType() + " " + material.getSupplier() + " "
					+ material.getPrice() + " " + material.getQuantity());
		}
		
		materialList = MaterialSort.deleteDuplicatesByMatnrTypeSupplier(materialList);
		
		System.out.println();
		System.out.println();
		
		//After Deleting Duplicates
		for (MaterialPojo material : materialList) {
			System.out.println(material.getMatnr() + " " + material.getMatnrType() + " " + material.getSupplier() + " "
					+ material.getPrice() + " " + material.getQuantity());
		}		
	}

	private static List<MaterialPojo> deleteDuplicatesByMatnrTypeSupplier(List<MaterialPojo> materialList) {		
		List<MaterialPojo> finalMaterialList = new ArrayList<>();
		int i=0;
		
		for (MaterialPojo material : materialList) { 
			if (finalMaterialList.indexOf(material) == -1) {
				finalMaterialList.add(material);
			}
		}
		// TODO Auto-generated method stub
		return finalMaterialList;
	}

}
