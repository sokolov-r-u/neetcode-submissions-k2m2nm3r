class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = initMap();
        for (int i = 0; i < s.length(); i++) {
            Character top = stack.peek();
            if (top != null && top == s.charAt(i)) {
                stack.pop();
            } else {
                Character closing = map.get(s.charAt(i));
                if(closing == null) {
                    return false;
                }
                stack.push(closing);
            }
        }

        return stack.isEmpty();
    }

    private Map<Character, Character> initMap() {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        return map;
    }
}
