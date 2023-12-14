package bg.boneva.pathfinder.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class CategoriesEntity extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false)
    private CategoriesName name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    public CategoriesEntity() {
    }

    public CategoriesName getName() {
        return name;
    }

    public CategoriesEntity setName(CategoriesName name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CategoriesEntity setDescription(String description) {
        this.description = description;
        return this;
    }
}
