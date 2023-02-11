

/* 
 * 1.1 IS UNIQUE
 * Description: Implement an algorithm to determine if a string has all unique 
 * characters. Additional data structures can not be used.
 * 
 */

public class IsUnique {
    // Best case running time: 0(N^2) - with no additional space
    // Best case space complexity: 0(1)
    public boolean checkIfUnique(String stringToCheck) {
      for(int i = 0; i < stringToCheck.length(); i++) {
        for(int j = 0; j < stringToCheck.length(); j++) {
          if(i == j) {
            continue;
          }
          // Found a duplicate
          if(stringToCheck.charAt(i) == stringToCheck.charAt(j)) {
            return true;
          }
        }
      } 
      // No Duplicates Found
      return true;
    }
  }