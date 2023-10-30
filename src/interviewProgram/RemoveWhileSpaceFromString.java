package interviewProgram;

public class RemoveWhileSpaceFromString {
	public static String removeWhiteSpace(String str) {
		return str.replaceAll("\\s", "");
	}
	public static void main(String[] args) {
		System.out.println(removeWhiteSpace("My name is Jigyasa"));
		System.out.println(removeWhiteSpace("My     Name     Jig   yasa"));
	}
}
