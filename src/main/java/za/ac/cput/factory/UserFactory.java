package za.ac.cput.factory;
/*StudentFactory.java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/
import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

public class UserFactory {
    public static User createUser( String firstName, String lastName, String phoneNum, String email,
                                   String address){
        String userId = Helper.generatedId();
        if (!Helper.isValidEmail(email))
            return null;

        //if (Helper.isNullorEmpty(userId)||Helper.isNullorEmpty(firstName) ||Helper.isNullorEmpty(lastName)||Helper.isNullorEmpty(phoneNum)
        //||Helper.isNullorEmpty(address) )
        // return null;

        User user= new User.Builder().setUserId(userId)
                .setFirstname(firstName)
                .setLastname(lastName)
                .setPhoneNum(phoneNum)
                .setEmail(email)
                .setAddress(address)
                .build();
        return user;
    }
}

