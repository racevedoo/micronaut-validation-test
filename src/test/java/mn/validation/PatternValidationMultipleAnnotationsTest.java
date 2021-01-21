package mn.validation;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.validation.validator.Validator;
import java.util.Set;
import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
class PatternValidationMultipleAnnotationsTest {
  @Inject
  Validator validator;

  @Test
  void testValid() {
    Set<ConstraintViolation<PatternValidationMultipleAnnotations>> violations = validator
        .validate(new PatternValidationMultipleAnnotations("anything"));
    Assertions.assertEquals(1, violations.size());
  }
}