package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Konstantin Romanov
 * @created 29/05/2020 - 11:06
 * @project spring-rest-client
 */
@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;
    public static final String BASE_URL = "http://apifaketory.com/api/user?limit=";

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        StringBuilder url = new StringBuilder(BASE_URL);
        url.append(limit);
        UserData userData = restTemplate.getForObject(url.toString(), UserData.class);
        return userData.getData();
    }
}
