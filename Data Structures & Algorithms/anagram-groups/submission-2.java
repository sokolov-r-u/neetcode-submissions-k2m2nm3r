class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            String join = join(word);
            map.computeIfAbsent(join, v -> new ArrayList()).add(word);
        }
        return map.entrySet().stream()
        .map(e -> e.getValue())
        .toList();
    }

    private String join(String str) {
        char[] chars = str.toCharArray();
        int[] array = new int[26];
        for (int i = 0; i < chars.length; i++) {
            int idx = chars[i] - 'a';
            array[idx] = ++array[idx];
        }
        return Arrays.toString(array);
    }
}
