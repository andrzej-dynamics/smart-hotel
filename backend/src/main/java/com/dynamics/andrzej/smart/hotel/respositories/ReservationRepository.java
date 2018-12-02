package com.dynamics.andrzej.smart.hotel.respositories;

import com.dynamics.andrzej.smart.hotel.entities.Reservation;
import com.dynamics.andrzej.smart.hotel.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByRoomsId(Long roomId);

    @Query("select r from Reservation r where r.client.id = ?1")
    List<Reservation> findAllByClientId(long clientId);
}
