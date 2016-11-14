import java.util.*;
public class Asgmt1 {

	/* Question1
  	 * Given an array with 1,000,000 integers
	 * between 1 and 1,000,000, one integer is in the array twice. 
	 * Find the duplicate.
	 */
	
	 /*
	 * Function findDuplicate 
	 * Finds the duplicate number in an array
	 * 
	 * @param arr
	 * @return -2 empty array
	 * @return -1 unique array
	 * @return 	duplicate number in array
	 * complexity: O(k) where k is index at which duplicate was found
	 */
    public int findDuplicate(int [] arr){
        // find length of array
        int arrlen=arr.length;
        // if length of array is zero.
        if( arrlen  == 0)
        {
            return -2;
        }
        
    	// HashMap for storing unique values between 
        Map<Integer, Boolean> array_map = new HashMap<Integer, Boolean>();
        
        // Scan the array for unique numbers and if there exists a duplicate return it. 
        for(int i=0;i<arrlen;i++){
        	Boolean pv = array_map.putIfAbsent(arr[i], Boolean.TRUE);
	        // if number present in Map 
        	if(pv !=null)
	        { 
	        	// return duplicate number
	        	return arr[i];
	        }
        }

        return -1;      
    }
    
    /* 
     * Question 2
     * Find the first non‐repeating character in a string
     * Complexity: O(n+k) where n is length of string and 
     * k is the number of unique characters in string
     * Assumed String containsonly letters no number and special characters 
     */
    /*
     * Function firstNonRepeatedCharacter
     * Finds the first non-repeating character in a string 
     * @param inputString
     * @return null empty string/ repeating characters in string
     * @return character non-repeating character
     */
    
    public static Character firstNonRepeatedCharacter(String inputString){
		/*
		* Converting all characters to lowercase and
		*removing spaces and special characters from string 
		*/
		inputString=inputString.toLowerCase();
        inputString=inputString.replaceAll("\\P{L}", "");
        inputString =inputString.replaceAll("\\s+", "");
        
        // if string is empty throw NullPointerException 
        if(inputString==null){
        	throw new NullPointerException("String is null");
        	}
        
        //LinkedHashMap for maintaining insertion order.
        Map<Character,Integer>  map= new LinkedHashMap<Character ,Integer>();
        char ar[]=inputString.toCharArray();
        char ch ;
        
        // scanning the string for characters and its count to be inserted in HashMap
        for (int i=0; i<ar.length; i++){
         ch=ar[i];
         //if map already contains this character as key, increment value corresponding to key .
         if(map.containsKey(ch))   
         {   
        	 map.put(ch, map.get(ch)+1 );
         }
         //Since the character is encountered first time put it in map with value 1.
         else        
         {
        	 map.put(ch, 1) ;
         }
        }    
        
        /* 
        * Map has all unique characters in map as key
        * and their corresponding encounters in string as values.
        * Scan the map to find the character with value 1 
        * for determining the non-repeating character.
        */      
        for (int i=0; i<ar.length; i++ ){
         ch= ar[i];
         // first non-repeating character in string.
         if( map.get(ch)  == 1 )   
         {
             return ch;
         }
        }
        return null ;
    }
    
    public static void main(String[] args) {
    
    }    
}
