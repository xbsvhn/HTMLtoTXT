import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;


public class HTMLtoTXT1 {

    /*read file
        private final static String FILE_URL = "C:/Users/Admin/Downloads/sample.html";

        public static void main(String[] args) throws IOException {
            File file = new File(FILE_URL);
            InputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);

            String line = "";
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

     */
    public static void main(String[] args) {
        try {
            String fileName = "C:/Users/Admin/Downloads/sample.html";
            Path filePath = Paths.get(fileName);
            byte[] fileBytes = Files.readAllBytes(filePath);
            String htmlString = new String(fileBytes, "UTF-8");
            String outputText = Jsoup.clean(htmlString, new Whitelist());

            System.out.println(outputText);
            //write file
            try {
                FileWriter myWriter = new FileWriter("C:/Users/Admin/Downloads/sample.txt");
                myWriter.write(outputText);
                myWriter.close();
                System.out.println("Done!");
            } catch (IOException e) {
                System.out.println("Error!");
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
