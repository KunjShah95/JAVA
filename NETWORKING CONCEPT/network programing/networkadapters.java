
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class networkadapters {

    public static void main(String[] args) {
        try {
            // Get all network interfaces
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();

            // Iterate through the network interfaces
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();

                // Print the name and display name of the network interface
                System.out.println("Name: " + networkInterface.getName());
                System.out.println("Display Name: " + networkInterface.getDisplayName());

                // Print if the network interface is up and running
                System.out.println("Is Up: " + networkInterface.isUp());

                // Print if the network interface is loopback
                System.out.println("Is Loopback: " + networkInterface.isLoopback());

                // Print if the network interface is virtual
                System.out.println("Is Virtual: " + networkInterface.isVirtual());

                // Print the MAC address
                byte[] mac = networkInterface.getHardwareAddress();
                if (mac != null) {
                    System.out.print("MAC Address: ");
                    for (int i = 0; i < mac.length; i++) {
                        System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
                    }
                    System.out.println();
                }

                System.out.println();
            }
        } catch (SocketException e) {
        }
    }
}
