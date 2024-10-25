@file:Suppress("OVERRIDE_BY_INLINE", "unused")

package ru.raysmith.google.drive.dsl

import com.google.api.services.drive.model.*
import ru.raysmith.google.utils.GoogleDSL

interface AboutDriveThemesBuilder {

	@GoogleDSL
	fun driveThemes(setup: About.DriveThemes.() -> Unit)
	val all: List<About.DriveThemes>
}

@GoogleDSL
fun About.driveThemes(setup: AboutDriveThemesBuilder.() -> Unit) {
	val builder = object : AboutDriveThemesBuilder {
		override val all = mutableListOf<About.DriveThemes>()

		@GoogleDSL
		override inline fun driveThemes(setup: About.DriveThemes.() -> Unit) {
			all.add(About.DriveThemes().apply(setup))
		}
	}

	this.driveThemes = builder.apply(setup).all
}

@GoogleDSL
class AboutExportFormatsBuilder {

	val all = mutableMapOf<String, List<String>>()
	infix fun String.to(that: List<String>) = all.put(this, that)
}

@GoogleDSL
fun About.exportFormats(setup: AboutExportFormatsBuilder.() -> Unit) {
	exportFormats = AboutExportFormatsBuilder().apply(setup).all
}

@GoogleDSL
class AboutImportFormatsBuilder {

	val all = mutableMapOf<String, List<String>>()
	infix fun String.to(that: List<String>) = all.put(this, that)
}

@GoogleDSL
fun About.importFormats(setup: AboutImportFormatsBuilder.() -> Unit) {
	importFormats = AboutImportFormatsBuilder().apply(setup).all
}

@GoogleDSL
class AboutMaxImportSizesBuilder {

	val all = mutableMapOf<String, Long>()
	infix fun String.to(that: Long) = all.put(this, that)
}

@GoogleDSL
fun About.maxImportSizes(setup: AboutMaxImportSizesBuilder.() -> Unit) {
	maxImportSizes = AboutMaxImportSizesBuilder().apply(setup).all
}

@GoogleDSL
fun About.storageQuota(setup: About.StorageQuota.() -> Unit) {
	storageQuota = About.StorageQuota().apply(setup)
}

interface AboutTeamDriveThemesBuilder {

	@GoogleDSL
	fun teamDriveThemes(setup: About.TeamDriveThemes.() -> Unit)
	val all: List<About.TeamDriveThemes>
}

@GoogleDSL
fun About.teamDriveThemes(setup: AboutTeamDriveThemesBuilder.() -> Unit) {
	val builder = object : AboutTeamDriveThemesBuilder {
		override val all = mutableListOf<About.TeamDriveThemes>()

		@GoogleDSL
		override inline fun teamDriveThemes(setup: About.TeamDriveThemes.() -> Unit) {
			all.add(About.TeamDriveThemes().apply(setup))
		}
	}

	this.teamDriveThemes = builder.apply(setup).all
}

@GoogleDSL
fun About.user(setup: User.() -> Unit) {
	user = User().apply(setup)
}

interface AppIconsBuilder {

	@GoogleDSL
	fun appIcons(setup: AppIcons.() -> Unit)
	val all: List<AppIcons>
}

@GoogleDSL
fun App.icons(setup: AppIconsBuilder.() -> Unit) {
	val builder = object : AppIconsBuilder {
		override val all = mutableListOf<AppIcons>()

		@GoogleDSL
		override inline fun appIcons(setup: AppIcons.() -> Unit) {
			all.add(AppIcons().apply(setup))
		}
	}

	this.icons = builder.apply(setup).all
}

interface AppListItemsBuilder {

	@GoogleDSL
	fun app(setup: App.() -> Unit)
	val all: List<App>
}

@GoogleDSL
fun AppList.items(setup: AppListItemsBuilder.() -> Unit) {
	val builder = object : AppListItemsBuilder {
		override val all = mutableListOf<App>()

		@GoogleDSL
		override inline fun app(setup: App.() -> Unit) {
			all.add(App().apply(setup))
		}
	}

	this.items = builder.apply(setup).all
}

@GoogleDSL
fun Change.drive(setup: Drive.() -> Unit) {
	drive = Drive().apply(setup)
}

@GoogleDSL
fun Change.file(setup: File.() -> Unit) {
	file = File().apply(setup)
}

@GoogleDSL
fun Change.teamDrive(setup: TeamDrive.() -> Unit) {
	teamDrive = TeamDrive().apply(setup)
}

interface ChangeListChangesBuilder {

	@GoogleDSL
	fun change(setup: Change.() -> Unit)
	val all: List<Change>
}

@GoogleDSL
fun ChangeList.changes(setup: ChangeListChangesBuilder.() -> Unit) {
	val builder = object : ChangeListChangesBuilder {
		override val all = mutableListOf<Change>()

		@GoogleDSL
		override inline fun change(setup: Change.() -> Unit) {
			all.add(Change().apply(setup))
		}
	}

	this.changes = builder.apply(setup).all
}

@GoogleDSL
class ChannelParamsBuilder {

	val all = mutableMapOf<String, String>()
	infix fun String.to(that: String) = all.put(this, that)
}

@GoogleDSL
fun Channel.params(setup: ChannelParamsBuilder.() -> Unit) {
	params = ChannelParamsBuilder().apply(setup).all
}

@GoogleDSL
fun Comment.author(setup: User.() -> Unit) {
	author = User().apply(setup)
}

@GoogleDSL
fun Comment.quotedFileContent(setup: Comment.QuotedFileContent.() -> Unit) {
	quotedFileContent = Comment.QuotedFileContent().apply(setup)
}

interface CommentRepliesBuilder {

	@GoogleDSL
	fun reply(setup: Reply.() -> Unit)
	val all: List<Reply>
}

@GoogleDSL
fun Comment.replies(setup: CommentRepliesBuilder.() -> Unit) {
	val builder = object : CommentRepliesBuilder {
		override val all = mutableListOf<Reply>()

		@GoogleDSL
		override inline fun reply(setup: Reply.() -> Unit) {
			all.add(Reply().apply(setup))
		}
	}

	this.replies = builder.apply(setup).all
}

interface CommentListCommentsBuilder {

	@GoogleDSL
	fun comment(setup: Comment.() -> Unit)
	val all: List<Comment>
}

@GoogleDSL
fun CommentList.comments(setup: CommentListCommentsBuilder.() -> Unit) {
	val builder = object : CommentListCommentsBuilder {
		override val all = mutableListOf<Comment>()

		@GoogleDSL
		override inline fun comment(setup: Comment.() -> Unit) {
			all.add(Comment().apply(setup))
		}
	}

	this.comments = builder.apply(setup).all
}

@GoogleDSL
fun ContentRestriction.restrictingUser(setup: User.() -> Unit) {
	restrictingUser = User().apply(setup)
}

@GoogleDSL
fun Drive.backgroundImageFile(setup: Drive.BackgroundImageFile.() -> Unit) {
	backgroundImageFile = Drive.BackgroundImageFile().apply(setup)
}

@GoogleDSL
fun Drive.capabilities(setup: Drive.Capabilities.() -> Unit) {
	capabilities = Drive.Capabilities().apply(setup)
}

@GoogleDSL
fun Drive.restrictions(setup: Drive.Restrictions.() -> Unit) {
	restrictions = Drive.Restrictions().apply(setup)
}

interface DriveListDrivesBuilder {

	@GoogleDSL
	fun drive(setup: Drive.() -> Unit)
	val all: List<Drive>
}

@GoogleDSL
fun DriveList.drives(setup: DriveListDrivesBuilder.() -> Unit) {
	val builder = object : DriveListDrivesBuilder {
		override val all = mutableListOf<Drive>()

		@GoogleDSL
		override inline fun drive(setup: Drive.() -> Unit) {
			all.add(Drive().apply(setup))
		}
	}

	this.drives = builder.apply(setup).all
}

@GoogleDSL
class FileAppPropertiesBuilder {

	val all = mutableMapOf<String, String>()
	infix fun String.to(that: String) = all.put(this, that)
}

@GoogleDSL
fun File.appProperties(setup: FileAppPropertiesBuilder.() -> Unit) {
	appProperties = FileAppPropertiesBuilder().apply(setup).all
}

@GoogleDSL
fun File.capabilities(setup: File.Capabilities.() -> Unit) {
	capabilities = File.Capabilities().apply(setup)
}

@GoogleDSL
fun File.contentHints(setup: File.ContentHints.() -> Unit) {
	contentHints = File.ContentHints().apply(setup)
}

interface FileContentRestrictionsBuilder {

	@GoogleDSL
	fun contentRestriction(setup: ContentRestriction.() -> Unit)
	val all: List<ContentRestriction>
}

@GoogleDSL
fun File.contentRestrictions(setup: FileContentRestrictionsBuilder.() -> Unit) {
	val builder = object : FileContentRestrictionsBuilder {
		override val all = mutableListOf<ContentRestriction>()

		@GoogleDSL
		override inline fun contentRestriction(setup: ContentRestriction.() -> Unit) {
			all.add(ContentRestriction().apply(setup))
		}
	}

	this.contentRestrictions = builder.apply(setup).all
}

@GoogleDSL
class FileExportLinksBuilder {

	val all = mutableMapOf<String, String>()
	infix fun String.to(that: String) = all.put(this, that)
}

@GoogleDSL
fun File.exportLinks(setup: FileExportLinksBuilder.() -> Unit) {
	exportLinks = FileExportLinksBuilder().apply(setup).all
}

@GoogleDSL
fun File.imageMediaMetadata(setup: File.ImageMediaMetadata.() -> Unit) {
	imageMediaMetadata = File.ImageMediaMetadata().apply(setup)
}

@GoogleDSL
fun File.labelInfo(setup: File.LabelInfo.() -> Unit) {
	labelInfo = File.LabelInfo().apply(setup)
}

@GoogleDSL
fun File.lastModifyingUser(setup: User.() -> Unit) {
	lastModifyingUser = User().apply(setup)
}

@GoogleDSL
fun File.linkShareMetadata(setup: File.LinkShareMetadata.() -> Unit) {
	linkShareMetadata = File.LinkShareMetadata().apply(setup)
}

interface FileOwnersBuilder {

	@GoogleDSL
	fun user(setup: User.() -> Unit)
	val all: List<User>
}

@GoogleDSL
fun File.owners(setup: FileOwnersBuilder.() -> Unit) {
	val builder = object : FileOwnersBuilder {
		override val all = mutableListOf<User>()

		@GoogleDSL
		override inline fun user(setup: User.() -> Unit) {
			all.add(User().apply(setup))
		}
	}

	this.owners = builder.apply(setup).all
}

interface FilePermissionsBuilder {

	@GoogleDSL
	fun permission(setup: Permission.() -> Unit)
	val all: List<Permission>
}

@GoogleDSL
fun File.permissions(setup: FilePermissionsBuilder.() -> Unit) {
	val builder = object : FilePermissionsBuilder {
		override val all = mutableListOf<Permission>()

		@GoogleDSL
		override inline fun permission(setup: Permission.() -> Unit) {
			all.add(Permission().apply(setup))
		}
	}

	this.permissions = builder.apply(setup).all
}

@GoogleDSL
class FilePropertiesBuilder {

	val all = mutableMapOf<String, String>()
	infix fun String.to(that: String) = all.put(this, that)
}

@GoogleDSL
fun File.properties(setup: FilePropertiesBuilder.() -> Unit) {
	properties = FilePropertiesBuilder().apply(setup).all
}

@GoogleDSL
fun File.sharingUser(setup: User.() -> Unit) {
	sharingUser = User().apply(setup)
}

@GoogleDSL
fun File.shortcutDetails(setup: File.ShortcutDetails.() -> Unit) {
	shortcutDetails = File.ShortcutDetails().apply(setup)
}

@GoogleDSL
fun File.trashingUser(setup: User.() -> Unit) {
	trashingUser = User().apply(setup)
}

@GoogleDSL
fun File.videoMediaMetadata(setup: File.VideoMediaMetadata.() -> Unit) {
	videoMediaMetadata = File.VideoMediaMetadata().apply(setup)
}

interface FileListFilesBuilder {

	@GoogleDSL
	fun file(setup: File.() -> Unit)
	val all: List<File>
}

@GoogleDSL
fun FileList.files(setup: FileListFilesBuilder.() -> Unit) {
	val builder = object : FileListFilesBuilder {
		override val all = mutableListOf<File>()

		@GoogleDSL
		override inline fun file(setup: File.() -> Unit) {
			all.add(File().apply(setup))
		}
	}

	this.files = builder.apply(setup).all
}

@GoogleDSL
class LabelFieldsBuilder {

	val all = mutableMapOf<String, LabelField>()
	infix fun String.to(that: LabelField) = all.put(this, that)
}

@GoogleDSL
fun Label.fields(setup: LabelFieldsBuilder.() -> Unit) {
	fields = LabelFieldsBuilder().apply(setup).all
}

interface LabelFieldUserBuilder {

	@GoogleDSL
	fun user(setup: User.() -> Unit)
	val all: List<User>
}

@GoogleDSL
fun LabelField.user(setup: LabelFieldUserBuilder.() -> Unit) {
	val builder = object : LabelFieldUserBuilder {
		override val all = mutableListOf<User>()

		@GoogleDSL
		override inline fun user(setup: User.() -> Unit) {
			all.add(User().apply(setup))
		}
	}

	this.user = builder.apply(setup).all
}

interface LabelListLabelsBuilder {

	@GoogleDSL
	fun label(setup: Label.() -> Unit)
	val all: List<Label>
}

@GoogleDSL
fun LabelList.labels(setup: LabelListLabelsBuilder.() -> Unit) {
	val builder = object : LabelListLabelsBuilder {
		override val all = mutableListOf<Label>()

		@GoogleDSL
		override inline fun label(setup: Label.() -> Unit) {
			all.add(Label().apply(setup))
		}
	}

	this.labels = builder.apply(setup).all
}

interface LabelModificationFieldModificationsBuilder {

	@GoogleDSL
	fun labelFieldModification(setup: LabelFieldModification.() -> Unit)
	val all: List<LabelFieldModification>
}

@GoogleDSL
fun LabelModification.fieldModifications(setup: LabelModificationFieldModificationsBuilder.() -> Unit) {
	val builder = object : LabelModificationFieldModificationsBuilder {
		override val all = mutableListOf<LabelFieldModification>()

		@GoogleDSL
		override inline fun labelFieldModification(setup: LabelFieldModification.() -> Unit) {
			all.add(LabelFieldModification().apply(setup))
		}
	}

	this.fieldModifications = builder.apply(setup).all
}

interface ListOperationsResponseOperationsBuilder {

	@GoogleDSL
	fun operation(setup: Operation.() -> Unit)
	val all: List<Operation>
}

@GoogleDSL
fun ListOperationsResponse.operations(setup: ListOperationsResponseOperationsBuilder.() -> Unit) {
	val builder = object : ListOperationsResponseOperationsBuilder {
		override val all = mutableListOf<Operation>()

		@GoogleDSL
		override inline fun operation(setup: Operation.() -> Unit) {
			all.add(Operation().apply(setup))
		}
	}

	this.operations = builder.apply(setup).all
}

interface ModifyLabelsRequestLabelModificationsBuilder {

	@GoogleDSL
	fun labelModification(setup: LabelModification.() -> Unit)
	val all: List<LabelModification>
}

@GoogleDSL
fun ModifyLabelsRequest.labelModifications(setup: ModifyLabelsRequestLabelModificationsBuilder.() -> Unit) {
	val builder = object : ModifyLabelsRequestLabelModificationsBuilder {
		override val all = mutableListOf<LabelModification>()

		@GoogleDSL
		override inline fun labelModification(setup: LabelModification.() -> Unit) {
			all.add(LabelModification().apply(setup))
		}
	}

	this.labelModifications = builder.apply(setup).all
}

interface ModifyLabelsResponseModifiedLabelsBuilder {

	@GoogleDSL
	fun label(setup: Label.() -> Unit)
	val all: List<Label>
}

@GoogleDSL
fun ModifyLabelsResponse.modifiedLabels(setup: ModifyLabelsResponseModifiedLabelsBuilder.() -> Unit) {
	val builder = object : ModifyLabelsResponseModifiedLabelsBuilder {
		override val all = mutableListOf<Label>()

		@GoogleDSL
		override inline fun label(setup: Label.() -> Unit) {
			all.add(Label().apply(setup))
		}
	}

	this.modifiedLabels = builder.apply(setup).all
}

@GoogleDSL
fun Operation.error(setup: Status.() -> Unit) {
	error = Status().apply(setup)
}

@GoogleDSL
class OperationMetadataBuilder {

	val all = mutableMapOf<String, Any>()
	infix fun String.to(that: Any) = all.put(this, that)
}

@GoogleDSL
fun Operation.metadata(setup: OperationMetadataBuilder.() -> Unit) {
	metadata = OperationMetadataBuilder().apply(setup).all
}

@GoogleDSL
class OperationResponseBuilder {

	val all = mutableMapOf<String, Any>()
	infix fun String.to(that: Any) = all.put(this, that)
}

@GoogleDSL
fun Operation.response(setup: OperationResponseBuilder.() -> Unit) {
	response = OperationResponseBuilder().apply(setup).all
}

interface PermissionPermissionDetailsBuilder {

	@GoogleDSL
	fun permissionDetails(setup: Permission.PermissionDetails.() -> Unit)
	val all: List<Permission.PermissionDetails>
}

@GoogleDSL
fun Permission.permissionDetails(setup: PermissionPermissionDetailsBuilder.() -> Unit) {
	val builder = object : PermissionPermissionDetailsBuilder {
		override val all = mutableListOf<Permission.PermissionDetails>()

		@GoogleDSL
		override inline fun permissionDetails(setup: Permission.PermissionDetails.() -> Unit) {
			all.add(Permission.PermissionDetails().apply(setup))
		}
	}

	this.permissionDetails = builder.apply(setup).all
}

interface PermissionTeamDrivePermissionDetailsBuilder {

	@GoogleDSL
	fun teamDrivePermissionDetails(setup: Permission.TeamDrivePermissionDetails.() -> Unit)
	val all: List<Permission.TeamDrivePermissionDetails>
}

@GoogleDSL
fun Permission.teamDrivePermissionDetails(setup: PermissionTeamDrivePermissionDetailsBuilder.() -> Unit) {
	val builder = object : PermissionTeamDrivePermissionDetailsBuilder {
		override val all = mutableListOf<Permission.TeamDrivePermissionDetails>()

		@GoogleDSL
		override inline fun teamDrivePermissionDetails(setup: Permission.TeamDrivePermissionDetails.() -> Unit) {
			all.add(Permission.TeamDrivePermissionDetails().apply(setup))
		}
	}

	this.teamDrivePermissionDetails = builder.apply(setup).all
}

interface PermissionListPermissionsBuilder {

	@GoogleDSL
	fun permission(setup: Permission.() -> Unit)
	val all: List<Permission>
}

@GoogleDSL
fun PermissionList.permissions(setup: PermissionListPermissionsBuilder.() -> Unit) {
	val builder = object : PermissionListPermissionsBuilder {
		override val all = mutableListOf<Permission>()

		@GoogleDSL
		override inline fun permission(setup: Permission.() -> Unit) {
			all.add(Permission().apply(setup))
		}
	}

	this.permissions = builder.apply(setup).all
}

@GoogleDSL
fun Reply.author(setup: User.() -> Unit) {
	author = User().apply(setup)
}

interface ReplyListRepliesBuilder {

	@GoogleDSL
	fun reply(setup: Reply.() -> Unit)
	val all: List<Reply>
}

@GoogleDSL
fun ReplyList.replies(setup: ReplyListRepliesBuilder.() -> Unit) {
	val builder = object : ReplyListRepliesBuilder {
		override val all = mutableListOf<Reply>()

		@GoogleDSL
		override inline fun reply(setup: Reply.() -> Unit) {
			all.add(Reply().apply(setup))
		}
	}

	this.replies = builder.apply(setup).all
}

@GoogleDSL
class RevisionExportLinksBuilder {

	val all = mutableMapOf<String, String>()
	infix fun String.to(that: String) = all.put(this, that)
}

@GoogleDSL
fun Revision.exportLinks(setup: RevisionExportLinksBuilder.() -> Unit) {
	exportLinks = RevisionExportLinksBuilder().apply(setup).all
}

@GoogleDSL
fun Revision.lastModifyingUser(setup: User.() -> Unit) {
	lastModifyingUser = User().apply(setup)
}

interface RevisionListRevisionsBuilder {

	@GoogleDSL
	fun revision(setup: Revision.() -> Unit)
	val all: List<Revision>
}

@GoogleDSL
fun RevisionList.revisions(setup: RevisionListRevisionsBuilder.() -> Unit) {
	val builder = object : RevisionListRevisionsBuilder {
		override val all = mutableListOf<Revision>()

		@GoogleDSL
		override inline fun revision(setup: Revision.() -> Unit) {
			all.add(Revision().apply(setup))
		}
	}

	this.revisions = builder.apply(setup).all
}

@GoogleDSL
fun TeamDrive.backgroundImageFile(setup: TeamDrive.BackgroundImageFile.() -> Unit) {
	backgroundImageFile = TeamDrive.BackgroundImageFile().apply(setup)
}

@GoogleDSL
fun TeamDrive.capabilities(setup: TeamDrive.Capabilities.() -> Unit) {
	capabilities = TeamDrive.Capabilities().apply(setup)
}

@GoogleDSL
fun TeamDrive.restrictions(setup: TeamDrive.Restrictions.() -> Unit) {
	restrictions = TeamDrive.Restrictions().apply(setup)
}

interface TeamDriveListTeamDrivesBuilder {

	@GoogleDSL
	fun teamDrive(setup: TeamDrive.() -> Unit)
	val all: List<TeamDrive>
}

@GoogleDSL
fun TeamDriveList.teamDrives(setup: TeamDriveListTeamDrivesBuilder.() -> Unit) {
	val builder = object : TeamDriveListTeamDrivesBuilder {
		override val all = mutableListOf<TeamDrive>()

		@GoogleDSL
		override inline fun teamDrive(setup: TeamDrive.() -> Unit) {
			all.add(TeamDrive().apply(setup))
		}
	}

	this.teamDrives = builder.apply(setup).all
}

