package com.co.conduit.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OptionComponent {
    public static final Target BTN_SINGUP = Target.the("Clic en el elemento SingUp")
            .locatedBy("//a[contains(@href,'/register' )]");

    public static final Target LBL_NAME = Target.the("Validación de registro exitoso")
            .locatedBy("//a[contains(@href,'/profile/')]");


}
