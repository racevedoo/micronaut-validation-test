package mn.validation;

import io.micronaut.core.annotation.Introspected;
import javax.validation.constraints.Pattern;
import lombok.Value;

@Value
@Introspected
public class PatternValidation {
  @Pattern(regexp = "mypattern", message = "pattern does not match mypattern")
  String pattern;
}
