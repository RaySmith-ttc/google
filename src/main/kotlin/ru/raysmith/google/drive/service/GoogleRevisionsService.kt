package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.Revision
import com.google.api.services.drive.model.RevisionList

class GoogleRevisionsService(val service: Drive.Revisions) {
    fun get(fileId: String, revisionId: String, setup: Drive.Revisions.Get.() -> Unit = { }): Revision =
        service.get(fileId, revisionId).apply(setup).execute()

    fun list(fileId: String, setup: Drive.Revisions.List.() -> Unit = { }): RevisionList =
        service.list(fileId).apply(setup).execute()

    fun list(fileId: String, revisionId: String, content: Revision, setup: Drive.Revisions.Update.() -> Unit = { }): Revision =
        service.update(fileId, revisionId, content).apply(setup).execute()
}