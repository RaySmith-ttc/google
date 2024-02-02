package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.Comment
import com.google.api.services.drive.model.CommentList

class GoogleCCommentsService(val service: Drive.Comments) {
    fun get(fileId: String, commentId: String, setup: Drive.Comments.Get.() -> Unit = { }): Comment =
        service.get(fileId, commentId).apply(setup).execute()

    fun list(fileId: String, setup: Drive.Comments.List.() -> Unit = { }): CommentList =
        service.list(fileId).apply(setup).execute()

    fun create(fileId: String, content: Comment, setup: Drive.Comments.Create.() -> Unit = { }): Comment =
        service.create(fileId, content).apply(setup).execute()

    fun create(fileId: String, commentId: String, content: Comment, setup: Drive.Comments.Update.() -> Unit = { }): Comment =
        service.update(fileId, commentId, content).apply(setup).execute()

    fun create(fileId: String, commentId: String, setup: Drive.Comments.Delete.() -> Unit = { }) {
        service.delete(fileId, commentId).apply(setup).execute()
    }
}