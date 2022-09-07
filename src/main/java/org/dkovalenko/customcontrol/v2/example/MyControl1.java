package org.dkovalenko.customcontrol.v2.example;

import org.dkovalenko.customcontrol.v2.AbstractControl;
import org.dkovalenko.customcontrol.v2.ControlType;
import org.dkovalenko.customcontrol.v2.ValidationContext;

public class MyControl1 extends AbstractControl<MyClass, MyControlLevels> {

    @Override
    protected boolean isValid(MyClass entity, ValidationContext validationContext) {
        return entity.getName() != null;
    }

    @Override
    protected boolean isApplicable(MyClass entity, ValidationContext validationContext) {
        return true;
    }

    @Override
    public ControlType<MyControlLevels> getType() {
        return MyControlTypes.MY_CLASS_CONTROL_1;
    }

    @Override
    public Class<MyClass> getEntityType() {
        return MyClass.class;
    }
}
