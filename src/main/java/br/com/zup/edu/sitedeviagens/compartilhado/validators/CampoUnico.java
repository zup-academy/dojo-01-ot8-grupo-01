package br.com.zup.edu.sitedeviagens.compartilhado.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CampoUnicoValidator.class)
public @interface CampoUnico {
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
    String nomeCampo();
    Class<?> classe();
    String message() default "Valor já cadastrado";
}
