package com.gulukal.awinglobalbewerbunggulukal.controller;

import com.gulukal.awinglobalbewerbunggulukal.dto.request.CvRequestDto;
import com.gulukal.awinglobalbewerbunggulukal.entity.Form;
import com.gulukal.awinglobalbewerbunggulukal.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static com.gulukal.awinglobalbewerbunggulukal.constant.RestApiUrls.*;


@RestController
@RequestMapping(REST)
public class FormController {

    @Autowired
    FormService formService;

    //URL --> http://localhost:8080/upload/cv
    @PostMapping(value = UPLOADCV, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = MediaType.MULTIPART_FORM_DATA_VALUE)

    public ResponseEntity<Void> uploadCv(@Valid @RequestParam(name = "cvFile", required = false) MultipartFile file, CvRequestDto dto) throws IOException {

        File cv = new File(file.getName());
        file.transferTo(cv);

        formService.save(Form.builder()
                .email(dto.getEmail())
                .firstname(dto.getFirstname())
                .lastname(dto.getLastname())
                .jobtitle(dto.getJobtitle())
                .source(dto.getSource())
                .file(file.getName())
                .build());
        return ResponseEntity.ok().build();
    }

    //URL --> http://localhost:8080/rest/information
    @GetMapping(INFORMATION)
    public ResponseEntity<List<Form>> findAll() {
        return ResponseEntity.ok(formService.findAll());

    }
}

