package edu.eci.arsw.OpenWather.Services;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service("OpenWatherServices")
public interface OpenWatherServices {

    String getByCityName(String City) throws IOException;


}
