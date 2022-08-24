package com.lucumt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lucumt.model.UserModel;
import com.lucumt.service.UserService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestUserService {

    @Autowired
    private UserService userService;

    private static Integer userId;

    @Order(1)
    @Test
    public void testAddUser() throws JsonProcessingException {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm:ss:SSS"));
        String info = "{\"city\":\"beijing\",\"location\":\"jiuxianqiao__" + time + "\",\"skills\":[\"Java\",\"Golang\",\"Python\"]}";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(info);

        UserModel userModel = new UserModel();
        userModel.setName("lucumt");
        userModel.setInfo(node);

        userService.addUser(userModel);

        userId = userModel.getId();
        assertTrue(userId > 0);
    }

    @Order(2)
    @Test
    public void testGetUser() {
        UserModel user = userService.getUser(userId);
        JsonNode info = user.getInfo();
        assertNotNull(info);
        System.out.println(info);
    }

    @Order(3)
    @Test
    public void testDeleteUser() {
        userService.deleteUser(userId);
    }

}
