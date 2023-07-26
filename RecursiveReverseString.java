public class RecursiveReverseString {
    public String reverseString(String str) {
        if (str.isEmpty()) {
            System.out.println("String is empty.");
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    /*
     * reverseString("JAVATPOINT")
     * reverseString("AVATPOINT")
     * reverseString("VATPOINT")
     * reverseString("ATPOINT")
     * reverseString("TPOINT")
     * reverseString("POINT")
     * reverseString("OINT")
     * reverseString("INT")
     * reverseString("NT")
     * reverseString("T")
     * reverseString("") - this is where str gets empty and prints "String is empty."
     * and recursive call gets returned and on each callback of recursive stack it returns
     * the charAt(0) of str like:
     * reverseString("T") -> T
     * reverseString("NT") -> TN
     * reverseString("INT") -> TNI
     * reverseString("OINT") -> TNIO
     * reverseString("POINT") -> TNIOP
     * reverseString("TPOINT") -> TNIOPT
     * reverseString("ATPOINT") -> TNIOPTA
     * reverseString("VATPOINT") -> TNIOPTAV
     * reverseString("AVATPOINT") -> TNIOPTAVA
     * reverseString("JAVATPOINT") -> TNIOPTAVAJ
     */

    public static void main(String[] args) {
        RecursiveReverseString rs = new RecursiveReverseString();
        String resultantSting = rs.reverseString("JAVATPOINT");
        System.out.println(resultantSting);
    }
}
