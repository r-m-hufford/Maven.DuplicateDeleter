package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(element -> countElements(element) < maxNumberOfDuplications)
                .toArray(Integer[]::new);

    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(element -> countElements(element) > exactNumberOfDuplications || countElements(element) < exactNumberOfDuplications)
                .toArray(Integer[]::new);

    }


    public Integer countElements(Integer numberToCount) {
        Integer valueToReturn = 0;
        for (Integer number : array) {
            if (number == numberToCount) {
                valueToReturn++;
            }
        }
        return valueToReturn;
    }
    //Arrays.stream(letters).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
}
