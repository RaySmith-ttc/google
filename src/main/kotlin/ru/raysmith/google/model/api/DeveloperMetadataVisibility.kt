package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.DeveloperMetadata

/** An enumeration of possible metadata visibilities. */
enum class DeveloperMetadataVisibility {

    /** Default value. */
    DEVELOPER_METADATA_VISIBILITY_UNSPECIFIED,

    /** Document-visible metadata is accessible from any developer project with access to the document. */
    DOCUMENT,

    /** Project-visible metadata is only visible to and accessible by the developer project that created the metadata. */
    PROJECT,

}

/** The metadata visibility. Developer metadata must always have a visibility specified. */
fun DeveloperMetadata.setVisibility(visibility: DeveloperMetadataVisibility) = setVisibility(visibility.name)

/** The metadata visibility. Developer metadata must always have a visibility specified. */
var DeveloperMetadata.visibilityE: DeveloperMetadataVisibility?
    get() = visibility?.let { DeveloperMetadataVisibility.valueOf(it) }
    set(value) { visibility = value?.name }