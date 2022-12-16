package pairmatching.util;

public class Validator {

    private boolean hasOnlyDigit(String input) {
        return input.chars().allMatch(Character::isDigit);
    }
}
