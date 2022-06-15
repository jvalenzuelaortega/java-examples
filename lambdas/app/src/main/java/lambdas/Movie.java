package lambdas;

import java.time.LocalDate;

public class Movie {

    private Long id;
    private String name;
    private String director;
    private LocalDate releaseDate;
    private Integer year;

    public Movie() {
    }

    public Movie(Long id, String name, String director, LocalDate releaseDate, Integer year) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.releaseDate = releaseDate;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                ", year=" + year +
                '}';
    }
}
