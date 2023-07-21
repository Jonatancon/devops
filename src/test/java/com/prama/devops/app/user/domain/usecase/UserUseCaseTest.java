package com.prama.devops.app.user.domain.usecase;

import com.prama.devops.app.user.data.DataMock;
import com.prama.devops.app.user.domain.model.User;
import com.prama.devops.app.user.domain.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserUseCaseTest {
    @InjectMocks
    UserUseCase useCase;
    @Mock
    UserService service;

    @Test
    void saveUser() {
        when(service.save(any(User.class))).thenReturn(DataMock.getUser());

        User response = useCase.saveUser(DataMock.getUser());

        assertEquals(response.getIdentification(), DataMock.getUser().getIdentification());
        assertEquals(response.getName(), DataMock.getUser().getName());
        assertEquals(response.getLastName(), DataMock.getUser().getLastName());
        assertEquals(response.getSex(), DataMock.getUser().getSex());
    }

    @Test
    void updateUser() {
        doNothing().when(service).update(any(User.class));

        assertDoesNotThrow(() -> useCase.updateUser(DataMock.getUser()));
    }

    @Test
    void deleteUser() {
        doNothing().when(service).delete(anyString());
        assertDoesNotThrow(() -> useCase.deleteUser("1"));
    }

    @Test
    void getUser() {
        when(service.get(anyString())).thenReturn(DataMock.getUser());
        User response = useCase.getUser("1");
        assertEquals(response.getIdentification(), DataMock.getUser().getIdentification());
        assertEquals(response.getName(), DataMock.getUser().getName());
        assertEquals(response.getLastName(), DataMock.getUser().getLastName());
        assertEquals(response.getSex(), DataMock.getUser().getSex());
    }

    @Test
    void getAllUser() {
        when(service.getAll()).thenReturn(Stream.of(DataMock.getUser()));
        assertNotNull(useCase.getAllUser());
    }
}