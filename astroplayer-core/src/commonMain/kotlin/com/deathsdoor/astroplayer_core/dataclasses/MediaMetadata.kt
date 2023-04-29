package com.deathsdoor.astroplayer_core.dataclasses

data class MediaMetadata (
    val trackLength : Long,
    val title: String? = null,
    val artist: List<String>? = null,
    val albumTitle: String? = null,
    val albumArtist: List<String>? = null,
    val albumArtwork : String? = null,
    val subtitle: String? = null,
    val description: String? = null,
    val artwork : String? = null,
    val trackNumber: Int? = null,
    val totalTrackCount: Int? = null,
    val recordingYear: Int? = null,
    val recordingMonth: Int? = null,
    val recordingDay: Int? = null,
    val releaseYear: Int? = null,
    val releaseMonth: Int? = null,
    val releaseDay: Int? = null,
    val writer: String? = null,
    val composer: String? = null,
    val conductor: String? = null,
    val discNumber: Int? = null,
    val totalDiscCount: Int? = null,
    val genre: String? = null,
    val compilation: String? = null,
    val station: String? = null,
    val mood : String? = null,
    val sprache : String? = null,
    val lyrics : String? = null,
    var isLiked : Boolean = false
)