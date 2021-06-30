package programers.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PhoneBookTest {

    private final PhoneBook phoneBook = new PhoneBook();

    @Test
    @DisplayName("Java-Level2 : 전화번호 목록")
    void test() {
        assertThat(phoneBook.solution(new String[]{"119", "97674223", "1195524421"})).isFalse();
    }
}
