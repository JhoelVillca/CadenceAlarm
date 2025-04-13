package com.jhoel.cadence.domain.model

data class UserPreferences(
    val defaultSnoozeDurationMinutes: Int = 5,
    val defaultEventReminderMinutes: Int = 15,
    val spotifyConnected: Boolean = false,
    val spotifyRefreshToken: String? = null,
    val defaultBackupSoundId: Int = 0,
    val use24HourFormat: Boolean = true,
    val defaultVibrationEnabled: Boolean = true,
    val defaultGradualVolumeEnabled: Boolean = true,
    val onboardingCompleted: Boolean = false
) 