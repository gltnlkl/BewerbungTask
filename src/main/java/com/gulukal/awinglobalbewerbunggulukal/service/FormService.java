package com.gulukal.awinglobalbewerbunggulukal.service;

import com.gulukal.awinglobalbewerbunggulukal.entity.Form;
import com.gulukal.awinglobalbewerbunggulukal.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService {

    @Autowired
    private FormRepository formRepository;

    public List<Form> findAll() {
        return formRepository.findAll();
    }

    public void save(Form form) {
        formRepository.save(form);
    }

}
