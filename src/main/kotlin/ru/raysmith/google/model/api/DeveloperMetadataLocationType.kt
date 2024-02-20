package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.DeveloperMetadataLocation

/** An enumeration of the types of locations on which developer metadata may be associated. */
enum class DeveloperMetadataLocationType {

    /** Default value. */
    DEVELOPER_METADATA_LOCATION_TYPE_UNSPECIFIED,

    /** Developer metadata associated on an entire row dimension. */
    ROW,

    /** Developer metadata associated on an entire column dimension. */
    COLUMN,

    /** Developer metadata associated on an entire sheet. */
    SHEET,

    /** Developer metadata associated on the entire spreadsheet. */
    SPREADSHEET,
}

/** The type of location this object represents. This field is read-only. */
fun DeveloperMetadataLocation.setLocationType(locationType: DeveloperMetadataLocationType) = setLocationType(locationType.name)

/** The type of location this object represents. This field is read-only. */
var DeveloperMetadataLocation.locationTypeE: DeveloperMetadataLocationType?
    get() = locationType?.let { DeveloperMetadataLocationType.valueOf(it) }
    set(value) { locationType = value?.name }