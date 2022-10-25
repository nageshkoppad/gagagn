package java.com.person.service;

import java.com.person.dto.PersonDetailsDTO;

public interface PersonDetailsService {
	boolean ValidateAndSave(PersonDetailsDTO dto);
}
