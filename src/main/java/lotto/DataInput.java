package lotto;

import camp.nextstep.edu.missionutils.Console;

public class DataInput {
    private static final String VALID_INPUT_PATTERN = "[^0-9]";
    private static final String VALID_UNIT_PATTERN = "[0]{3}$";
    private static final String ERROR_MESSAGE_NUMBER = "[ERROR] 숫자를 입력해주세요";
    private static final String ERROR_MESSAGE_UNIT = "[ERROR] 1000원 단위로 입력해주세요";
    public static String UserInput(String Message) {
        System.out.println(Message);
        String input = Console.readLine();

        return input;
    }

    private static void ValidateNumber(String input) {
        if (input.matches(VALID_INPUT_PATTERN)) {
            System.out.println(ERROR_MESSAGE_NUMBER);
            throw new IllegalArgumentException();
        }
    }

    private static void ValidateAmountUnit(String input) {
        if (input.matches(VALID_UNIT_PATTERN)) {
            System.out.println(ERROR_MESSAGE_UNIT);
            throw new IllegalArgumentException();
        }
    }
}
