package ch.zhaw.gpi.erp.repositories;

import ch.zhaw.gpi.erp.entities.*;	
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CreditorRepository extends JpaRepository<Creditor, Long> {

	public Optional<Creditor> findByCrName(String crName);
    
}
