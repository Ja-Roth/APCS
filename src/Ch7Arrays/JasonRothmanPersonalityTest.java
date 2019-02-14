package Ch7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class JasonRothmanPersonalityTest {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner asker =new Scanner(System.in);
        //File output;
        //PrintStream stream = new PrintStream(output);
        System.out.println("Whats the file name?");
        String fileName = asker.next();
        Scanner file = new Scanner(new File(fileName));
        String EI;
        String SN;
        String TF;
        String JP;

        while (file.hasNext()){
            file.next();
            file.next();
            String answers = file.next();
            EI = answers.substring(0,9);
            SN = answers.substring(10,29);
            TF = answers.substring(30,49);
            JP = answers.substring(50,79);

        }

    }
    public int countChar(String str, char c)
    {
        int count = 0;

        for(int i=0; i < str.length(); i++)
        {    if(str.charAt(i) == c)
            count++;
        }

        return count;
    }
}
