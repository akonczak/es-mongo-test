package com.searchizi.mongo.repository;

import com.searchizi.mongo.model.UserAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * the user account repository
 * <p/>
 * Created by larrymitchell on 2014-11-28.
 */

public interface UserAccountRepository extends MongoRepository<UserAccount, String> {

    /**
     * find by first name
     *
     * @param firstName the first name
     * @return the list of user account
     */
    public List<UserAccount> findByFirstName(String firstName);

    /**
     * find by last name
     *
     * @param lastName the last name
     * @return the list of matching user acocunts
     */
    public List<UserAccount> findByLastName(String lastName);

    /**
     * find by the user name
     *
     * @param userName the user name
     * @return the user acocunt
     */
    public UserAccount findByUserName(String userName);


}
