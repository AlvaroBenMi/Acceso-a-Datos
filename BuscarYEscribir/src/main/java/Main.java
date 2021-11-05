
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static File askFilePath(){
        log.info("Ruta del directorio");
        String userFile = scan.nextLine();

        File filepath = new File(userFile);

        return filepath;
    }

    public static String askUserTextToRead(){
        log.info("Texto a leer");
        return scan.nextLine();
    }

    public static int countWordInFile(String textToFind, File filePath){
        int counter = 0;
        try (BufferedReader reader = new BufferedReader(
                new FileReader(askFilePath()))){
            String line;
            while ((line = reader.readLine()) != null){
                if (line.contains(textToFind)){
                    counter++;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return counter;
    }

    public static void writeResult(int numbreToWrite, File destFile){
        try (FileWriter writer = new FileWriter(destFile)){
            writer.write("Resultado del texto es: " + numbreToWrite);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeResult(countWordInFile(askUserTextToRead(), askFilePath()), askFilePath());
    }
}
