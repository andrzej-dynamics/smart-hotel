package com.dynamics.andrzej.smart.hotel.controllers;

import com.dynamics.andrzej.smart.hotel.entities.Reservation;
import com.dynamics.andrzej.smart.hotel.models.ReservationRequest;
import com.dynamics.andrzej.smart.hotel.services.RoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/room")
@Slf4j
public class RoomReservationController {
    private RoomService roomService;

    public RoomReservationController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping("/reserve")
    public void reserveRooms(@RequestBody ReservationRequest request) {
        log.info("bang: {}", request);
        roomService.reserve(request);
    }
}
