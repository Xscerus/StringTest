// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String ciag = "Długonos";
        String wycinek1 = "";
        String wycinek2 = "";
        String wycinek3 = "";
        if (ciag.length() > 2) {
            wycinek1 = ciag.substring(ciag.length() / 2 - 1, ciag.length() / 2 + 1);
            wycinek2 = ciag.substring(0, ciag.length() / 2 - 1);
            wycinek3 = ciag.substring(ciag.length() / 2 + 1);
            String add = wycinek2.concat(wycinek3);
            String result = wycinek1.concat(add);
            System.out.println(result);
        }
    }
}