import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestFunctions {
	@Test
	void trueEqualAssertionInFactorialShouldPass() {
	Functions obj = new Functions();
	Assertions.assertEquals(120, obj.factorial(5));
	}
	@Test
	void falseEqualAssertionInFactorialShouldFail() {
	Functions obj1 = new Functions();
	Assertions.assertEquals(125, obj1.factorial(5));
	}
	
	@Test
	void validPalindromeTrueAssertionShouldPass() {
	Functions obj = new Functions();
	Assertions.assertTrue(obj.IsPalindrome("level"));
	}
	@Test
	void nullCaseForNullObjectShouldPass() {
	Functions obj=null;
	Assertions.assertNull(obj);
	}
	@Test
	void invalidPalindromeTrueAssertionShouldFail() {
	Functions obj1 = new Functions();
	Assertions.assertEquals(true, obj1.IsPalindrome("chdri"));
	}
	
	@Test
	void characterExistsShouldPass() {
	Functions obj = new Functions();
	Assertions.assertTrue(obj.CharacterExist("level",'l'));
	}
	@Test
	void characterDoesNotExistShouldFail() {
	Functions obj1 = new Functions();
	Assertions.assertTrue(obj1.CharacterExist("chdri",'l'));
	}
	
	@Test
	void notPrimeNumberFalseAssertionShouldPass() {
	Functions obj = new Functions();
	Assertions.assertFalse(obj.IsPrime(4));
	}
	@Test
	void validPrimeNumberTrueAssertionShouldPass() {
	Functions obj1 = new Functions();
	Assertions.assertTrue(obj1.IsPrime(7));
	}
	
	@Test
	void invalidPrimeNumberTrueAssertionShouldFail() {
	Functions obj1 = new Functions();
	Assertions.assertTrue(obj1.IsPrime(9));
	}
	@Test
	void invalidPalindromeFalseAssertionShouldPass() {
	Functions obj1 = new Functions();
	Assertions.assertFalse(obj1.IsPalindrome("chdri"));
	}
	@Test
	void validEqualAssertionInCubeShouldPass()
	{
	Functions obj = new Functions();
	Assertions.assertEquals(27, obj.CalculateCube(3));
	}
	@Test
	void invalidEqualAssertionShouldInCubeFail() {
	Functions obj1 = new Functions();
	Assertions.assertEquals(625, obj1.CalculateCube(5));
	}
	@Test
	void nullCaseForInitializedObjectShouldFail() {
	Functions obj1 = new Functions();
	Assertions.assertNull(obj1);
	}
	@Test
	void notNullForIntializedObjectShouldPass() {
		Functions obj1 = new Functions();
		Assertions.assertNotNull(obj1);
	}
	
}