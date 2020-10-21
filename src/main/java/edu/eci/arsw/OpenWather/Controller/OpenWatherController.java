package edu.eci.arsw.OpenWather.Controller;

import edu.eci.arsw.OpenWather.Services.Impl.OpenWatherServicesImpl;
import edu.eci.arsw.OpenWather.Services.OpenWatherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.tree.ExpandVetoException;

@RestController
@RequestMapping(value="/openWhater")
public class OpenWatherController {

    @Autowired
    @Qualifier("OpenWatherServicesImpl")
    OpenWatherServices ows;

    @RequestMapping(path="/{City}",method = RequestMethod.GET)
    public ResponseEntity<?> getByCityName(@PathVariable(name="City")String City){
        try{
            return new ResponseEntity<>(ows.getByCityName(City),HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>("400 Bad Request", HttpStatus.NOT_FOUND);
        }
    }
}
