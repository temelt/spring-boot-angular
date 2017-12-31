package com.temelt.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "kisi")
@Entity
@Data
public class Kisi implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "ad")
    private String ad;
    @Column(name = "soyad")
    private String soyad;
    @Column(name = "adres")
    private String adres;
    @Column(name = "kullaniciAdi")
    private String kullaniciAdi;
    @Column(name = "sifre")
    private String sifre;
}
