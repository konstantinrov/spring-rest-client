package guru.springframework.springrestclientexamples.services;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Konstantin Romanov
 * @created 29/05/2020 - 11:14
 * @project spring-rest-client
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetUsers() throws Exception {
        //List<User> users = apiService.getUsers(3); // apifaketory return 4 ?_?
        //assertEquals(4, users.size());
    }
}