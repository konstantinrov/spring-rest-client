package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @author Konstantin Romanov
 * @created 29/05/2020 - 11:05
 * @project spring-rest-client
 */
public interface ApiService {

    List<User> getUsers(Integer limit);

    Flux<User> getUsers(Mono<Integer> limit);
}
