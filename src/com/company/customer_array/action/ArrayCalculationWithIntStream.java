package com.company.customer_array.action;

import com.company.customer_array.entity.CustomerArray;
import com.company.customer_array.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArrayCalculationWithIntStream {
    static Logger logger = LogManager.getLogger();
    public int minElement(CustomerArray arr) throws ArrayException {
        IntStream stream = IntStream.of(arr.getArray());
        OptionalInt min = stream.min();
        if (min.isPresent()) {
            return min.getAsInt();
        }
        else {
            logger.error(min + " is not present");
            throw new ArrayException(min + " is not present");
        }
    }
    public int maxElement(CustomerArray arr) throws ArrayException {
        IntStream stream = IntStream.of(arr.getArray());
        OptionalInt max = stream.max();
        if (max.isPresent()) {
            return max.getAsInt();
        }
        else {
            logger.error(max + " is not present");
            throw new ArrayException(max + " is not present");
        }
    }
    public int sumOfElements(CustomerArray arr) {
        IntStream stream = IntStream.of(arr.getArray());
        return stream.sum();
    }
    public double avgOfElements(CustomerArray arr) throws ArrayException {
        IntStream stream = IntStream.of(arr.getArray());
        OptionalDouble avg = stream.average();
        if (avg.isPresent()) {
            return avg.getAsDouble();
        }
        else {
            logger.error(avg + " is not present");
            throw new ArrayException(avg + " is not present");
        }
    }
    public long countOfPositiveElements(CustomerArray arr) {
        IntStream stream = IntStream.of(arr.getArray());
        return stream.filter(number -> number > 0).count();
    }
    public long countOfNegativeElements(CustomerArray arr) {
        IntStream stream = IntStream.of(arr.getArray());
        return stream.filter(number -> number < 0).count();
    }
}