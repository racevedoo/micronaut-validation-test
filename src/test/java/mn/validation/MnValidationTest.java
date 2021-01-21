package mn.validation;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.validation.validator.Validator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;

@MicronautTest
public class MnValidationTest {

    @Inject
    EmbeddedApplication<?> application;
    @Inject
    Validator validator;

    @Test
    void testItWorks() {

    }

}
