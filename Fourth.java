import java.util.Scanner;
/**
 *
 * @author User
 */
public class Fourth {
    
    public static void main(String[]  args){
        System.out.print("Input the String: ");
        Scanner userentery = new Scanner(System.in);
        String theword = userentery.next();
        
        System.out.print("Number of vowels in the string is "
                + thenumvowels(theword));
            
    }
    
    public static int thenumvowels(String word){
        int sum = 0;
        
        for (int k = 0; k < word.length(); k++){
            if (word.charAt(k) == 'a' || word.charAt(k) == 'e'
                    || word.charAt(k) == 'i' 
                    || word.charAt(k) == 'o'
                    || word.charAt(k) == 'u'){
            
                  sum++;
        }
            
        }
        return sum;
    }
    
    
}
