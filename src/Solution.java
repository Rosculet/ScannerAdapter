import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String str = fileScanner.nextLine();
            String [] strings = str.split(" ");

            Date date = new Date(Integer.parseInt(strings[3]),Integer.parseInt(strings[4]),Integer.parseInt(strings[5]));

            Person person = new Person(strings[0],strings[1],strings[2],date);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}


