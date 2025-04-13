package com.jhoel.cadence.domain.model

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime

data class Schedule(
    val id: Long = 0,
    val name: String,
    val startTime: LocalTime,
    val endTime: LocalTime,
    val location: String = "",
    val notes: String = "",
    val isRecurring: Boolean = false,
    val recurringDays: Set<DayOfWeek> = emptySet(),
    val specificDate: LocalDate? = null,
    val notificationMinutesBefore: List<Int> = listOf(15, 10, 5, 0),
    val vibrationEnabled: Boolean = false
) 