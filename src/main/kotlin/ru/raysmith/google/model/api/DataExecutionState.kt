package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.DataExecutionStatus

/** An enumeration of data execution states. */
enum class DataExecutionState {

    /** Default value, do not use. */
    DATA_EXECUTION_STATE_UNSPECIFIED,

    /** The data execution has not started. */
    NOT_STARTED,

    /** The data execution has started and is running. */
    RUNNING,

    /** The data execution has completed successfully. */
    SUCCEEDED,

    /** The data execution has completed with errors. */
    FAILED,

}

/** The state of the data execution. */
fun DataExecutionStatus.setState(dataExecutionState: DataExecutionState) = setState(dataExecutionState.name)

/** The state of the data execution. */
var DataExecutionStatus.stateE: DataExecutionState?
    get() = state?.let { DataExecutionState.valueOf(it) }
    set(value) { state = value?.name }