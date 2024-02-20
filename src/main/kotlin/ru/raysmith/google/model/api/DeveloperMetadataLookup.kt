package ru.raysmith.google.model.api

/** An enumeration of strategies for matching developer metadata locations. */
enum class DeveloperMetadataLocationMatchingStrategy {

    /** Default value. This value must not be used. */
    DEVELOPER_METADATA_LOCATION_MATCHING_STRATEGY_UNSPECIFIED,

    /**
     * Indicates that a specified location should be matched exactly. For example, if row three were specified as a
     * location this matching strategy would only match developer metadata also associated on row three.
     * Metadata associated on other locations would not be considered.
     * */
    EXACT_LOCATION,

    /**
     * Indicates that a specified location should match that exact location as well as any intersecting locations.
     * For example, if row three were specified as a location this matching strategy would match developer metadata
     * associated on row three as well as metadata associated on locations that intersect row three. If, for instance,
     * there was developer metadata associated on column B, this matching strategy would also match
     * that location because column B intersects row three.
     * */
    INTERSECTING_LOCATION,
}