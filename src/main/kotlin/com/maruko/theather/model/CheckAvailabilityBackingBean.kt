package com.maruko.theather.model

class CheckAvailabilityBackingBean {
    val seatNums = 1..36
    val seatRows = 'A'..'O'
    var selectedSeatNum = 1
    var selectedSeatRow = 'A'
    var result = ""
}