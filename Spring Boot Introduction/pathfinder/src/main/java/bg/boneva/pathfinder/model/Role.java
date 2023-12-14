package bg.boneva.pathfinder.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false)
    private UserRoles name;

    public Role() {
    }

    public UserRoles getName() {
        return name;
    }

    public Role setName(UserRoles name) {
        this.name = name;
        return this;
    }
}
