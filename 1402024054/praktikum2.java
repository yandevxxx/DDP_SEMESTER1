
public class praktikum2 {
    public static void main(String[] jian) {
        String[] kata = {
            "OBP gna7uj3eP",
            "g2ni5d0ogn a5sib h3adu ukAa",
            "r12053epol416e3veD kcat8S ll0uF",
            "ma9et yM5"
        };

        int i = 0;
        while (i < 4) {
            System.out.println(checking(kata[i]));
            i++;
        }
    }

    public static String checking(String kata) {
        String isiKeluaran = "";
        int i = 0;
        while (i < kata.length()) {
            isiKeluaran += kata.charAt(kata.length() - (i + 1));
            i++;
        }
        return isiKeluaran.replaceAll("[0-9]", "");
    }
}



