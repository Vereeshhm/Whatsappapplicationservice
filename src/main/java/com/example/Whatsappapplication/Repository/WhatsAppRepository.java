package com.example.Whatsappapplication.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.Whatsappapplication.Entity.Saswatdto;
import com.example.Whatsappapplication.dto.Saswatdata;

@Component
@Repository
public interface WhatsAppRepository extends JpaRepository<Saswatdata, Integer>{

	@Query("SELECT s FROM Saswatdto s WHERE s.mobile_no = :mobileNo")
    List<Saswatdata> findByMobile_no(String mobileNo);

	

}

