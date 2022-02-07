package com.gulukal.awinglobalbewerbunggulukal.dto.request;

import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Getter
@Setter


public class CvRequestDto {

    private String firstname;
    private String lastname;
    private String email;
    private String jobtitle;
    private String source;
}
