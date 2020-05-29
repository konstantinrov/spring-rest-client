package guru.springframework.api.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Konstantin Romanov
 * @created 29/05/2020 - 11:08
 * @project spring-rest-client
 */
public class UserData {

    List<User> data = new ArrayList<>();

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
