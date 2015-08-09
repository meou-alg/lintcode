public class Solution {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int last_a = a.length() - 1;
        int last_b = b.length() - 1;
        int last = last_a > last_b ? last_a : last_b;
        int carry = 0;
        for (int i = 0 ; i <= last; i++) {
            int curr = carry;
            // trick: index for a is last_a - i, not i
            if (( i <= last_a ) && (a.charAt(last_a - i) == '1')) curr++;
            if (( i <= last_b ) && (b.charAt(last_b - i) == '1')) curr++;
            carry = curr >> 1;
            curr = curr & 1;
            if (curr == 1) sb.append("1"); else sb.append("0");
        }
        if (carry == 1 ) sb.append("1");
        return sb.reverse().toString();
    }
}
