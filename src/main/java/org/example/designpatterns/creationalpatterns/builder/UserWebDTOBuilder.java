package org.example.designpatterns.creationalpatterns.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDay(LocalDate birthDay) {
        Period age = Period.between(birthDay, LocalDate.now());
        this.age = Integer.toString(age.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet()
                + "\n" +address.getCity() + "\n" + address.getState() + " " + address.getZipCode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName + " " + lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
