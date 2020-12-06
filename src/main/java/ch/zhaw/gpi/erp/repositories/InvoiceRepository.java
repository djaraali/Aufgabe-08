package ch.zhaw.gpi.erp.repositories;

import ch.zhaw.gpi.erp.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    
}
