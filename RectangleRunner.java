import java.util.Scanner;
public class RectangleRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter word 1: ");
        String str1 = scan.nextLine();
        System.out.print("Enter word 2: ");
        String str2 = scan.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1>len2){
            System.out.println(str1 + " is longer");
        }else if (len2>len1){
            System.out.println(str2 + " is longer");
        } else {
            System.out.println("Both strings have the same length");
        }
        if (len1%2==0){
            int half1even = len1/2;
            
            String half = str1.substring(0,half1even);
            String half2 = str1.substring(half1even);
            System.out.println("First half: " + half);
            System.out.println("Second half: " + half2);
        } else{
            int half1odd = len1/2;
            String half = str1.substring(0,half1odd);
            String half2 = str1.substring(half1odd);
            System.out.println("First half: " + half);
            System.out.println("Second half: " + half2);
        }
        if (len2%2==0){
            int half2even = len2/2;
            
            String half = str2.substring(0,half2even);
            String half2 = str2.substring(half2even);
            System.out.println("First half: " + half);
            System.out.println("Second half: " + half2);
        } else{
            int half2odd = len2/2;
            String half = str2.substring(0,half2odd);
            String half2 = str2.substring(half2odd);
            System.out.println("First half: " + half);
            System.out.println("Second half: " + half2);
        }
        int index = str1.indexOf(str2);
        if(index==-1){
            System.out.println(str2+ " is NOT found in " + str1);
        } else{
            System.out.println(str2 + " is found in " + str1 + " at index " + index);
        }
    }
}
        


