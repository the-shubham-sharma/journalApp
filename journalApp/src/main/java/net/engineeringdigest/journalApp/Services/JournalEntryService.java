package net.engineeringdigest.journalApp.Services;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repositery.JournalEntryRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepositery journalEntryRepositery;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepositery.save(journalEntry);
    }

}
// controller -> Service -> Repositery




































