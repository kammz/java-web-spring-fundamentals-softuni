package org.boneva.mobilele.service;

import org.boneva.mobilele.model.dto.UserLoginDTO;
import org.boneva.mobilele.model.dto.UserRegistrationDTO;

public interface UserService {

    void registerUser(UserRegistrationDTO userRegistrationDTO);
    boolean loginUser(UserLoginDTO userLoginDTO);

    void logoutUser();
}
