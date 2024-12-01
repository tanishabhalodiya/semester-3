import java.util.*;
//desinging anagram game using array
public class L5p32{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of words: ");
        int N=sc.nextInt();
        String a[]=new String[N];


        //giving new line..
        
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            System.out.println("a["+i+"] : "+a[i]);
        }
        //generate random number.
        Random random=new Random();
        int  r1=random.nextInt(N);

        //take number as random index and display the word.
        String displayedWord=a[r1];
        System.out.println("word of random index is: "+displayedWord);

        //tell user to enter anagram word.
        System.out.println("enter anagram of displayed number : ");
        String word=sc.nextLine();

        //check the given word is anagram of displayed word or not.

        if(displayedWord.length()==word.length()){
            char[] ch1=displayedWord.toCharArray();
            char[] ch2=word.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(ch1.equals(ch2)){
                System.out.println("Words are anagram of each other.");
            }
        }
        else if(displayedWord.length()!=word.length()){
            System.out.println("words are not anagram of each other.");
        }

    }
