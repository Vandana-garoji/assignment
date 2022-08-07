package com.example.demojpa.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Guardian {
    @Column(name = "guardian_name")
    private String name;
    @Column(name = "guardian_mail")
    private String email;
    @Column(name = "guardian_mobile")
    private String mobile;
}
