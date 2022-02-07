package com.gulukal.awinglobalbewerbunggulukal.repository;

import com.gulukal.awinglobalbewerbunggulukal.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface FormRepository extends JpaRepository<Form, Long> {

}
