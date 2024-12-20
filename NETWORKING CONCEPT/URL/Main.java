
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        try {
            String web = "https://en.wikipedia.org/wiki/URL#citiations";
            URL url = new URL(web);
            getURL(url);
        } catch (MalformedURLException e) {
            System.err.println("Malformed URL: " + e.getMessage());
        }
    }

    static void getURL(URL url) {
        System.out.println("HOST: " + url.getHost());
        System.out.println("PATH: " + url.getPath());
        System.out.println("Ref: " + url.getRef());
        System.out.println("Port: " + url.getPort());
    }
}
