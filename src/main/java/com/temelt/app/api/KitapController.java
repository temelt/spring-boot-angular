package com.temelt.app.api;

import com.temelt.app.entity.Kitap;
import com.temelt.app.repo.KitapRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kitap")
public class KitapController {
    @Autowired
    private KitapRepositry kitapRepositry;

    @GetMapping("/getAll")
    public ResponseEntity<List<Kitap>> getAll() {
        return new ResponseEntity<List<Kitap>>(kitapRepositry.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Kitap> getById(@PathVariable("id") Long id){
        return new ResponseEntity<Kitap>(kitapRepositry.findOne(id), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Kitap> save(@RequestBody Kitap kitap){
        return new ResponseEntity<Kitap>(kitapRepositry.save(kitap), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id){
        Kitap kitap = kitapRepositry.findOne(id);
        kitapRepositry.delete(kitap);
        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
    }
}