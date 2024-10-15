package tn.esprit.tpfoyer.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservation")
public class ReservationRestController {
    IReservationService ReservationService;

    // http://localhost:8089/tpfoyer/Reservation/retrieve-all-Reservations
    @GetMapping("/retrieve-all-Reservations")
    public List<Reservation> getReservations() {
        List<Reservation> listReservations = ReservationService.retrieveAllReservations();
        return listReservations;
    }

    // http://localhost:8089/tpfoyer/Reservation/retrieve-Reservation/8
    @GetMapping("/retrieve-Reservation/{Reservation-id}")
    public Reservation retrieveReservation(@PathVariable("Reservation-id") Long chId) {
        Reservation Reservation = ReservationService.retrieveReservation(chId);
        return Reservation;
    }

    // http://localhost:8089/tpfoyer/Reservation/add-Reservation
    @PostMapping("/add-Reservation")
    public Reservation addReservation(@RequestBody Reservation c) {
        Reservation Reservation = ReservationService.addReservation(c);
        return Reservation;
    }

    // http://localhost:8089/tpfoyer/Reservation/remove-Reservation/5
    @DeleteMapping("/remove-Reservation/{Reservation-id}")
    public void removeReservation(@PathVariable("Reservation-id") Long chId) {
        ReservationService.removeReservation(chId);
    }

    // http://localhost:8089/tpfoyer/Reservation/modify-Reservation
    @PutMapping("/modify-Reservation")
    public Reservation modifyReservation(@RequestBody Reservation c) {
        Reservation Reservation = ReservationService.modifyReservation(c);
        return Reservation;
    }
}