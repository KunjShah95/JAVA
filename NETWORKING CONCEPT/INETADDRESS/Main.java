
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress myaddress = InetAddress.getLoopbackAddress(); // 127.0.0.1
        System.out.println(myaddress.getAddress().length);

        if (myaddress.isAnyLocalAddress()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
