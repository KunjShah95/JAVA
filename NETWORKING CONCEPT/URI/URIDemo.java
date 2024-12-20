
import java.net.URI;
import java.net.URISyntaxException;

public class URIDemo {

    public static void main(String[] args) {
        try {
            // Constructing a URI
            URI uri = new URI("https", "www.example.com", "/path/to/resource", "query=example", "fragment");

            // Accessing different components of the URI
            System.out.println("Scheme: " + uri.getScheme()); // https
            System.out.println("Authority: " + uri.getAuthority()); // www.example.com
            System.out.println("Host: " + uri.getHost()); // www.example.com
            System.out.println("Path: " + uri.getPath()); // /path/to/resource
            System.out.println("Query: " + uri.getQuery()); // query=example
            System.out.println("Fragment: " + uri.getFragment()); // fragment

            // Converting URI to URL
            System.out.println("URL: " + uri.toURL());

            // Normalizing the URI
            URI normalizedUri = uri.normalize();
            System.out.println("Normalized URI: " + normalizedUri);

            // Resolving a relative URI against the base URI
            URI relativeUri = new URI("/another/path");
            URI resolvedUri = uri.resolve(relativeUri);
            System.out.println("Resolved URI: " + resolvedUri);

            // Relativizing a URI against the base URI
            URI baseUri = new URI("https://www.example.com/path/");
            URI absoluteUri = new URI("https://www.example.com/path/to/resource");
            URI relative = baseUri.relativize(absoluteUri);
            System.out.println("Relative URI: " + relative);
        } catch (URISyntaxException | java.net.MalformedURLException e) {
        }
    }
}
