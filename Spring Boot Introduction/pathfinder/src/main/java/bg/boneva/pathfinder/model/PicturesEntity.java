package bg.boneva.pathfinder.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pictures")
public class PicturesEntity extends BaseEntity{
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "url", columnDefinition = "TEXT")
    private String url;
    @ManyToOne
    private UserEntity author;
    @ManyToOne
    private RouteEntity route;

    public PicturesEntity(){
    }

    public String getTitle() {
        return title;
    }

    public PicturesEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public PicturesEntity setUrl(String url) {
        this.url = url;
        return this;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public PicturesEntity setAuthor(UserEntity author) {
        this.author = author;
        return this;
    }

    public RouteEntity getRoute() {
        return route;
    }

    public PicturesEntity setRoute(RouteEntity route) {
        this.route = route;
        return this;
    }
}
