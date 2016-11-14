
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Asgmt1TestCase {


		Asgmt1 duplicate = new Asgmt1();
		/* Question1 unit test cases
 		 *	
		 */
		
		/* 
		 * Test testEmptyArray
		 * Test empty array
		 * @return -2
		 */
		@Test
		public void testEmptyArray() 
		{
			int[] emptyArr = new int[]{};
			assertEquals(-2, duplicate.findDuplicate(emptyArr));
		}
		
		/* 
		 * Test testUniqueArray
		 * Tests unique array
		 * @return -1
		 */
		@Test
		public void testUniqueArray()
		{
			int[] uniqueArr = new int[]{1,2,3,5,95,456,4000,55000,99000};
			assertEquals(-1, duplicate.findDuplicate(uniqueArr));
		}
		
		/*
		 * Test testValidDuplicateArray
		 * Tests valid array for one duplicate number
		 * @return duplicate number
		 */
		@Test
		public void testValidDuplicateArray()
		{
			int[] validArray = new int[]{1,2,3,5,95,456,4000,55000,4000,99000};
			assertEquals(4000, duplicate.findDuplicate(validArray));
		}
		// Question2 unit test cases
		
		/*
		 * Test  testAllDoubleRepeatString
		 * Test a string with all duplicate characters
		 * @return null
		 */
		@Test
		public void testAllDoubleRepeatString()
		{
			String str = "aabbccddee";
			Character doubleRepeatChar = Asgmt1.firstNonRepeatedCharacter(str);
			assertEquals(null, doubleRepeatChar);
		}
		
		/*
		 * Test  testNonRepeatString
		 * Test a string with no duplicate character
		 * @return null
		 */
		@Test
		public void testNonRepeatString()
		{
			String str = "asbdne";
			Character nonRepeatChar = Asgmt1.firstNonRepeatedCharacter(str);
			assertEquals('a', nonRepeatChar.charValue());
		}
		
		/*
		 * Test  testFindFirstNonRepeatedCharString
		 * Test a string with no duplicate character
		 * @return null
		 */
		@Test
		public void testFindFirstNonRepeatedCharString()
		{
			String str = "defd";
			Character nonRepeatChar = Asgmt1.firstNonRepeatedCharacter(str);
			assertEquals('e', nonRepeatChar.charValue());
		}
		
		
}
