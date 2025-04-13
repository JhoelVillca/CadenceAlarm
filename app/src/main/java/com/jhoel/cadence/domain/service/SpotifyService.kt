package com.jhoel.cadence.domain.service

interface SpotifyService {
    suspend fun authenticate(code: String): String?
    suspend fun refreshToken(refreshToken: String): String?
    suspend fun getRandomLikedSong(): String?
    suspend fun getRandomSongFromPlaylist(playlistId: String): String?
    suspend fun playSong(songUri: String)
    suspend fun stopPlayback()
    suspend fun isSpotifyPremium(): Boolean
    suspend fun disconnect()
} 