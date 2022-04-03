import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

public class HTMLtoTXT {
    public static void main(String... args) {
        String htmlString = "<div><h1>Xin chào, mình là Vũ Hoài Nam.</h1><p> Nam đẹp trai</p></div>";
        String outputText = Jsoup.clean(htmlString, new Whitelist());

        System.out.println(outputText);
    }
}
