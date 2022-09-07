package org.dkovalenko.customcontrol.v2.example;

import org.dkovalenko.customcontrol.v2.AbstractControl;
import org.dkovalenko.customcontrol.v2.ControlType;
import org.dkovalenko.customcontrol.v2.ValidationContext;

public class MyControl2 extends AbstractControl<MyClass, MyControlLevels> {

    @Override
    protected boolean isValid(MyClass entity, ValidationContext validationContext) {
        return entity.getYears() != null && entity.getYears() > 1;
    }

    @Override
    protected boolean isApplicable(MyClass entity, ValidationContext validationContext) {
        return entity.getName() != null;
    }

    @Override
    public ControlType<MyControlLevels> getType() {
        return MyControlTypes.MY_CLASS_CONTROL_2;
    }

    @Override
    public Class<MyClass> getEntityType() {
        return MyClass.class;
    }
}
