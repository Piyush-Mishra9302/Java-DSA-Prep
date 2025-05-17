public class RemoveSpecialChars {
    public static void main(String[] args) {
        // Removing special characters with the help of regular expressions and replaceAll methid

        String str1 = "#$%123#$%678";

        // str1 = str1.replaceAll("[^a-zA-z0-9]", "");
        // System.out.println(str1);
        //======================
        //practice again

        str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str1);
    }
}
