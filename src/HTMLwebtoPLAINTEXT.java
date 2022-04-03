import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;

import java.io.IOException;

public class HTMLwebtoPLAINTEXT {
    public static void main(String... args) {
        try {
            String url = "https://hust.edu.vn/";
            Document document = Jsoup.connect(url).get();
            String htmlString = document.html();
            String outputText = Jsoup.clean(htmlString, new Whitelist());

            System.out.println(outputText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
