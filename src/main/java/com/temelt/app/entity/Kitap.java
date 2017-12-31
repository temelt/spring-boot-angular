package com.temelt.app.entity;

@Table(name = "kitap")
@Entity
@Data
public class Kitap implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "kitap_adi")
    private String kitapAdi;
    @Column(name = "isbn")
    private String isbn;
}
