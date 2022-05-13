package ru.netology;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class MainTest {

    Person sut;

    @BeforeAll
    public static void started() {
        System.out.println("Tests started");
    }

    @AfterAll
    public static void finished() {
        System.out.println("Tests finished");
    }


    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {

        sut = new Person("Jake", "Goodnight", 33, Sex.WOMEN, Education.HIGHER);
        // given:
        final String original = "Name of Person is ";
        final String argument = sut.getName();
        final String expected = "Name of Person is Jake";
        // when:
        final String result = original.concat(argument);
        // then:
        Assertions.assertEquals(expected, result);

        // given:
        final String argument1 = String.valueOf(sut.getEducation());
        final String expected1 = "HIGHER";
        // when:
        boolean result1 = argument1.equals(expected1);
        // then:
        Assertions.assertTrue(result1);

        // given:
        final int age1 = 17;
        final int age2 = 27;
        final int realAge = sut.getAge();
        // when:
        boolean result2 = realAge > age1 & realAge < age2;
        // then:
        Assertions.assertFalse(result2);
    }
}