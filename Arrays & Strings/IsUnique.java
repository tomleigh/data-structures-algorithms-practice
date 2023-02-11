

/* 
 * 1.1 IS UNIQUE
 * Description: Implement an algorithm to determine if a string has all unique 
 * characters. Additional data structures can not be used.
 * 
 */

public class IsUnique {
    // Best case running time: 0(N)
    // Best case space complexity: 0(1)
    public boolean checkIfUnique(String stringToCheck) {
      if(stringToCheck.length() > 128) {
        return false;
      }

      boolean[] char_exists = new boolean[128];
      for(int i = 0; i < stringToCheck.length(); i++) {
        int current = stringToCheck.charAt(i);
        if(char_exists[current]) {
          return false;
        }
        char_exists[current] = true;
      } 
      // No Duplicates Found
      return true;
    }
  }