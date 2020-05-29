package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;

import java.util.List;

/**
 * @author Konstantin Romanov
 * @created 29/05/2020 - 11:05
 * @project spring-rest-client
 */
public interface ApiService {

    List<User> getUsers(Integer limit);
}
