public class Functions {
	public int factorial(int num) {
		int factorial = 1;
	    for(int i = num; i >= 2; i--){
	      factorial = factorial * i;
	    }
	    return factorial;
	}
	public boolean IsPalindrome(String str) {
	    String reverse = new StringBuffer(str).reverse().toString();
	    if (str.equals(reverse))
	      return true; 
	    else
	      return false;
	}
	public boolean CharacterExist(String str,char cSearch) {
    for(int i=0; i<str.length(); i++) 
    {
        char chr = str.charAt(i);
            if(cSearch == chr)
            return true; 
    }
    return false;
	}
	public int CalculateCube(int num) {
		return num*num*num;
	}
	public boolean IsPrime(int num ) {
		 int factors = 0;
		    for(int i = 1; i <= num; i++){
		        if(num % i == 0) 
		        factors++;
		     }
		    if(factors == 2)//As prime numb
		        return true;
		    else
		        return false;
	}
}