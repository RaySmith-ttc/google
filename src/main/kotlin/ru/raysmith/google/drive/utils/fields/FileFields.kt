package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface FileField : Field

object FileFields {
    val ALL: FieldsList<FileField> = fieldsList("*")
	val appProperties: FieldsList<FileField> get() = fieldsList("appProperties")
	val capabilities = object : FileFieldCapabilities("capabilities") {}
	val contentHints = object : FileFieldContentHints("contentHints") {}
	val contentRestrictions = object : FileFieldContentRestriction("contentRestrictions") {}
	val copyRequiresWriterPermission: FieldsList<FileField> get() = fieldsList("copyRequiresWriterPermission")
	val createdTime: FieldsList<FileField> get() = fieldsList("createdTime")
	val description: FieldsList<FileField> get() = fieldsList("description")
	val driveId: FieldsList<FileField> get() = fieldsList("driveId")
	val explicitlyTrashed: FieldsList<FileField> get() = fieldsList("explicitlyTrashed")
	val exportLinks: FieldsList<FileField> get() = fieldsList("exportLinks")
	val fileExtension: FieldsList<FileField> get() = fieldsList("fileExtension")
	val folderColorRgb: FieldsList<FileField> get() = fieldsList("folderColorRgb")
	val fullFileExtension: FieldsList<FileField> get() = fieldsList("fullFileExtension")
	val hasAugmentedPermissions: FieldsList<FileField> get() = fieldsList("hasAugmentedPermissions")
	val hasThumbnail: FieldsList<FileField> get() = fieldsList("hasThumbnail")
	val headRevisionId: FieldsList<FileField> get() = fieldsList("headRevisionId")
	val iconLink: FieldsList<FileField> get() = fieldsList("iconLink")
	val id: FieldsList<FileField> get() = fieldsList("id")
	val imageMediaMetadata = object : FileFieldImageMediaMetadata("imageMediaMetadata") {}
	val isAppAuthorized: FieldsList<FileField> get() = fieldsList("isAppAuthorized")
	val kind: FieldsList<FileField> get() = fieldsList("kind")
	val labelInfo = object : FileFieldLabelInfo("labelInfo") {}
	val lastModifyingUser = object : FileFieldUser("lastModifyingUser") {}
	val linkShareMetadata = object : FileFieldLinkShareMetadata("linkShareMetadata") {}
	val md5Checksum: FieldsList<FileField> get() = fieldsList("md5Checksum")
	val mimeType: FieldsList<FileField> get() = fieldsList("mimeType")
	val modifiedByMe: FieldsList<FileField> get() = fieldsList("modifiedByMe")
	val modifiedByMeTime: FieldsList<FileField> get() = fieldsList("modifiedByMeTime")
	val modifiedTime: FieldsList<FileField> get() = fieldsList("modifiedTime")
	val name: FieldsList<FileField> get() = fieldsList("name")
	val originalFilename: FieldsList<FileField> get() = fieldsList("originalFilename")
	val ownedByMe: FieldsList<FileField> get() = fieldsList("ownedByMe")
	val owners = object : FileFieldUser("owners") {}
	val parents: FieldsList<FileField> get() = fieldsList("parents")
	val permissionIds: FieldsList<FileField> get() = fieldsList("permissionIds")
	val permissions = object : FileFieldPermission("permissions") {}
	val properties: FieldsList<FileField> get() = fieldsList("properties")
	val quotaBytesUsed: FieldsList<FileField> get() = fieldsList("quotaBytesUsed")
	val resourceKey: FieldsList<FileField> get() = fieldsList("resourceKey")
	val sha1Checksum: FieldsList<FileField> get() = fieldsList("sha1Checksum")
	val sha256Checksum: FieldsList<FileField> get() = fieldsList("sha256Checksum")
	val shared: FieldsList<FileField> get() = fieldsList("shared")
	val sharedWithMeTime: FieldsList<FileField> get() = fieldsList("sharedWithMeTime")
	val sharingUser = object : FileFieldUser("sharingUser") {}
	val shortcutDetails = object : FileFieldShortcutDetails("shortcutDetails") {}
	val size: FieldsList<FileField> get() = fieldsList("size")
	val spaces: FieldsList<FileField> get() = fieldsList("spaces")
	val starred: FieldsList<FileField> get() = fieldsList("starred")
	val teamDriveId: FieldsList<FileField> get() = fieldsList("teamDriveId")
	val thumbnailLink: FieldsList<FileField> get() = fieldsList("thumbnailLink")
	val thumbnailVersion: FieldsList<FileField> get() = fieldsList("thumbnailVersion")
	val trashed: FieldsList<FileField> get() = fieldsList("trashed")
	val trashedTime: FieldsList<FileField> get() = fieldsList("trashedTime")
	val trashingUser = object : FileFieldUser("trashingUser") {}
	val version: FieldsList<FileField> get() = fieldsList("version")
	val videoMediaMetadata = object : FileFieldVideoMediaMetadata("videoMediaMetadata") {}
	val viewedByMe: FieldsList<FileField> get() = fieldsList("viewedByMe")
	val viewedByMeTime: FieldsList<FileField> get() = fieldsList("viewedByMeTime")
	val viewersCanCopyContent: FieldsList<FileField> get() = fieldsList("viewersCanCopyContent")
	val webContentLink: FieldsList<FileField> get() = fieldsList("webContentLink")
	val webViewLink: FieldsList<FileField> get() = fieldsList("webViewLink")
	val writersCanShare: FieldsList<FileField> get() = fieldsList("writersCanShare")
}

abstract class FileFieldCapabilities(private val path: String) : FieldsList<FileField>(path) {
	val canAcceptOwnership: FieldsList<FileField> get() = fieldsList("${path}/canAcceptOwnership")
	val canAddChildren: FieldsList<FileField> get() = fieldsList("${path}/canAddChildren")
	val canAddFolderFromAnotherDrive: FieldsList<FileField> get() = fieldsList("${path}/canAddFolderFromAnotherDrive")
	val canAddMyDriveParent: FieldsList<FileField> get() = fieldsList("${path}/canAddMyDriveParent")
	val canChangeCopyRequiresWriterPermission: FieldsList<FileField> get() = fieldsList("${path}/canChangeCopyRequiresWriterPermission")
	val canChangeSecurityUpdateEnabled: FieldsList<FileField> get() = fieldsList("${path}/canChangeSecurityUpdateEnabled")
	val canChangeViewersCanCopyContent: FieldsList<FileField> get() = fieldsList("${path}/canChangeViewersCanCopyContent")
	val canComment: FieldsList<FileField> get() = fieldsList("${path}/canComment")
	val canCopy: FieldsList<FileField> get() = fieldsList("${path}/canCopy")
	val canDelete: FieldsList<FileField> get() = fieldsList("${path}/canDelete")
	val canDeleteChildren: FieldsList<FileField> get() = fieldsList("${path}/canDeleteChildren")
	val canDownload: FieldsList<FileField> get() = fieldsList("${path}/canDownload")
	val canEdit: FieldsList<FileField> get() = fieldsList("${path}/canEdit")
	val canListChildren: FieldsList<FileField> get() = fieldsList("${path}/canListChildren")
	val canModifyContent: FieldsList<FileField> get() = fieldsList("${path}/canModifyContent")
	val canModifyContentRestriction: FieldsList<FileField> get() = fieldsList("${path}/canModifyContentRestriction")
	val canModifyEditorContentRestriction: FieldsList<FileField> get() = fieldsList("${path}/canModifyEditorContentRestriction")
	val canModifyLabels: FieldsList<FileField> get() = fieldsList("${path}/canModifyLabels")
	val canModifyOwnerContentRestriction: FieldsList<FileField> get() = fieldsList("${path}/canModifyOwnerContentRestriction")
	val canMoveChildrenOutOfDrive: FieldsList<FileField> get() = fieldsList("${path}/canMoveChildrenOutOfDrive")
	val canMoveChildrenOutOfTeamDrive: FieldsList<FileField> get() = fieldsList("${path}/canMoveChildrenOutOfTeamDrive")
	val canMoveChildrenWithinDrive: FieldsList<FileField> get() = fieldsList("${path}/canMoveChildrenWithinDrive")
	val canMoveChildrenWithinTeamDrive: FieldsList<FileField> get() = fieldsList("${path}/canMoveChildrenWithinTeamDrive")
	val canMoveItemIntoTeamDrive: FieldsList<FileField> get() = fieldsList("${path}/canMoveItemIntoTeamDrive")
	val canMoveItemOutOfDrive: FieldsList<FileField> get() = fieldsList("${path}/canMoveItemOutOfDrive")
	val canMoveItemOutOfTeamDrive: FieldsList<FileField> get() = fieldsList("${path}/canMoveItemOutOfTeamDrive")
	val canMoveItemWithinDrive: FieldsList<FileField> get() = fieldsList("${path}/canMoveItemWithinDrive")
	val canMoveItemWithinTeamDrive: FieldsList<FileField> get() = fieldsList("${path}/canMoveItemWithinTeamDrive")
	val canMoveTeamDriveItem: FieldsList<FileField> get() = fieldsList("${path}/canMoveTeamDriveItem")
	val canReadDrive: FieldsList<FileField> get() = fieldsList("${path}/canReadDrive")
	val canReadLabels: FieldsList<FileField> get() = fieldsList("${path}/canReadLabels")
	val canReadRevisions: FieldsList<FileField> get() = fieldsList("${path}/canReadRevisions")
	val canReadTeamDrive: FieldsList<FileField> get() = fieldsList("${path}/canReadTeamDrive")
	val canRemoveChildren: FieldsList<FileField> get() = fieldsList("${path}/canRemoveChildren")
	val canRemoveContentRestriction: FieldsList<FileField> get() = fieldsList("${path}/canRemoveContentRestriction")
	val canRemoveMyDriveParent: FieldsList<FileField> get() = fieldsList("${path}/canRemoveMyDriveParent")
	val canRename: FieldsList<FileField> get() = fieldsList("${path}/canRename")
	val canShare: FieldsList<FileField> get() = fieldsList("${path}/canShare")
	val canTrash: FieldsList<FileField> get() = fieldsList("${path}/canTrash")
	val canTrashChildren: FieldsList<FileField> get() = fieldsList("${path}/canTrashChildren")
	val canUntrash: FieldsList<FileField> get() = fieldsList("${path}/canUntrash")
}

abstract class FileFieldContentHints(private val path: String) : FieldsList<FileField>(path) {
	val indexableText: FieldsList<FileField> get() = fieldsList("${path}/indexableText")
	val thumbnail by lazy { object : FileFieldThumbnail("${path}/thumbnail") {} }
}

abstract class FileFieldContentRestriction(private val path: String) : FieldsList<FileField>(path) {
	val ownerRestricted: FieldsList<FileField> get() = fieldsList("${path}/ownerRestricted")
	val readOnly: FieldsList<FileField> get() = fieldsList("${path}/readOnly")
	val reason: FieldsList<FileField> get() = fieldsList("${path}/reason")
	val restrictingUser by lazy { object : FileFieldUser("${path}/restrictingUser") {} }
	val restrictionTime: FieldsList<FileField> get() = fieldsList("${path}/restrictionTime")
	val systemRestricted: FieldsList<FileField> get() = fieldsList("${path}/systemRestricted")
	val type: FieldsList<FileField> get() = fieldsList("${path}/type")
}

abstract class FileFieldImageMediaMetadata(private val path: String) : FieldsList<FileField>(path) {
	val aperture: FieldsList<FileField> get() = fieldsList("${path}/aperture")
	val cameraMake: FieldsList<FileField> get() = fieldsList("${path}/cameraMake")
	val cameraModel: FieldsList<FileField> get() = fieldsList("${path}/cameraModel")
	val colorSpace: FieldsList<FileField> get() = fieldsList("${path}/colorSpace")
	val exposureBias: FieldsList<FileField> get() = fieldsList("${path}/exposureBias")
	val exposureMode: FieldsList<FileField> get() = fieldsList("${path}/exposureMode")
	val exposureTime: FieldsList<FileField> get() = fieldsList("${path}/exposureTime")
	val flashUsed: FieldsList<FileField> get() = fieldsList("${path}/flashUsed")
	val focalLength: FieldsList<FileField> get() = fieldsList("${path}/focalLength")
	val height: FieldsList<FileField> get() = fieldsList("${path}/height")
	val isoSpeed: FieldsList<FileField> get() = fieldsList("${path}/isoSpeed")
	val lens: FieldsList<FileField> get() = fieldsList("${path}/lens")
	val location by lazy { object : FileFieldLocation("${path}/location") {} }
	val maxApertureValue: FieldsList<FileField> get() = fieldsList("${path}/maxApertureValue")
	val meteringMode: FieldsList<FileField> get() = fieldsList("${path}/meteringMode")
	val rotation: FieldsList<FileField> get() = fieldsList("${path}/rotation")
	val sensor: FieldsList<FileField> get() = fieldsList("${path}/sensor")
	val subjectDistance: FieldsList<FileField> get() = fieldsList("${path}/subjectDistance")
	val time: FieldsList<FileField> get() = fieldsList("${path}/time")
	val whiteBalance: FieldsList<FileField> get() = fieldsList("${path}/whiteBalance")
	val width: FieldsList<FileField> get() = fieldsList("${path}/width")
}

abstract class FileFieldLabelInfo(private val path: String) : FieldsList<FileField>(path) {
	val labels by lazy { object : FileFieldLabel("${path}/labels") {} }
}

abstract class FileFieldUser(private val path: String) : FieldsList<FileField>(path) {
	val displayName: FieldsList<FileField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<FileField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<FileField> get() = fieldsList("${path}/kind")
	val me: FieldsList<FileField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<FileField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<FileField> get() = fieldsList("${path}/photoLink")
}

abstract class FileFieldLinkShareMetadata(private val path: String) : FieldsList<FileField>(path) {
	val securityUpdateEligible: FieldsList<FileField> get() = fieldsList("${path}/securityUpdateEligible")
	val securityUpdateEnabled: FieldsList<FileField> get() = fieldsList("${path}/securityUpdateEnabled")
}

abstract class FileFieldPermission(private val path: String) : FieldsList<FileField>(path) {
	val allowFileDiscovery: FieldsList<FileField> get() = fieldsList("${path}/allowFileDiscovery")
	val deleted: FieldsList<FileField> get() = fieldsList("${path}/deleted")
	val displayName: FieldsList<FileField> get() = fieldsList("${path}/displayName")
	val domain: FieldsList<FileField> get() = fieldsList("${path}/domain")
	val emailAddress: FieldsList<FileField> get() = fieldsList("${path}/emailAddress")
	val expirationTime: FieldsList<FileField> get() = fieldsList("${path}/expirationTime")
	val id: FieldsList<FileField> get() = fieldsList("${path}/id")
	val kind: FieldsList<FileField> get() = fieldsList("${path}/kind")
	val pendingOwner: FieldsList<FileField> get() = fieldsList("${path}/pendingOwner")
	val permissionDetails by lazy { object : FileFieldPermissionDetails("${path}/permissionDetails") {} }
	val photoLink: FieldsList<FileField> get() = fieldsList("${path}/photoLink")
	val role: FieldsList<FileField> get() = fieldsList("${path}/role")
	val teamDrivePermissionDetails by lazy { object : FileFieldTeamDrivePermissionDetails("${path}/teamDrivePermissionDetails") {} }
	val type: FieldsList<FileField> get() = fieldsList("${path}/type")
	val view: FieldsList<FileField> get() = fieldsList("${path}/view")
}

abstract class FileFieldShortcutDetails(private val path: String) : FieldsList<FileField>(path) {
	val targetId: FieldsList<FileField> get() = fieldsList("${path}/targetId")
	val targetMimeType: FieldsList<FileField> get() = fieldsList("${path}/targetMimeType")
	val targetResourceKey: FieldsList<FileField> get() = fieldsList("${path}/targetResourceKey")
}

abstract class FileFieldVideoMediaMetadata(private val path: String) : FieldsList<FileField>(path) {
	val durationMillis: FieldsList<FileField> get() = fieldsList("${path}/durationMillis")
	val height: FieldsList<FileField> get() = fieldsList("${path}/height")
	val width: FieldsList<FileField> get() = fieldsList("${path}/width")
}

abstract class FileFieldThumbnail(private val path: String) : FieldsList<FileField>(path) {
	val image: FieldsList<FileField> get() = fieldsList("${path}/image")
	val mimeType: FieldsList<FileField> get() = fieldsList("${path}/mimeType")
}

abstract class FileFieldLocation(private val path: String) : FieldsList<FileField>(path) {
	val altitude: FieldsList<FileField> get() = fieldsList("${path}/altitude")
	val latitude: FieldsList<FileField> get() = fieldsList("${path}/latitude")
	val longitude: FieldsList<FileField> get() = fieldsList("${path}/longitude")
}

abstract class FileFieldLabel(private val path: String) : FieldsList<FileField>(path) {
	val fields by lazy { object : FileFieldLabelField("${path}/fields") {} }
	val id: FieldsList<FileField> get() = fieldsList("${path}/id")
	val kind: FieldsList<FileField> get() = fieldsList("${path}/kind")
	val revisionId: FieldsList<FileField> get() = fieldsList("${path}/revisionId")
}

abstract class FileFieldPermissionDetails(private val path: String) : FieldsList<FileField>(path) {
	val inherited: FieldsList<FileField> get() = fieldsList("${path}/inherited")
	val inheritedFrom: FieldsList<FileField> get() = fieldsList("${path}/inheritedFrom")
	val permissionType: FieldsList<FileField> get() = fieldsList("${path}/permissionType")
	val role: FieldsList<FileField> get() = fieldsList("${path}/role")
}

abstract class FileFieldTeamDrivePermissionDetails(private val path: String) : FieldsList<FileField>(path) {
	val inherited: FieldsList<FileField> get() = fieldsList("${path}/inherited")
	val inheritedFrom: FieldsList<FileField> get() = fieldsList("${path}/inheritedFrom")
	val role: FieldsList<FileField> get() = fieldsList("${path}/role")
	val teamDrivePermissionType: FieldsList<FileField> get() = fieldsList("${path}/teamDrivePermissionType")
}

abstract class FileFieldLabelField(private val path: String) : FieldsList<FileField>(path) {
	val dateString: FieldsList<FileField> get() = fieldsList("${path}/dateString")
	val id: FieldsList<FileField> get() = fieldsList("${path}/id")
	val kind: FieldsList<FileField> get() = fieldsList("${path}/kind")
	val selection: FieldsList<FileField> get() = fieldsList("${path}/selection")
	val text: FieldsList<FileField> get() = fieldsList("${path}/text")
	val user by lazy { object : FileFieldUser("${path}/user") {} }
	val valueType: FieldsList<FileField> get() = fieldsList("${path}/valueType")
}

