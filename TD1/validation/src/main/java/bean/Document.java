package bean;

import java.util.Date;

public abstract class Document {
    private String title;
    private String content;
    private Date creationDate;
    private Date lastModification;

    private Person creator;
    private Person lastModifier;

    public Document(String title, String content, Date cDate, Date lModif) {
        this.title = title;
        this.content = content;
        this.creationDate = cDate;
        this.lastModification = lModif;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getLastModification() {
        return lastModification;
    }

    public Person getCreator() {
        return creator;
    }

    public Person getLastModifier() {
        return lastModifier;
    }
}
