package mysql.jdbc.persondetails.service;

import mysql.jdbc.persondetails.dto.PersonDetailsDTO;

public interface PersonDetailsService {
	boolean ValidateAndSave(PersonDetailsDTO dto);
	void displayAll();
	void displayAllAgeGreaterThanOrderByName();
	void displayAllBySalaryGreateThanOrderByDesc();
	void count();
	void displaySumOfSalary();
}
