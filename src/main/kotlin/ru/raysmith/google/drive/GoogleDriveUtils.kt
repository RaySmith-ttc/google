package ru.raysmith.google.drive

import com.google.api.services.drive.model.*
import ru.raysmith.google.model.api.PermissionRole
import ru.raysmith.google.model.api.PermissionType

fun file(setup: File.() -> Unit) = File().apply(setup)
fun user(setup: User.() -> Unit) = User().apply(setup)
fun channel(setup: Channel.() -> Unit) = Channel().apply(setup)
fun comment(setup: Comment.() -> Unit) = Comment().apply(setup)
fun modifyLabelsRequest(setup: ModifyLabelsRequest.() -> Unit) = ModifyLabelsRequest().apply(setup)
fun labelModification(setup: LabelModification.() -> Unit) = LabelModification().apply(setup)
fun labelFieldModification(setup: LabelFieldModification.() -> Unit) = LabelFieldModification().apply(setup)
fun revision(setup: Revision.() -> Unit) = Revision().apply(setup)
fun teamDrive(setup: TeamDrive.() -> Unit) = TeamDrive().apply(setup)
fun restrictions(setup: TeamDrive.Restrictions.() -> Unit) = TeamDrive.Restrictions().apply(setup)
fun capabilities(setup: Drive.Capabilities.() -> Unit) = Drive.Capabilities().apply(setup)
fun backgroundImageFile(setup: Drive.BackgroundImageFile.() -> Unit) = Drive.BackgroundImageFile().apply(setup)
fun reply(setup: Reply.() -> Unit) = Reply().apply(setup)

private val snakeCaseRegex = Regex("_([a-z])")
fun permission(setup: Permission.() -> Unit) = Permission().apply(setup)
fun permission(type: PermissionType, role: PermissionRole, setup: Permission.() -> Unit = {}) = Permission().apply {
    this.type = type.name.lowercase()
    this.role = snakeCaseRegex.replace(role.name.lowercase()) {
        it.groupValues[1].uppercase()
    }
    setup()
}