package com.temelt.app.repo;

import com.temelt.app.entity.KisiKitap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KisiKitapRepository extends JpaRepository<KisiKitap,Long> {
}
