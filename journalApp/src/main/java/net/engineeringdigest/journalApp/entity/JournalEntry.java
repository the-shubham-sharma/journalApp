package net.engineeringdigest.journalApp.entity;

import java.time.LocalDateTime;
import java.util.Date;

import com.sun.corba.se.spi.ior.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "journal_entries")
public class JournalEntry {

    @Id
    private ObjectId id;
    private String title;
    private String  content;
    private Date date;


    public ObjectId getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        date = date;
    }


    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
