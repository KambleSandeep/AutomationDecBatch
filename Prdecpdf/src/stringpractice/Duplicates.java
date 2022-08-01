package stringpractice;

public class Duplicates {
	public static void main(String[] args) {


String original="This is java Program";

String  Words [] = original.split(" ");

String reversedString = " "; 

for (int i=0; i<Words.length; i++)

reversedString = " "+ Words[i] +reversedString; 

System.out.println(reversedString);


				}
			

		}
	