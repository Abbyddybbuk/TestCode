import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSubtotalCode {
	public static void main(String[] args) {
		List<MaterialDto> materialList = new ArrayList<>();

		MaterialDto material1 = new MaterialDto();
		material1.setMatnr("M111");
		material1.setMatnrType("Food");
		material1.setSupplier("TEST1");
		material1.setQuantity(10);
		material1.setPrice(20);
		materialList.add(material1);

		MaterialDto material2 = new MaterialDto();
		material2.setMatnr("M112");
		material2.setMatnrType("Food");
		material2.setSupplier("TEST2");
		material2.setQuantity(11);
		material2.setPrice(30);
		materialList.add(material2);

		MaterialDto material3 = new MaterialDto();
		material3.setMatnr("M113");
		material3.setMatnrType("Food");
		material3.setSupplier("TEST1");
		material3.setQuantity(7);
		material3.setPrice(35);
		materialList.add(material3);

		MaterialDto material4 = new MaterialDto();
		material4.setMatnr("M114");
		material4.setMatnrType("Food");
		material4.setSupplier("TEST2");
		material4.setQuantity(8);
		material4.setPrice(40);
		materialList.add(material4);

		MaterialDto material5 = new MaterialDto();
		material5.setMatnr("M115");
		material5.setMatnrType("Cosmetic");
		material5.setSupplier("TEST3");
		material5.setQuantity(1);
		material5.setPrice(9);
		materialList.add(material5);

		MaterialDto material6 = new MaterialDto();
		material6.setMatnr("M116");
		material6.setMatnrType("Cosmetic");
		material6.setSupplier("TEST4");
		material6.setQuantity(2);
		material6.setPrice(18);
		materialList.add(material6);

		MaterialDto material7 = new MaterialDto();
		material7.setMatnr("M117");
		material7.setMatnrType("Cosmetic");
		material7.setSupplier("TEST3");
		material7.setQuantity(3);
		material7.setPrice(27);
		materialList.add(material7);

		MaterialDto material8 = new MaterialDto();
		material8.setMatnr("M118");
		material8.setMatnrType("Clothes");
		material8.setSupplier("TEST4");
		material8.setQuantity(1);
		material8.setPrice(7);
		materialList.add(material8);

		MaterialDto material9 = new MaterialDto();
		material9.setMatnr("M119");
		material9.setMatnrType("Clothes");
		material9.setSupplier("TEST5");
		material9.setQuantity(2);
		material9.setPrice(13);
		materialList.add(material9);

		MaterialDto material10 = new MaterialDto();
		material10.setMatnr("M119");
		material10.setMatnrType("Clothes");
		material10.setSupplier("TEST4");
		material10.setQuantity(2);
		material10.setPrice(13);
		materialList.add(material10);

		for (MaterialDto material : materialList) {
			System.out.println(material.getMatnr() + " " + material.getMatnrType() + " " + material.getSupplier() + " "
					+ material.getPrice() + " " + material.getQuantity());
		}

		System.out.println(" ");
		System.out.println(" ");

		materialList = ListSubtotalCode.fetchSubtotalList(materialList);

		for (MaterialDto material : materialList) {
			System.out.println(material.getMatnr() + " " + material.getMatnrType() + " " + material.getSupplier() + " "
					+ material.getPrice() + " " + material.getQuantity());
		}

	}

	private static List<MaterialDto> fetchSubtotalList(List<MaterialDto> materialList) {
		List<MaterialDto> tempMaterialList = new ArrayList<>();
		List<MaterialDto> finalMaterialList = new ArrayList<>();
		List<MaterialKeys> materialKeys = new ArrayList<>();

		for (MaterialDto material : materialList) {
			MaterialKeys materialKey = new MaterialKeys();
			materialKey.setSupplier(material.getSupplier());
			materialKey.setMatnrType(material.getMatnrType());

			if (materialKeys.indexOf(materialKey) == -1)
				materialKeys.add(materialKey);
		}

		for (MaterialKeys materialKey : materialKeys) {
			int quan = 0;
			int price = 0;
			for (int i = 0; i < materialList.size(); i++) {
				if ((materialKey.getSupplier().equals(materialList.get(i).getSupplier()))
						&& (materialKey.getMatnrType().equals(materialList.get(i).getMatnrType()))) {
					finalMaterialList.add(materialList.get(i));
					quan = quan + materialList.get(i).getQuantity();
					price = price + materialList.get(i).getPrice();
				}
			}
			MaterialDto materialSubtotal = new MaterialDto();
			materialSubtotal.setMatnr(" ");
			materialSubtotal.setMatnrType("Sub-Total");
			materialSubtotal.setSupplier(" ");
			materialSubtotal.setPrice(price);
			materialSubtotal.setQuantity(quan);
			finalMaterialList.add(materialSubtotal);
		}

		return finalMaterialList;
	}
}
