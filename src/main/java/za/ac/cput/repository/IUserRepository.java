package za.ac.cput.repository;
/*IUserRepository .java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/
import za.ac.cput.domain.User;

import java.util.List;
import java.util.Set;

public interface IUserRepository extends IRepositor<User, String> {
    //create, read, update, delete
    public Set<User> getAll();
}