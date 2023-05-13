package org.example.designpatterns.creationalpatterns.builderwithinnerclass;

import org.example.designpatterns.creationalpatterns.builder.Address;
import org.example.designpatterns.creationalpatterns.builder.User;

import java.time.LocalDate;

//This is our client which also works as our director
public class Client {
    public static User createUser() {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Smith");
        user.setBirthDay(LocalDate.of(1980, 5, 13));

        Address address = new Address();
        address.setHouseNumber("104");
        address.setStreet("Cross Street");
        address.setCity("Colombo");
        address.setState("Western Province");
        address.setZipCode("10100");

        user.setAddress(address);

        return user;
    }

    //Director
    public static org.example.designpatterns.creationalpatterns.builderwithinnerclass.UserDTO directBuild(org.example.designpatterns.creationalpatterns.builderwithinnerclass.UserDTO.UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthDay(user.getBirthDay())
                .withAddress(user.getAddress())
                .build();
    }

    public static void demoBuilderWithInnerClass() {
        User user = createUser();

        UserDTO userDTO = directBuild(org.example.designpatterns.creationalpatterns.builderwithinnerclass.UserDTO.getBuilder(), user);
        System.out.println(userDTO);
    }
}
