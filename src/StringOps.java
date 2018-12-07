
public class StringOps {
	private static final String singleValueSelection = "catalog.SALE_NUMBER='";
	private static final String multipleValueSelection = "catalog.SALE_NUMBER BETWEEN ";
	private static final String and = " AND ";

	public static void main(String[] args) {
		String userSelection = "22, 23-100, 999-1090, 2000-2099, 3214";
		userSelection=userSelection.replace(" ", "");
		
		String[] userSelArray = userSelection.split(",");

		String selectionString = "";	

		for (String userSel : userSelArray) {
			int i = userSel.indexOf("-");

			if (i == -1) {
				selectionString = selectionString.concat(addSingleValue(selectionString, userSel));
			} else {
				selectionString = selectionString.concat(addRangeValue(selectionString, userSel));
			}
		}

		System.out.println(selectionString);
	}

	private static String addSingleValue(String selectionString, String singleValue) {
		if (selectionString == null || selectionString == "" || selectionString == " ") {
			return " " + singleValueSelection + singleValue + "'";
		} else {
			return and + singleValueSelection + singleValue + "'";
		}
	}

	private static String addRangeValue(String selectionString, String rangeValue) {
		String[] values = rangeValue.split("-");
		
		if (selectionString == null || selectionString == "" || selectionString == " ") {
			return " " + multipleValueSelection + values[0] + and + values[1];
		} else {
			return and + multipleValueSelection + values[0] + and + values[1];
		}				
	}
}
