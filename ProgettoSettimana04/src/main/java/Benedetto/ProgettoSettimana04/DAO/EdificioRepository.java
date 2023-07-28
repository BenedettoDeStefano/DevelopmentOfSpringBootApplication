package Benedetto.ProgettoSettimana04.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Benedetto.ProgettoSettimana04.Entities.Edificio;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {
}
