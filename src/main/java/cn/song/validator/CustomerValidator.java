package cn.song.validator;

import cn.song.model.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

/**
 * Created by hanqingsong on 18/8/23.
 *
 * @author hanqingsong
 * @date 18/8/23
 */
public class CustomerValidator extends AbstractValidator<Customer>{
    /**
     * Method call by all entities to be validated.
     *
     * @param entity Entity to validate
     * @param errors Errors
     */
    @Override
    public void validateEntity(Customer entity, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"firstName","must not null");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"lastName","must not null");
    }
}
