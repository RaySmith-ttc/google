package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.DataSourceRefreshSchedule

/** The data source refresh scopes. */
enum class DataSourceRefreshScope {

    /** Default value, do not use. */
    DATA_SOURCE_REFRESH_SCOPE_UNSPECIFIED,

    /** Refreshes all data sources and their associated data source objects in the spreadsheet. */
    ALL_DATA_SOURCES
}

/** The scope of the refresh. Must be [DataSourceRefreshScope.ALL_DATA_SOURCES]. */
fun DataSourceRefreshSchedule.setRefreshScope(refreshScope: DataSourceRefreshScope) = setRefreshScope(refreshScope.name)

/** The scope of the refresh. Must be [DataSourceRefreshScope.ALL_DATA_SOURCES]. */
var DataSourceRefreshSchedule.refreshScopeE: DataSourceRefreshScope?
    get() = refreshScope?.let { DataSourceRefreshScope.valueOf(it) }
    set(value) { refreshScope = value?.name }