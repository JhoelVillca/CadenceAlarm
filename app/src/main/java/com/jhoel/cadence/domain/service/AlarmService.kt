package com.jhoel.cadence.domain.service

import com.jhoel.cadence.domain.model.Alarm
import java.time.LocalDateTime

interface AlarmService {
    suspend fun scheduleAlarm(alarm: Alarm)
    suspend fun cancelAlarm(alarmId: Long)
    suspend fun snoozeAlarm(alarmId: Long)
    suspend fun dismissAlarm(alarmId: Long)
    suspend fun getNextAlarmTime(alarm: Alarm): LocalDateTime?
    suspend fun playBackupSound(soundId: Int)
    suspend fun stopBackupSound()
    suspend fun setVolume(volume: Float)
} 