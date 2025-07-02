package filereader;

import java.io.File;
import java.util.Random;

class FileReaderException extends Exception {}
class FileNotFoundException extends FileReaderException {}
class FileTooLargeException extends FileReaderException {}

public class FileReader {
    String filename;
    File file;

    FileReader(String filename) {
        this.filename = filename;
    }

    int open() throws FileReaderException {

        Random r = new Random();

        int getal = r.nextInt(100);
        if (getal < 50) {
            throw new FileNotFoundException();
        } else if (getal < 70) {
            throw new FileTooLargeException();
        } else {
            file = new File(filename);
        }

        return getal;
    }

}

class programma {
    public static void main(String[] args) {
        FileReader fr = new FileReader("programma.txt");
        try {
            int getal = fr.open();
            System.out.println(getal);
        } catch (FileReaderException e) {

        }


    }
}
