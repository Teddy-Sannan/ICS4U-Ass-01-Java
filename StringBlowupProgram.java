/****************************************************************************
 *
 * Created by: Teddy Sannan
 * Created on: February 2019
 * Created for: ICS4U
 * This program returns a version of the original string as follows:
 * each digit 0-9 that appears in the original string is replaced by that
 * many occurrences of the character to the right of the digit
 *
 ****************************************************************************/

import java.util.Scanner;

public class StringBlowupProgram
{

    public static void main(String[] args)
    {
        String output;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to blow up: ");
        String userString = scanner.nextLine();

        output = blowUp(userString);
        System.out.printf("%s%n", output);
    }

    public static String blowUp(String str)
    {
        // A buffer is like a string that can be modified
        StringBuffer buffer = new StringBuffer();

        // Check to see if string exists
        if (str.length() == 0)
        {
            String errorStr = "Error : No string found!";
            buffer.append(errorStr);
        }
        else
        {
            // Cycle through the string buffer and process
            for (int index = 0; index < str.length(); index++)
            {

                // Get character at current index
                char c = str.charAt(index);

                // Checks to see if character is a digit at current index
                if (Character.isDigit(c))
                {
                    // Checks to see if current index is not the last index of the string
                    if (index < str.length()-1)
                    {
                        // Convert character into integer
                        int numOfTimes = Integer.parseInt(Character.toString(c));

                        // Get next element
                        char next = str.charAt(index + 1);

                        // Appends next character numOfTimes times
                        for (int j = 0; j < numOfTimes; j++)
                        {
                            buffer.append(next);
                        }
                    }
                }
                // Appends character at current index if not digit
                else
                {
                    buffer.append(c);
                }
            }

        }

        return buffer.toString();
    }
}