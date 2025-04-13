package com.jhoel.cadence.domain.repository

import com.jhoel.cadence.domain.model.Schedule
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

interface ScheduleRepository {
    fun getSchedules(): Flow<List<Schedule>>
    fun getSchedulesForDate(date: LocalDate): Flow<List<Schedule>>
    suspend fun getScheduleById(id: Long): Schedule?
    suspend fun insertSchedule(schedule: Schedule): Long
    suspend fun updateSchedule(schedule: Schedule)
    suspend fun deleteSchedule(id: Long)
} 