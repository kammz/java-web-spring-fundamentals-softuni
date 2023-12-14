package bg.boneva.pathfinder.controller;

import bg.boneva.pathfinder.model.UserEntity;
import bg.boneva.pathfinder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    public final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/all")
    public List<UserEntity> getAll() {
        return this.userService.getAll();
    }
}
