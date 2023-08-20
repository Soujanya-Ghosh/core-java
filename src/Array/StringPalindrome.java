package Array;

public class StringPalindrome {
    public static void main(String[] args) {
        String name="soujanya";
        char[] ch=name.toCharArray();
        int j= ch.length-1;
        int i=0;
        while(i<j){
            if(ch[i] != ch[j])
            {
                System.out.println("Not a palindrome");
            }else {
                i++;
                j--;
            }
        }
        System.out.println("It is a palindrome");

    }
    }

    
