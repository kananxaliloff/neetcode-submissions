class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> occurrencesFirst = new HashMap<>();

        for (char sChar : s.toCharArray()) {

            Integer count = occurrencesFirst.getOrDefault(sChar, 0);

            occurrencesFirst.put(sChar, count + 1);
        }

        for (char tChar : t.toCharArray()) {

            Integer count = occurrencesFirst.get(tChar);

            if (count == null || count == 0) {
                return false;
            }

            occurrencesFirst.put(tChar, count - 1);
        }

        return true;
    }
}
