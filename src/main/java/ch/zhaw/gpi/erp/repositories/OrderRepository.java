package ch.zhaw.gpi.erp.repositories;

import ch.zhaw.gpi.erp.entities.*;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
    public Optional<Order> findByReferenceNumber(Long referenceNumber);
}
