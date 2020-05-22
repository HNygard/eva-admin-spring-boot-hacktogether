package no.valg.hallvard.demo;

import no.valg.eva.admin.voting.domain.model.Voting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo_Voting extends JpaRepository<Voting, Long> {
}
