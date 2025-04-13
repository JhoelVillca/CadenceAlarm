package com.jhoel.cadence.domain.model

import java.time.DayOfWeek
import java.time.LocalTime

data class Alarm(
    val id: Long = 0,
    val time: LocalTime,
    val label: String = "",
    val isEnabled: Boolean = true,
    val days: Set<DayOfWeek> = emptySet(),
    val snoozeDurationMinutes: Int = 5,
    val vibrationEnabled: Boolean = true,
    val gradualVolumeEnabled: Boolean = true,
    val spotifyPlaylistId: String? = null,
    val useLikedSongs: Boolean = true,
    val backupSoundId: Int = 0
) 