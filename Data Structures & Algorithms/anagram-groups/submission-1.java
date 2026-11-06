class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            String sorted = sort(word);
            map.computeIfAbsent(sorted, v -> new ArrayList()).add(word);
        }
        return map.entrySet().stream()
        .map(e -> e.getValue())
        .toList();
    }

    private String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
