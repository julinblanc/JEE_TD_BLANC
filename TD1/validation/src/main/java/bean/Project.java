package bean;

import java.util.List;

public class Project {
    private String description;
    private String name;
    private String urlRepository;

    private List<Person> teachers;
    private List<Person> students;
    private List<Person> customers;
    private List<Document> mesDocuments;

    public Project(String name, String des, String url) {
        this.name = name;
        this.description = des;
        this.urlRepository = url;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getUrlRepository() {
        return urlRepository;
    }
}
