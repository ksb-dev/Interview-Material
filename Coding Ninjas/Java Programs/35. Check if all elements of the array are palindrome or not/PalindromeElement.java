class TestPalindromeElement{

	 boolean testPalindromeElement(int[] a){

		boolean finalResult = true;

		for(int i = 0; i < a.length; i++){

			boolean result = isPalindrome(a[i]);

			if(result == false){

				finalResult = result;
			}
	    }

	    return finalResult;
	}

	 boolean isPalindrome(int a){

		String s = ""+a;

		for(int i = 0; i < s.length() / 2; i++){

			if(s.charAt(i) != s.charAt(s.length() - i - 1)){

				return false;
			}
		}
		return true;
	}
}


public class PalindromeElement{

	public static void main(String[] args){

		TestPalindromeElement t = new TestPalindromeElement();

		int[] a = {111, 121, 222, 333, 444};

		//int[] a = { 121, 131, 20 };

		boolean result = t.testPalindromeElement(a);

		if(result == true){

			System.out.println("All array elements are palindrome");
		}
		else{

			System.out.println("All array elements are not palindrome");
		}
	}
}