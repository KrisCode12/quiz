package package1;
import com.sun.jdi.InvalidLineNumberException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class LabExcer5B {
    public static void main(String[] args) throws BlankAnswerExceptions, InvalidLetterExceptions {
        Scanner scan = new Scanner(System.in);
        int ctr = 0;
        int x = 0;

        String q[] = new String[10];
        String a[] = new String[10];
        String b[] = new String[10];
        String c[] = new String[10];
        String ans[] = new String[10];
        String[] validLetter = new String[3];

        validLetter[0] = "a";
        validLetter[1] = "b";
        validLetter[2] = "c";

        //questions
        q[0] = "What is the largest country?";
        q[1] = "What is the biggest mammals?";
        q[2] = "What is the smallest country?";
        q[3] = "which are not a JDM car brand?";
        q[4] = "how many rings does Kobe Bryant have?";
        q[5] = "What is the largest planet?";
        q[6] = "IDE that is used in Java?";
        q[7] = "Which is not a guitar brand?";
        q[8] = "Who is not an NBA player?";
        q[9] = "Who is not a member of guns n roses?";

        //Choices
        a[0] = "Russia";
        b[0] = "China";
        c[0] = "India";
        //a
        a[1] = "Elephant";
        b[1] = "Trex";
        c[1] = "Antartic blue whale";
        //c
        a[2] = "Pakistan";
        b[2] = "Vatican City";
        c[2] = "Sri Lanka";
        //b
        a[3] = "Nissan";
        b[3] = "Ford";
        c[3] = "Toyota";
        //b
        a[4] = "1";
        b[4] = "0";
        c[4] = "5";
        //c
        a[5] = "Mars";
        b[5] = "Neptune";
        c[5] = "Jupiter";
        //c
        a[6] = "Intellij";
        b[6] = "Eclipse";
        c[6] = "both A and B";
        //c
        a[7] = "Fender";
        b[7] = "BMW";
        c[7] = "Gibson";
        //b
        a[8] = "Lionel Messi";
        b[8] = "Stephen Curry";
        c[8] = "Luka Doncic";
        //a

        a[9] = "Slash";
        b[9] = "John Mayer";
        c[9] = "Axl Rose";
        //b
        ans[0] = "a";
        ans[1] = "c";
        ans[2] = "b";
        ans[3] = "b";
        ans[4] = "c";
        ans[5] = "c";
        ans[6] = "c";
        ans[7] = "b";
        ans[8] = "a";
        ans[9] = "b";

        System.out.println("Welcome to a short quiz");

        for (x = 0; x < 10; x++) {
            try {
                System.out.println(x + 1 + ". " + q[x]);
                System.out.println("A. " + a[x]);
                System.out.println("B. " + b[x]);
                System.out.println("C. " + c[x]);
                System.out.println("Enter your answer: ");
                String useranswer = scan.nextLine();
                System.out.println("\n");

                if (useranswer.equalsIgnoreCase("a") || useranswer.equalsIgnoreCase("b") ||
                        useranswer.equalsIgnoreCase("c")) {
                    if (useranswer.equalsIgnoreCase(ans[x])) {
                        ctr++;
                    }
                } else if (useranswer.equalsIgnoreCase("") || useranswer.equals(" ")) {
                    throw new BlankAnswerExceptions();
                } else {
                    throw new InvalidLetterExceptions();
                }
            } catch (InvalidLetterExceptions ile) {
                System.out.println(ile.getMessage());
                --x;
            } catch (BlankAnswerExceptions bae) {
                System.out.println(bae.getMessage());
                --x;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                --x;
            }
        }

        System.out.println("Your score is: " +ctr +"/10"  );
    }
}

class InvalidLetterExceptions extends Exception {
    public InvalidLetterExceptions() {
        super("An Invalid letter please enter A, B and C only \n");
    }
}
class BlankAnswerExceptions extends Exception {
    public BlankAnswerExceptions() {
        super("You don't have any answer\n");

    }
}
