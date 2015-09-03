package com.softserve.controller;

import com.softserve.sevice.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/rooms")
public class RoomController {

    @Autowired
    private RoomService roomtService;


}
