package com.example.demojpa.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="coursematerial")
public class CourseMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name="studentsequence", sequenceName = "studentsequence", allocationSize = 50,initialValue = 1)
    private int cid;
    @Column(name="firstname", nullable=false)
    private String cname;
}
