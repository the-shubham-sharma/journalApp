package net.engineeringdigest.journalApp.Services;

import org.bson.types.ObjectId;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repositery.JournalEntryRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepositery journalEntryRepositery;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepositery.save(journalEntry);
    }

    public List<JournalEntry> getALl(){
         return journalEntryRepositery.findAll();
    }

    public JournalEntry findByID(ObjectId id) {
        return journalEntryRepositery.findById(id).orElse(null);
    }

}





































