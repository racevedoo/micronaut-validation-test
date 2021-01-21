package mn.validation;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.validation.validator.Validator;
import java.util.Set;
import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
class PatternValidationTest {
  @Inject
  Validator validator;

  @Test
  void testValid() {
    Set<ConstraintViolation<PatternValidation>> violations = validator
        .validate(new PatternValidation("mypattern"));
    Assertions.assertEquals(0, violations.size());
  }

  @Test
  void testInvalid() {
    Set<ConstraintViolation<PatternValidation>> violations = validator
        .validate(new PatternValidation("invalid"));
    Assertions.assertEquals(1, violations.size());
    ConstraintViolation<PatternValidation> violation = violations
        .stream().findFirst().get();
    Assertions.assertEquals("pattern does not match mypattern", violation.getMessage());
  }
}