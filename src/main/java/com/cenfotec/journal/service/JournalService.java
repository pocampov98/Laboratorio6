package com.cenfotec.journal.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cenfotec.journal.domain.Journal;

@Component
public interface JournalService {
	public void saveJournal(Journal newJournal);  
	public List<Journal> getAllJournals();
}
