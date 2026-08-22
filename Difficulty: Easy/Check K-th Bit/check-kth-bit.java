class CheckBit {
    static boolean checkKthBit(int n, int k) {
        Stack<Character> st = new Stack<>();
        String bits = Integer.toBinaryString(n);
        for(int i = 0; i < bits.length(); i++) {
            st.push(bits.charAt(i));
        }
        String result = "";
        while(!st.isEmpty()) {
            result += st.pop();
        }
        if(k >= result.length()) {
            return false;
        }
        return result.charAt(k) == '1';
    }
}