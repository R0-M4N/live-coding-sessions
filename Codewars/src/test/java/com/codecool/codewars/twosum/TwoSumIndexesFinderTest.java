package com.codecool.codewars.twosum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class TwoSumIndexesFinderTest {
    TwoSumIndexesFinder indexesFinder = new TwoSumIndexesFinder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(new int[]{0, 1}, new int[]{0, 0}, 0),
                of(new int[]{0, 1}, new int[]{0, 1}, 1),
                of(new int[]{0, 1}, new int[]{1, 0}, 1),
                of(new int[]{0, 1}, new int[]{1, 1}, 2),
                of(new int[]{0, 2}, new int[]{1, 0, 1}, 2),
                of(new int[]{0, 2}, new int[]{1, 2, 3}, 4),
                of(new int[]{0, 1}, new int[]{2, 2, 3}, 4),
                of(new int[]{1, 2}, new int[]{1234, 5678, 9012}, 14690)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void findIndexes(int[] expected, int[] numbers, int target) {
        int[] result = indexesFinder.findIndexes(numbers, target);

        assertArrayEquals(expected, result);
    }
}