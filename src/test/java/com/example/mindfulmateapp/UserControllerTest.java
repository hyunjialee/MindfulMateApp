package com.example.mindfulmateapp;

import com.example.mindfulmateapp.user.controller.UserController;
import com.example.mindfulmateapp.user.model.User;
import com.example.mindfulmateapp.user.service.UserServiceImplement;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.ui.Model;

import java.util.Optional;

import static org.mockito.Mockito.when;

@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserServiceImplement userService;

    @Test
    public void testRegisterUserSuccess() throws Exception {
        when(userService.findByEmail("test@example.com")).thenReturn(Optional.empty());
        when(userService.findByUserName("testUser")).thenReturn(Optional.empty());

        mockMvc.perform(MockMvcRequestBuilders.post("/users/register")
                        .param("email", "test@example.com")
                        .param("userName", "testUser")
                        .param("password", "testPassword"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("index"));
    }

    @Test
    public void testRegisterUserDuplicate() throws Exception {
        when(userService.findByEmail("duplicate@example.com")).thenReturn(Optional.of(new User()));
        when(userService.findByUserName("duplicateUser")).thenReturn(Optional.empty());

        mockMvc.perform(MockMvcRequestBuilders.post("/users/register")
                        .param("email", "duplicate@example.com")
                        .param("userName", "duplicateUser")
                        .param("password", "testPassword"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("registerError"));
    }

    @Test
    public void testUserLoginFailure() throws Exception {
        when(userService.findByUserName("nonExistingUser")).thenReturn(Optional.empty());

        mockMvc.perform(MockMvcRequestBuilders.post("/users/login")
                        .param("userName", "nonExistingUser")
                        .param("password", "incorrectPassword"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().attribute("error", "User not found. Please check your credentials."))
                .andExpect(MockMvcResultMatchers.view().name("login"));
    }
}
