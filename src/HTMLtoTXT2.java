import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLtoTXT2 {
    public static void main(String[] args) {
        try {
            String fileName = "C:/Users/Admin/Downloads/sample.html";
            File file = new File(fileName);
            Document document = Jsoup.parse(file, "UTF-8");
            String htmlString = document.html();
            String outputText = Jsoup.clean(htmlString, new Whitelist());

            System.out.println(outputText);
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
