/**
 * OOPS Banner Application
 * UC4 - Array & Loops Implementation
 *
 * @author Rishiraj Phukan
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

            String.join("  ", "*****", "*****", "*****", "*****"),

            String.join("  ", "*   *", "*   *", "*   *", "*    "),

            String.join("  ", "*   *", "*   *", "*   *", "*    "),

            String.join("  ", "*   *", "*   *", "*****", "*****"),

            String.join("  ", "*   *", "*   *", "*    ", "    *"),

            String.join("  ", "*   *", "*   *", "*    ", "    *"),

            String.join("  ", "*****", "*****", "*    ", "*****")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}