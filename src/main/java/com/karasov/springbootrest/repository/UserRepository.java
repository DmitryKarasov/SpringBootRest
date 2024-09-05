package com.karasov.springbootrest.repository;

import com.karasov.springbootrest.auth.Authorities;
import com.karasov.springbootrest.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private final List<User> users;

    public UserRepository() {
        users = List.of(
                new User(
                        "user1",
                        "111",
                        List.of(
                                Authorities.READ
                        )
                ),
                new User(
                        "user2",
                        "222",
                        List.of(
                                Authorities.READ,
                                Authorities.WRITE
                        )
                ),
                new User(
                        "user3",
                        "333",
                        List.of(
                                Authorities.READ,
                                Authorities.WRITE,
                                Authorities.DELETE
                        )
                )
        );
    }

    public List<Authorities> getUserAuthorities(User user) {
        return users.stream()
                .filter(
                        u -> u.getUser().equals(user.getUser())
                                && u.getPassword().equals(user.getPassword())
                )
                .map(User::getAuthorities)
                .findFirst().orElse(new ArrayList<>());
    }
}
