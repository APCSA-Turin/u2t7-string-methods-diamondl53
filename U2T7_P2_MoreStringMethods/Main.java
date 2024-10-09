import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int count = 0;
        String leave = "-1";
        System.out.print("Enter first word: ");
        count++;
        String str1 = scan.nextLine();
        int len1 = str1.length();
        boolean quit = false;
        
        while(quit==false){
            int length1 = str1.length();
            int upTo1 = length1-2;
            String sub1 = str1.substring(upTo1);
            String subFirst = str1.substring(0,1);
            System.out.print("Enter next word or type \"-1\" to end game: ");
            String str = scan.nextLine();
            int len2 = str.length();
            count++;
            String sub2 = str.substring(0,2);
            int inside = str.indexOf(subFirst);

            if (str.equals(leave)){
                System.out.println("Game over");
                quit=true;
            } else {
                if(str.compareTo(str1)>0){
                score+=2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score );
            } if (str.compareTo(str1)<0){
                score-=5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            } if (str.equals(str1)){
                score-=10;
                System.out.println("-10 points: current word alphabetically same: SCORE " + score);
            } if(sub1.equals(sub2)){
                score+=5;
                System.out.println("+ 5 points: last 2 letters of previous match first 2 letters of current: SCORE " + score);

            } if(inside!=-1){
                score+=3;
                System.out.println("+ 3 points: first letter of previous is found somewhere in current: SCORE " + score);
            } if (len1==len2){
                score+=1;
                System.out.println("+1 point: previous is the same length as current; SCORE: " + score);
            }
            if(score>=50){
                quit=true;
                System.out.println("You win! It took you " + count + " words! Try again for a lower word count :)");
            } 
            str1 = str;
        }
    }
}
}



// } if(str.compareTo(str1)>0&&!sub1.equals(sub2)&&inside==-1){
//     score+=2;
//     System.out.println("+2 points: current word alphabetically after; SCORE: " + score );