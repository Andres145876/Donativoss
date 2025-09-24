package com.example.data_central.converters

import androidx.room.TypeConverters
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Converters {

    private val formatter = DateTimeFormatter.ISO_DATE_TIME

    @TypeConverters
    fun fromDate(value: String?): LocalDateTime? {
        return value?.let { LocalDateTime.parse(it, formatter) }
    }

    @TypeConverters
    fun dateToString(date: LocalDateTime?): String? {
        return date?.format(formatter)

    }
}