package com.jar.proyect;

import com.jar.proyect.beanvalidator.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Created by Sinwax-PC on 4/08/2018.
 */
public class ValidatorTest {

    protected final Log LOG = LogFactory.getLog(this.getClass());

    @Test
    public void testValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        User user = new User();
        user.setWorking(false);
        user.setAboutMe("Este es un ejemplo de validación!");
        user.setAge(500);
        user.setEmail("jm@gmail.com");

        Long init = System.currentTimeMillis();
        Set<ConstraintViolation<User>> violations = validator.validate(user);
        LOG.info("TIME=> " + (System.currentTimeMillis() - init) + "ms.");

        for (ConstraintViolation<User> violation : violations) {
            LOG.info(violation.getPropertyPath() + ":" + violation.getMessage());
        }
    }


}
