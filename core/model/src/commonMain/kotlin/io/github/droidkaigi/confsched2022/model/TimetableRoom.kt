package io.github.droidkaigi.confsched2022.model

import kotlinx.serialization.Serializable

@Serializable
public data class TimetableRoom(
    val id: Int,
    val name: MultiLangText,
    val sort: Int
)
