/*Lohana, A. (2021, July 5). How to generate random number in JAVA? . Code Leaks. https://www.codeleaks.io/java-random-number/. 
Modified by Ahriika Jordan 2021
*/
/*YouTube. (2020). Java FileReader (read a file). YouTube. https://www.youtube.com/watch?v=Hr8tLlj32BQ. 
Modified by Ahriika Jordan 2021
*/

/*YouTube. (2020). Java FileWrite (write to a file). YouTube. https://www.youtube.com/watch?v=kjzmaJPoaNc. 
Modified by Ahriika Jordan 2021
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;

public class JordanStreamsTest2 {

    public static void main(String[] args) {

        /**
         * Try/catch function which will try to write to a new file, and catch any
         * exceptions. random numbers will be generated through the new Random() method.
         * 
         * @param write will write to a file labelled "data.txt".
         * @return a text file with randomly generated numbers.
         */

        try {
            FileWriter data = new FileWriter("data.txt", false);
            PrintWriter write = new PrintWriter(data);
            for (int i = 0; i < 10; i++) {
                Random randomInt = new Random();
                int rand = randomInt.nextInt();
                write.write(rand + ", ");
                write.println();
            }
            write.flush();
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Try/catch function which will try to write to an existing file, and catch any
         * exceptions. random numbers will be generated through the new Random() method.
         * 
         * @param write will append to an existing file labelled "data.txt".
         * @return a text file with randomly generated numbers.
         */
        try {
            FileWriter data = new FileWriter("data.txt", true);
            PrintWriter write = new PrintWriter(data);
            for (int i = 0; i < 10; i++) {
                Random randomInt = new Random();
                int rand = randomInt.nextInt();
                write.append(rand + ", ");
                write.println();
            }
            write.flush();
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Try/catch function which will try to read a file, and catch any exceptions.
         * The read method will read the randomly generated numbers as written by the
         * FileWrite method.
         * 
         * @param FileReader will read the "data.txt" file.
         * @return displays the text file's randomly generated numbers.
         */
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            for (int i = 0; i < 20; i++) {
                String line = reader.readLine();
                System.out.println(line);
            }
            reader.close();
        }

        catch (IOException f) {
            f.printStackTrace();
        }
    }
}
