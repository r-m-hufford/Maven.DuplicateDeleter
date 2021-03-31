package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(element -> countElements(element) < maxNumberOfDuplications)
                .toArray(String[]::new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(element -> countElements(element) > exactNumberOfDuplications || countElements(element) < exactNumberOfDuplications)
                .toArray(String[]::new);
    }

    public Integer countElements(String stringToCount) {
        Integer valueToReturn = 0;
        for (String string : array) {
            if (string == stringToCount) {
                valueToReturn++;
            }
        }
        return valueToReturn;
    }
}
