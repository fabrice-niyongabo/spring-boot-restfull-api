package com.fabrice.javafirstcrud.repositories;

import com.fabrice.javafirstcrud.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

//this enterface applies different sql commands to our table with the help of JpaRepository
//ex: findAll, deleteById, and so on
public interface UserRepository extends JpaRepository<User, Long> {
    /*
    JpaRepository<User, Long>
    User is the table that we want to apply sql commands to it, while
    Long is the data type of the primary key
    */

}
