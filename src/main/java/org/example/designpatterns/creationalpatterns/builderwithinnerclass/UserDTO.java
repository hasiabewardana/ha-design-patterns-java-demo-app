package org.example.designpatterns.creationalpatterns.builderwithinnerclass;

import org.example.designpatterns.creationalpatterns.builder.Address;
import org.example.designpatterns.creationalpatterns.builder.UserDTOBuilder;
import org.example.designpatterns.creationalpatterns.builder.UserWebDTO;
import org.example.designpatterns.creationalpatterns.builder.UserWebDTOBuilder;

import java.time.LocalDate;
import java.time.Period;

//Product class
public class UserDTO {
    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'';
    }

    //Get builder instance
    public static UserDTOBuilder getBuilder(){
        return new UserDTOBuilder();
    }

    //Builder
    public static class UserDTOBuilder{
        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTOBuilder withBirthDay(LocalDate birthDay) {
            Period age = Period.between(birthDay, LocalDate.now());
            this.age = Integer.toString(age.getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + ", " + address.getStreet()
                    + "\n" +address.getCity() + "\n" + address.getState() + " " + address.getZipCode();
            return this;
        }

        public UserDTO build() {
            this.userDTO = new UserDTO();
            userDTO.setName(firstName + " " + lastName);
            userDTO.setAge(age);
            userDTO.setAddress(address);

            return this.userDTO;
        }

        public UserDTO getUserDTO() {
            return this.userDTO;
        }
    }
}
