package com.temelt.app.api;

import com.temelt.app.entity.Kisi;
import com.temelt.app.repo.KisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kisi")
@CrossOrigin
public class KisiController {

    @Autowired
    private KisiRepository kisiRepository;


    @GetMapping("/getAll")
    public ResponseEntity<List<Kisi>> getAll(){
        return new ResponseEntity<List<Kisi>>(kisiRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Kisi> getById(@PathVariable("id") Long id){
        return new ResponseEntity<Kisi>(kisiRepository.findOne(id), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Kisi> save(@RequestBody Kisi kisi){
        return new ResponseEntity<Kisi>(kisiRepository.save(kisi), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id){
        Kisi kisi = kisiRepository.findOne(id);
        kisiRepository.delete(kisi);
        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
    }

}
