package net.engineeringdigest.journalApp.repositery;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepositery extends MongoRepository<JournalEntry,String > {
    
}
