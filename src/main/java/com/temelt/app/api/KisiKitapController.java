package com.temelt.app.api;

import com.temelt.app.entity.KisiKitap;
import com.temelt.app.repo.KisiKitapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/kisikitap")
public class KisiKitapController {

    @Autowired
    private KisiKitapRepository kisiKitapRepository;

    @GetMapping("/getAll")
    public ResponseEntity<List<KisiKitap>> getAll() {
        return new ResponseEntity<List<KisiKitap>>(kisiKitapRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<KisiKitap> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<KisiKitap>(kisiKitapRepository.findOne(id), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<KisiKitap> save(@RequestBody KisiKitap kitap) {
        return new ResponseEntity<KisiKitap>(kisiKitapRepository.save(kitap), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
        KisiKitap kitap = kisiKitapRepository.findOne(id);
        kisiKitapRepository.delete(kitap);
        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
    }
}
