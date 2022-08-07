package com.example.demojpa;

import com.example.demojpa.Entity.Candidate;
import com.example.demojpa.Entity.Guardian;
import com.example.demojpa.repository.CandidateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CandidateRepositoryTest {
    @Autowired
    private CandidateRepository candidateRepository;
    //Test, autowire, perform operation
    @Test
    public void saveCandidate(){
        Candidate candidate= Candidate.builder().name("Tarun").marks(51).department("CSE").guardian(Guardian.builder().name("Teja").email("taruntej732@gmail.com").mobile("9392240732").build()).build();
        candidateRepository.save(candidate);
    }

    @Test
    public void ListAllCandidiates(){
        List<Candidate> list=candidateRepository.findAll();
        System.out.println(list);
    }

}
