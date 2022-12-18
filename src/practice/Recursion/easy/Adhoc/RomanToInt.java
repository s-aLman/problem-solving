package practice.Recursion.easy.Adhoc;

public class RomanToInt {
    static int romNum(char c){
        switch (c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    public static int romanToInt(String s) {
        int len = s.length(), sum=0;
        int[] num = new int[len];

        for(int i=0; i<len; i++)
            num[i] = romNum(s.charAt(i));

        for(int i=0; i<len; i++) {
            if(i==(len-1))
                sum+=num[i];
            else if( ((i+1)<len)  && (num[i]>=num[i+1]) )
                sum+=num[i];
            else if( ((i+1)<len)  && (num[i]<num[i+1]) ) {
                sum += (num[i+1]-num[i]);
                i++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("XII"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("CD"));
        System.out.println(romanToInt("XXXIV"));
    }
}
