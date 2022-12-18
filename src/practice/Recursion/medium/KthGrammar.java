package practice.Recursion.medium;

public class KthGrammar {
    private static String NthGrammar(int N, int K) {
        if (N == 1) return "0";
        String prev = NthGrammar(N - 1, K);
        if(K<prev.length())
            return prev;
        StringBuilder res = new StringBuilder(prev);
        for (int i = 0; i < prev.length(); i++) {
            if (prev.charAt(i) == '0') res.append("1");
            else res.append("0");
        }
        System.out.println("Grammar "+res.toString());
        return res.toString();
    }
    private static int findKthBit(int N, int K) {
        String s;
        if(N>1)
            s = NthGrammar(N - 1, K);
        else
            s = "0";

        if(K==1)
            return 0;

        if (K <= (s.length())) {
            int bit = Integer.parseInt(String.valueOf(s.charAt(K - 1)));
            return bit;
        }
        else {
            int bit = Integer.parseInt(String.valueOf(s.charAt(Math.abs(s.length() - K) - 1)));
            return bit ^ 1;
        }
    }

    public static void main(String[] args) {
        int N = 4, K = 3;
        System.out.println(findKthBit(N, K));
    }
}
