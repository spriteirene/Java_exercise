/*Wuyan Xu Homework2*/
public class HW2 {

  /*a method to test whether a string follows the aplhabetical order*/
 public static boolean isAlphabeticalOrder(String s) {            
    int n = s.length(); 
    char c = s.charAt(0);
    for (int i = 1; i < n; i++) { 
      if (Character.isLetter(s.charAt(i))) {
        if (s.charAt(i) <= c) {
          return false;
        } 
        else {
          c = s.charAt(i);
        }
      }
    }
    return true;
   }

 /*a method to remove the character in a string for the n occurences */
 public static String removeNchars(String s, int n, char c) {
   int l = s.length();
   StringBuilder sb = new StringBuilder();
   for (int i = 0; i < l; i++) {
     if (s.charAt(i) != c && n !=0) {
       char m = s.charAt(i);
       sb.append(m);
     }
     else if (n <= 0 ) {
       char m = s.charAt(i);
       sb.append(m);
     }
     else if (s.charAt(i) == c){
       n--;
     }
   }
   return sb.toString();
 }

 /*a method to remove the same context of the second string in the first string */
 public static String removeString(String s1, String s2) {
   int i = 0;
   int j = 0;
   char c;
   StringBuilder sb = new StringBuilder();
      while (j < s2.length() && i < s1.length()) {
       if (s1.charAt(i) == s2.charAt(j)) {
         if (s1.length() - i >= s2.length() - j) {
           i++;
           j++;
         }
         else {
           c = s1.charAt(i);
           sb.append(c);
           i++;
         }
       }
       else if (s1.charAt(i) != s2.charAt(j)) {
         if (s1.charAt(i) != s2.charAt(0)) {
           c = s1.charAt(i);
           sb.append(c);
           i++;
           j = 0;
         }
         else if (s1.charAt(i) == s2.charAt(0)) {
           for (int m = 0; m < i; m++) {
             c = s1.charAt(m);
             sb.append(c);
           }
           i++;
           j = 1;
         }
       }
       while (j >= s2.length()) {
         j = 0;
       }
      }
   return sb.toString();
  }
 

 /*a method to remove the char one position to the right*/
 public static String moveAllXsRight (char c, String s) {
   for (int i = s.length() -1; i > 0; i--) {
     if (i != s.length() -1 -1) {
       if (s.charAt(i-1) == c) {
         char temp;
         temp = s.charAt(i);
         char temp2;
         temp2 = s.charAt(i -1);
         temp = c;
         temp2 = temp;
         
       }
     }
   }
   return s;
 }
}
       


       
     
       



