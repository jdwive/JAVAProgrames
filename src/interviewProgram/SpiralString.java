package interviewProgram;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SpiralString {
	public static void spiralString(String str, int lastIndex) {
		String temp=str.substring(lastIndex,str.length())+str.substring(0,lastIndex);
		System.out.println(temp);
	}
	public static void main(String[] args) {
		String str="kuhu";
		spiralString(str, str.length()-1);
		spiralString(str, str.length()-2);
		spiralString("Jigyasa", "Jigyasa".length()-2);
		String text = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(text);
	}

}
