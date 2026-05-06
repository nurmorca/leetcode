class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        if (!text.contains(first) || !text.contains(second)) {
            return new String[0];
        }

        String[] words = text.split(" ");
        ArrayList<String> result = new ArrayList<String>();
        int i = 0;

        while (i < words.length - 2) {
            if (first.equals(words[i])) {
                if (second.equals(words[i + 1])) {
                    result.add(words[i + 2]);
                }
            }
            i++;
        }

        return result.toArray(new String[0]);
    }
}