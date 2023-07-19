import java.util.Scanner;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the string !!!");
        String string=scanner.next();
        int size=string.length();
        char stringArray[]=string.toCharArray();

        String longestPalindrome=longestPalindromeString(stringArray,size);
        System.out.println("Longest Palindrome String is : "+longestPalindrome);
    }

    private static String longestPalindromeString(char[] stringArray, int size) {
        int maxlen=0;
        int leftInd=-1;
        int rightInd=-1;
        for(int i=0;i<size;i++){
            int left=size-1;
            int right=i;
            while(left>=0 && right<size){
                if(stringArray[left]!=stringArray[right]){
                    break;
                }
                if(right==size-1 && left==i){
                    break;
                }
                left--;
                right++;
            }
            if(maxlen<(right-left+1)){
                leftInd=left;
                rightInd=right;
                maxlen=(right-left+1);
            }
        }
        String str="";
        for(int i=leftInd;i<=rightInd;i++){
            str+=stringArray[i];
        }
        return str;
    }
}