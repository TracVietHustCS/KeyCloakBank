package com.example.keycloakbank.repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import com.example.keycloakbank.model.Notice;
import lombok.Data;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {

	@Query("SELECT n FROM Notice n WHERE :today BETWEEN n.noticBegDt AND n.noticEndDt")
	List<Notice> findAllActiveNotices(@Param("today") LocalDateTime today);


}
