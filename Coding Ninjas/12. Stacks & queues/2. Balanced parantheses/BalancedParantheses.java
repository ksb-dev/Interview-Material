import java.util.*;

public class BalancedParantheses {

	public static void main(String[] args) {
		String s = "{()[]{}}";
		System.out.println(isBalanced(s));
	}

    public static boolean isBalanced(String s) {
        //Your code goes here
        Stack<Character> ch = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            char x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{'){
                ch.push(x);
            }

            if(ch.isEmpty())
                return false;

            char check;

            switch(x) {
                case ')':
                    check = ch.pop();
                    if(check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = ch.pop();
                    if(check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = ch.pop();

                    if(check == '(' || check == '{')
                        return false;

                    break;
              }
          }

          return(ch.isEmpty());
    }
}