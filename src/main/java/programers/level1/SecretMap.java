package programers.level1;

public class SecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {

        long[] longs1 = toLongArr(n, arr1);
        long[] longs2 = toLongArr(n, arr2);

        longs1 = toBinaryArr(longs1, n);
        longs2 = toBinaryArr(longs2, n);

        long[] toBinaryArr = sumArr(n, longs1, longs2);

        String[] answer = toStringArr(n, toBinaryArr);

        for (int i = 0; i < n; i++) {
            emptyToZero(n, answer, i);
        }

        return getResult(answer);
    }

    private String[] toStringArr(int n, long[] toBinaryArr) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = toBinaryArr[i] + "";
        }
        return answer;
    }

    private String[] getResult(String[] answer) {
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].replace('1', '#');
            answer[i] = answer[i].replace('2', '#');
            answer[i] = answer[i].replace('0', ' ');
        }

        return answer;
    }

    private long[] sumArr(int n, long[] longs1, long[] longs2) {
        long[] toBinaryArr = new long[n];
        for (int i = 0; i < n; i++) {
            toBinaryArr[i] = longs1[i] + longs2[i];
        }
        return toBinaryArr;
    }

    private long[] toLongArr(int n, int[] arr) {
        long[] longArr = new long[n];
        for (int i = 0; i < n; i++) {
            longArr[i] = arr[i];
        }

        return longArr;
    }

    private void emptyToZero(int n, String[] answer, int i) {
        if (answer[i].length() < n) {
            answer[i] = "0" + answer[i];
        }

        if (answer[i].length() < n) {
            emptyToZero(n, answer, i);
        }
    }

    private long[] toBinaryArr(long[] arr1, int n) {
        long[] longs2 = new long[n];
        for (int i = 0; i < arr1.length; i++) {
            longs2[i] = toBinaryNum(arr1[i]);
        }
        return longs2;
    }

    private long toBinaryNum(long num) {
        String binary = Long.toBinaryString(num);
        return Long.parseLong(binary);
    }

}
