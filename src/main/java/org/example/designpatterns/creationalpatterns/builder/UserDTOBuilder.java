package org.example.designpatterns.creationalpatterns.builder;

import java.time.LocalDate;

//Abstract builder
public interface UserDTOBuilder {
    //Methods to build a part of product at a time
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthDay(LocalDate birthDay);
    UserDTOBuilder withAddress(Address address);

    //Method to assemble the final product
    UserDTO build();

    //Method to fetch already build object
    UserDTO getUserDTO();
}
