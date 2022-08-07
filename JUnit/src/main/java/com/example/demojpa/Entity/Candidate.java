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
@Table(name="studentinfo")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name="studentsequence", sequenceName = "studentsequence", allocationSize = 50,initialValue = 1)
    private int id;
    @Column(name="firstname", nullable=false)
    private String name;
    private int marks;
    private String department;
    @Embedded
    private Guardian guardian;
}
