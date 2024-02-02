package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.Reply
import com.google.api.services.drive.model.ReplyList

class GoogleRepliesService(val service: Drive.Replies) {
    fun list(fileId: String, commentId: String, setup: Drive.Replies.List.() -> Unit = { }): ReplyList =
        service.list(fileId, commentId).apply(setup).execute()

    fun get(fileId: String, commentId: String, replyId: String, setup: Drive.Replies.Get.() -> Unit = { }): Reply =
        service.get(fileId, commentId, replyId).apply(setup).execute()

    fun create(fileId: String, commentId: String, content: Reply, setup: Drive.Replies.Create.() -> Unit = { }): Reply =
        service.create(fileId, commentId, content).apply(setup).execute()

    fun update(
        fileId: String, commentId: String, replyId: String, content: Reply,
        setup: Drive.Replies.Update.() -> Unit = { }
    ): Reply = service.update(fileId, commentId, replyId, content).apply(setup).execute()

    fun delete(
        fileId: String, commentId: String, replyId: String,
        setup: Drive.Replies.Delete.() -> Unit = { }
    ) {
        service.delete(fileId, commentId, replyId).apply(setup).execute()
    }
}