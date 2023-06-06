package com.greenie.app.core.model

data class RecordHistoryData(
    val id: Int,
    val fileName: String,
    val filePath: String,
    val duration: Long,
    val minimumDecibel: Float,
    val maximumDecibel: Float,
    val averageDecibel: Float,
    val createdAt: Long,
)
