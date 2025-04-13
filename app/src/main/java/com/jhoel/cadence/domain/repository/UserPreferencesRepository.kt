package com.jhoel.cadence.domain.repository

import com.jhoel.cadence.domain.model.UserPreferences
import kotlinx.coroutines.flow.Flow

interface UserPreferencesRepository {
    fun getUserPreferences(): Flow<UserPreferences>
    suspend fun updateUserPreferences(preferences: UserPreferences)
    suspend fun updateSpotifyToken(refreshToken: String?)
    suspend fun clearSpotifyToken()
    suspend fun setOnboardingCompleted()
} 