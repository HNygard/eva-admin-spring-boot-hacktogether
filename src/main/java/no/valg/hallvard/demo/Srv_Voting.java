package no.valg.hallvard.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Srv_Voting {
    @Autowired
    private Repo_Voting repoVoting;

    @PostConstruct
    public void init() {
        repoVoting.findAll();
    }
}
