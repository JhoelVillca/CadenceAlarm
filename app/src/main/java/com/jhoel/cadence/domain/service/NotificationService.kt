package com.jhoel.cadence.domain.service

import com.jhoel.cadence.domain.model.Schedule
import java.time.LocalDateTime

interface NotificationService {
    suspend fun scheduleNotification(
        schedule: Schedule,
        notificationTime: LocalDateTime,
        minutesBefore: Int
    )
    suspend fun cancelNotification(scheduleId: Long)
    suspend fun cancelAllNotificationsForSchedule(scheduleId: Long)
    suspend fun showAlarmNotification(alarmId: Long, label: String)
    suspend fun dismissAlarmNotification(alarmId: Long)
} 