package bg.boneva.pathfinder.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "routes")
public class RouteEntity extends BaseEntity {
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "gpx_coordinates", columnDefinition = "LONGTEXT")
    private String gpxCoordinates;
    @Enumerated(EnumType.STRING)
    private UserLevel level;
    @Column(name = "name", nullable = false)
    private String name;
    @ManyToOne
    private UserEntity author;
    @Column(name = "video_url")
    private String videoUrl;

    @ManyToMany
    private Set<CategoriesEntity> categories;

    public RouteEntity() {
        this.categories = new HashSet<>();
    }

    public String getDescription() {
        return description;
    }

    public RouteEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public Set<CategoriesEntity> getCategories() {
        return categories;
    }

    public RouteEntity setCategories(Set<CategoriesEntity> categories) {
        this.categories = categories;
        return this;
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public RouteEntity setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
        return this;
    }

    public UserLevel getLevel() {
        return level;
    }

    public RouteEntity setLevel(UserLevel level) {
        this.level = level;
        return this;
    }

    public String getName() {
        return name;
    }

    public RouteEntity setName(String name) {
        this.name = name;
        return this;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public RouteEntity setAuthor(UserEntity author) {
        this.author = author;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public RouteEntity setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
}
