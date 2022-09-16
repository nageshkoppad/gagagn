package com.net.travel.service;

import com.net.travel.exception.InvalidPlaceException;

public interface ToursitService {
boolean validation(String places) throws InvalidPlaceException;
}
