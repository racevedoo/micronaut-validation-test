package mn.validation;

import io.micronaut.core.annotation.Introspected;
import javax.validation.constraints.Pattern;
import lombok.Value;

@Value
@Introspected
public class PatternValidationMultipleAnnotations {
  @Pattern(regexp = "mypattern", message = "pattern does not match mypattern")
  @Pattern(regexp = "secondpattern", message = "pattern does not match secondpattern")
  String pattern;
}
