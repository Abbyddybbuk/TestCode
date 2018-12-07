public class ArrayBuilder {
	public static void main(String[] args) {
		String[][] states = new String[3][2];
		states[0][0] = "Madhya Pradesh";
		states[0][1] = "Bhopal";
		states[1][0] = "Rajasthan";
		states[1][1] = "Jaipur";
		states[2][0] = "Karnataka";
		states[2][1] = "Bengaluru";

		for (int i = 0; i < states.length; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("The capital of ").append(states[i][0]).append(" is ").append(states[i][1]).append(".");
			System.out.println(sb);
		}
	}
}
