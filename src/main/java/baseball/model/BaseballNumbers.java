package baseball.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class BaseballNumbers {
    private static final int NUMBERS_LENGTH = 3;
    private static final String OUT_OF_LENGTH = "야구 숫자 최대 길이: " + NUMBERS_LENGTH;
    private static final String DUPLICATE_NUMBER_EXIST = "야구 숫자내 중복 숫자 불가.";
    private List<BaseballNumber> baseballNumbers;

    public BaseballNumbers(List<BaseballNumber> baseballNumbers) {
        validNumbersSize(baseballNumbers);
        validDuplication(baseballNumbers);
        this.baseballNumbers = baseballNumbers;
    }

    private void validDuplication(List<BaseballNumber> baseballNumbers) {
        int distinctSize = new HashSet<>(baseballNumbers).size();
        if (distinctSize != baseballNumbers.size()) {
            throw new IllegalArgumentException(DUPLICATE_NUMBER_EXIST);
        }
    }

    private void validNumbersSize(List<BaseballNumber> baseballNumbers) {
        if (baseballNumbers.size() != NUMBERS_LENGTH) {
            throw new IllegalArgumentException(OUT_OF_LENGTH);
        }
    }
}

