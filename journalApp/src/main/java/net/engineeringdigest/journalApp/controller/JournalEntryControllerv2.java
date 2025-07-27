package net.engineeringdigest.journalApp.controller;
import net.engineeringdigest.journalApp.Services.JournalEntryService;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerv2 {

    @Autowired
    private JournalEntryService journalEntryService;


    @GetMapping
    public List<JournalEntry> getAll() {
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        journalEntryService.saveEntry(myEntry);
        return true;
    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryByID(@PathVariable Long myId){
        return null;
    }
    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryByID(@PathVariable Long myId){
        return null;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalById(@PathVariable Long id,@RequestBody JournalEntry myEntry){
       return null;
    }
}
