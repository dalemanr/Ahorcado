import java.util.Scanner;

public class JavaGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String secretWord = "inteligencia";
        int chance = 10;
        int turn = 0;
        boolean isYourWord = false;

        char[] wordsGuessed = new char[secretWord.length()];

        for (int i = 0; i < wordsGuessed.length; i++)
        {
            wordsGuessed[i] = '_' ;
        }
        while (!isYourWord && turn < chance)
        {
            System.out.println("Guess a word: " + String.valueOf(wordsGuessed) + " (" + secretWord.length() + " letters!!!)");
            System.out.print("Your letter: ");
            char letter = Character.toLowerCase(sc.next().charAt(0));

            boolean correct = false;
            for (int i = 0; i < wordsGuessed.length; i++)
            {
                if(secretWord.charAt(i) == letter){
                    wordsGuessed[i] = letter ;
                    correct = true;
                }
            }

            if(!correct)
            {
                turn ++;
                System.out.println("Wrong letter, try again: " +(chance - turn) + " chances");
            }

            if(String.valueOf(wordsGuessed).equals(secretWord))
            {
                isYourWord = true;
                System.out.println("Your word is correct: " + secretWord);
            }
        }

        if(!isYourWord)
        {
            System.out.println("Sorry you lost");
        }

        sc.close();


    }
}
