package flowcontrolstatements;

public class Ex5 {
	public static void main(String[] args) {
		char ch1 = '9';
		if((ch1 >= 65 && ch1 <= 90)||(ch1 >= 97 && ch1 <= 122))
		{
			System.out.println("Alphabet");
		}
		else if(ch1 >= 48 && ch1 <= 57)
		{
			System.out.println("Number");
		}
		else
		{
			System.out.println("Special Character");
		}
	}
}
