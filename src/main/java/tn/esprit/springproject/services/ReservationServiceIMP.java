package tn.esprit.springproject.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Reservation;
import tn.esprit.springproject.repositories.ReservationRepository;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReservationServiceIMP implements IReservationService {
    private final ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservationById(String idR) {
        return reservationRepository.findById(idR).orElse(null);
    }

    @Override
    public void deleteReservationById(String idR) {
        reservationRepository.deleteById(idR);
    }

    @Override
    public long getReservationParAnneeUniversitaire(LocalDate date1, LocalDate date2) {
        return reservationRepository.countByDateDebutBetween(date1,date2);
    }
@Scheduled(fixedRate = 50000)
    @Override
    public void mettreAJourEtAfficherReservations() {
    Date targetDate = new GregorianCalendar(2024, Calendar.JANUARY, 1).getTime(); // Correct way to create a Date

  List<Reservation> reservations=   reservationRepository.findAll().stream()
            .filter(r -> r.getAnneeUniv().before(targetDate))
             .peek(r->r.setEstValide(false))
            .collect(Collectors.toList());
    reservationRepository.saveAll(reservations);
    reservations.forEach(e->log.info("reservation" + e));

    }

}
