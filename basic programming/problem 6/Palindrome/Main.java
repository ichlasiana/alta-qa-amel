public class Main {
    private static boolean palindrome(String value) {
        String a = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            a += value.charAt(i);
        }
        if(value.equals(a)){
            return true;
        }return false;

    }
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}