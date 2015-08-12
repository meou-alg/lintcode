class Solution {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {

        if ((source == null) || (target == null)) return -1;

        int slen = source.length();
        int tlen = target.length();

        if (tlen == 0) return 0;
        if (slen == 0) return -1;

        int index = 0;
        while (index < slen) {
            int i = index;
            int j = 0;
            while (source.charAt(i) == target.charAt(j)) {
                i++;
                j++;
                if (j >= tlen) return index;
            }
            index++;
        }
        return -1;
    }
}