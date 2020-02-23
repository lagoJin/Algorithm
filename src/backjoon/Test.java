package backjoon;

public class Test {

    public static void main(String[] args) {

        Test test = new Test();
        int result = test.solution("aabcbcd", "abc");
        int result1= test.solution("aaaaabbbbbb", "ab");

        System.out.println("결과는 " + result + "입니다.");
        System.out.println("결과는 " + result1 + "입니다.");
    }

    public int solution(String s, String t) {
        int result = 0;

        int test = 0;
        while(s.contains(t)){
            s = s.replace(t, "");
            result++;
        }

        return result;
    }

}
