package org.dkovalenko.customcontrol.v2.example;

import org.dkovalenko.customcontrol.v2.ControlManager;
import org.dkovalenko.customcontrol.v2.ControlValidator;
import org.dkovalenko.customcontrol.v2.ValidationContext;
import org.dkovalenko.customcontrol.v2.ValidationError;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ControlManager<MyControlLevels> controlManager = new ControlManager<>();
        controlManager.register(new MyControl1());
        controlManager.register(new MyControl2());
        ControlValidator<MyControlLevels> validator = new ControlValidator<>(controlManager);

        MyClass myObject1 = new MyClass(null, 10);
        ValidationContext validationContext = new ValidationContext();
        List<ValidationError<MyControlLevels>> errors1 = validator.validate(myObject1, validationContext);
        System.out.println("size of first errors should be 1 - " + errors1.size());
        System.out.println("message of first error:" + errors1.get(0).getMessage());

        MyClass myObject2 = new MyClass("name", -1);
        List<ValidationError<MyControlLevels>> errors2 = validator.validate(myObject2, validationContext);
        System.out.println("size of second errors should be 1 - " + errors2.size());
        System.out.println("message of second error:" + errors2.get(0).getMessage());

    }
}
