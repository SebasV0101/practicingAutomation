package com.co.conduit.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target TXT_USERNAME = Target.the("Ingresa los datos de nombre de usuario")
            .locatedBy("//input[@placeholder='Username']");

    public static final Target TXT_EMAIL = Target.the("Ingresa los datos de correo eletronico")
            .locatedBy("//input[@placeholder='Email']");

    public static final Target TXT_PASSWORD = Target.the("Ingresa la contraseña")
            .locatedBy("//input[@placeholder='Password']");

    public static final Target BTN_SINGUP = Target.the("Clic en el boton ingresar")
            .locatedBy("//button[@type='submit']");
}
