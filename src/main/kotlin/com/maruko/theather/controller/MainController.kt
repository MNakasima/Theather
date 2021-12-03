package com.maruko.theather.controller

import com.maruko.theather.model.CheckAvailabilityBackingBean
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class MainController {

    @RequestMapping("")
    fun homePage() : ModelAndView {

        return ModelAndView("seatBooking", "bean", CheckAvailabilityBackingBean())
    }

}