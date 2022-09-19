package com.net.checkedexception.service;

import com.net.checkedexception.exception.InvalidPriministerName;

public interface PriministerService {
boolean validationAndCheck(String name)throws InvalidPriministerName;
}
