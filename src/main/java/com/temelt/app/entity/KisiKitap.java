package com.temelt.app.entity;

@Table(name = "kisi_kitap")
@Entity
@Data
public class KisiKitap implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name="kitap_id")
    private Kitap kitap;
    @ManyToOne
    @JoinColumn(name="kisi_id")
    private Kisi kisi;
}
