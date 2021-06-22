public class BoostCamp {

   /*
        1번 : 거짓말한 사람 A 빵 먹은 사람 B
        풀이 : A가 진실이라면, B, C 모두가 거짓이라 A가 진실일 수가 없음.
    */

    /*
        2번 : 1, 3, 6, 11, 19, 31, 48, (?)

        1과 3 사이는 2
        3과 6 사이는 3
        6과 11 사이는 5

        더해야 하는 값이 1씩 늘어나고 있음.
        48 + 23 == 71
        정답은 71
     */

    // 3번
    private void exam3() {
        // 1 + 8 + 15 + 22 + 29 + 36 + 43 + 50 + 57 + 64 + 71 + 78 + 85 + 92 + 99
        // 99일 때, 7을 더하면 100이 넘어가기 때문에 총 15번

        int count = 0;
        for (int i = 1; i <= 100; i += 7) {
            count++;
        }

        // 15
        System.out.println(count);
    }
    
}