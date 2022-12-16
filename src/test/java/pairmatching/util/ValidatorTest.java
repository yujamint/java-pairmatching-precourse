package pairmatching.util;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pairmatching.message.ErrorMessage;

class ValidatorTest {

    @Test
    @DisplayName("기능 선택 시, 1 미만 3 초과의 값 입력하면 예외 발생")
    void 기능선택_1_미만_3_초과_값_입력() {
        String input = "5";
        try {
            Validator.validateFunctionSelection(input);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ErrorMessage.INCORRECT_FUNCTION_NUMBER, e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"11", "5a", "3q", "quit"})
    @DisplayName("기능 선택 시, 길이가 1 이상의 값 입력하면 예외 발생")
    void 기능선택_길이가_1이_아닌_값_입력(String input) {
        IllegalArgumentException e = assertThrows(
                IllegalArgumentException.class,
                () -> Validator.validateFunctionSelection(input));

        assertThat(e.getMessage()).isEqualTo(ErrorMessage.INCORRECT_FUNCTION_INPUT);
    }

    @Test
    @DisplayName("존재하지 않는 과정 입력시 예외 발생")
    void 존재하지_않는_과정_입력() {
        String input = "풀스택, 레벨1, 자동차경주";
        try {
            Validator.validateDetailInformation(input);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ErrorMessage.INCORRECT_COURSE_INPUT, e.getMessage());
        }
    }

    @Test
    @DisplayName("존재하지 않는 레벨 입력시 예외 발생")
    void 존재하지_않는_레벨_입력() {
        String input = "백엔드, 레벨6, 프로젝트";
        try {
            Validator.validateDetailInformation(input);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ErrorMessage.INCORRECT_LEVEL_INPUT, e.getMessage());
        }
    }

    @Test
    @DisplayName("해당 레벨에 존재하지 않는 미션 입력시 예외 발생")
    void 해당_레벨에_존재하지_않는_미션_입력() {
        String input = "백엔드, 레벨1, 장바구니";
        try {
            Validator.validateDetailInformation(input);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ErrorMessage.INCORRECT_MISSION_INPUT, e.getMessage());
        }
    }
}