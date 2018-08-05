package com.jar.proyect.beanvalidator;

import javax.validation.constraints.*;

/**
 * Created by Sinwax-PC on 4/08/2018.
 */
public class User {

    @NotNull(message = "Nombre no debe ser vacío")
    private String name;

    @AssertTrue(message= "Tiene que se verdadero.")
    private boolean working;

    @Size(min = 10, max = 200, message= "El rango de texto debe ser entre 10 y 200 caracteres.")
    private String aboutMe;

    @Min(value = 18, message = "El valor mínimo es 18")
    @Max(value = 150, message = "El valor máximo es 150")
    private int age;

    @Email(message = "Email invalido")
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
