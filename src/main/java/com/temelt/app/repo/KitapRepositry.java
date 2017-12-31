package com.temelt.app.repo;

import com.temelt.app.entity.Kitap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitapRepositry extends JpaRepository<Kitap,Long> {
}
