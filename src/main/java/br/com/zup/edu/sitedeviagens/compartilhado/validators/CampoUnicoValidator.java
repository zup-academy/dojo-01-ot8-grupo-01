package br.com.zup.edu.sitedeviagens.compartilhado.validators;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CampoUnicoValidator implements ConstraintValidator<CampoUnico, Object> {
    @PersistenceContext
    private EntityManager manager;

    private String nomeCampo;

    private Class<?> classe;

    @Override
    public void initialize(CampoUnico constraintAnnotation) {
        classe = constraintAnnotation.classe();
        nomeCampo = constraintAnnotation.nomeCampo();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        Query query = manager.createQuery("select 1 from "+ classe.getName()+ " t where t."+nomeCampo+ "=:value");
        query.setParameter("value", value);
        return query.getResultList().isEmpty();
    }
}
