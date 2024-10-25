package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface FileListField : Field

object FileListFields {
    val ALL: FieldsList<FileListField> = fieldsList("*")
	val files = object : FileListFieldFile("files") {}
	val incompleteSearch: FieldsList<FileListField> get() = fieldsList("incompleteSearch")
	val kind: FieldsList<FileListField> get() = fieldsList("kind")
	val nextPageToken: FieldsList<FileListField> get() = fieldsList("nextPageToken")
}

abstract class FileListFieldFile(private val path: String) : FieldsList<FileListField>(path) {
	val appProperties: FieldsList<FileListField> get() = fieldsList("${path}/appProperties")
	val capabilities by lazy { object : FileListFieldCapabilities("${path}/capabilities") {} }
	val contentHints by lazy { object : FileListFieldContentHints("${path}/contentHints") {} }
	val contentRestrictions by lazy { object : FileListFieldContentRestriction("${path}/contentRestrictions") {} }
	val copyRequiresWriterPermission: FieldsList<FileListField> get() = fieldsList("${path}/copyRequiresWriterPermission")
	val createdTime: FieldsList<FileListField> get() = fieldsList("${path}/createdTime")
	val description: FieldsList<FileListField> get() = fieldsList("${path}/description")
	val driveId: FieldsList<FileListField> get() = fieldsList("${path}/driveId")
	val explicitlyTrashed: FieldsList<FileListField> get() = fieldsList("${path}/explicitlyTrashed")
	val exportLinks: FieldsList<FileListField> get() = fieldsList("${path}/exportLinks")
	val fileExtension: FieldsList<FileListField> get() = fieldsList("${path}/fileExtension")
	val folderColorRgb: FieldsList<FileListField> get() = fieldsList("${path}/folderColorRgb")
	val fullFileExtension: FieldsList<FileListField> get() = fieldsList("${path}/fullFileExtension")
	val hasAugmentedPermissions: FieldsList<FileListField> get() = fieldsList("${path}/hasAugmentedPermissions")
	val hasThumbnail: FieldsList<FileListField> get() = fieldsList("${path}/hasThumbnail")
	val headRevisionId: FieldsList<FileListField> get() = fieldsList("${path}/headRevisionId")
	val iconLink: FieldsList<FileListField> get() = fieldsList("${path}/iconLink")
	val id: FieldsList<FileListField> get() = fieldsList("${path}/id")
	val imageMediaMetadata by lazy { object : FileListFieldImageMediaMetadata("${path}/imageMediaMetadata") {} }
	val isAppAuthorized: FieldsList<FileListField> get() = fieldsList("${path}/isAppAuthorized")
	val kind: FieldsList<FileListField> get() = fieldsList("${path}/kind")
	val labelInfo by lazy { object : FileListFieldLabelInfo("${path}/labelInfo") {} }
	val lastModifyingUser by lazy { object : FileListFieldUser("${path}/lastModifyingUser") {} }
	val linkShareMetadata by lazy { object : FileListFieldLinkShareMetadata("${path}/linkShareMetadata") {} }
	val md5Checksum: FieldsList<FileListField> get() = fieldsList("${path}/md5Checksum")
	val mimeType: FieldsList<FileListField> get() = fieldsList("${path}/mimeType")
	val modifiedByMe: FieldsList<FileListField> get() = fieldsList("${path}/modifiedByMe")
	val modifiedByMeTime: FieldsList<FileListField> get() = fieldsList("${path}/modifiedByMeTime")
	val modifiedTime: FieldsList<FileListField> get() = fieldsList("${path}/modifiedTime")
	val name: FieldsList<FileListField> get() = fieldsList("${path}/name")
	val originalFilename: FieldsList<FileListField> get() = fieldsList("${path}/originalFilename")
	val ownedByMe: FieldsList<FileListField> get() = fieldsList("${path}/ownedByMe")
	val owners by lazy { object : FileListFieldUser("${path}/owners") {} }
	val parents: FieldsList<FileListField> get() = fieldsList("${path}/parents")
	val permissionIds: FieldsList<FileListField> get() = fieldsList("${path}/permissionIds")
	val permissions by lazy { object : FileListFieldPermission("${path}/permissions") {} }
	val properties: FieldsList<FileListField> get() = fieldsList("${path}/properties")
	val quotaBytesUsed: FieldsList<FileListField> get() = fieldsList("${path}/quotaBytesUsed")
	val resourceKey: FieldsList<FileListField> get() = fieldsList("${path}/resourceKey")
	val sha1Checksum: FieldsList<FileListField> get() = fieldsList("${path}/sha1Checksum")
	val sha256Checksum: FieldsList<FileListField> get() = fieldsList("${path}/sha256Checksum")
	val shared: FieldsList<FileListField> get() = fieldsList("${path}/shared")
	val sharedWithMeTime: FieldsList<FileListField> get() = fieldsList("${path}/sharedWithMeTime")
	val sharingUser by lazy { object : FileListFieldUser("${path}/sharingUser") {} }
	val shortcutDetails by lazy { object : FileListFieldShortcutDetails("${path}/shortcutDetails") {} }
	val size: FieldsList<FileListField> get() = fieldsList("${path}/size")
	val spaces: FieldsList<FileListField> get() = fieldsList("${path}/spaces")
	val starred: FieldsList<FileListField> get() = fieldsList("${path}/starred")
	val teamDriveId: FieldsList<FileListField> get() = fieldsList("${path}/teamDriveId")
	val thumbnailLink: FieldsList<FileListField> get() = fieldsList("${path}/thumbnailLink")
	val thumbnailVersion: FieldsList<FileListField> get() = fieldsList("${path}/thumbnailVersion")
	val trashed: FieldsList<FileListField> get() = fieldsList("${path}/trashed")
	val trashedTime: FieldsList<FileListField> get() = fieldsList("${path}/trashedTime")
	val trashingUser by lazy { object : FileListFieldUser("${path}/trashingUser") {} }
	val version: FieldsList<FileListField> get() = fieldsList("${path}/version")
	val videoMediaMetadata by lazy { object : FileListFieldVideoMediaMetadata("${path}/videoMediaMetadata") {} }
	val viewedByMe: FieldsList<FileListField> get() = fieldsList("${path}/viewedByMe")
	val viewedByMeTime: FieldsList<FileListField> get() = fieldsList("${path}/viewedByMeTime")
	val viewersCanCopyContent: FieldsList<FileListField> get() = fieldsList("${path}/viewersCanCopyContent")
	val webContentLink: FieldsList<FileListField> get() = fieldsList("${path}/webContentLink")
	val webViewLink: FieldsList<FileListField> get() = fieldsList("${path}/webViewLink")
	val writersCanShare: FieldsList<FileListField> get() = fieldsList("${path}/writersCanShare")
}

abstract class FileListFieldCapabilities(private val path: String) : FieldsList<FileListField>(path) {
	val canAcceptOwnership: FieldsList<FileListField> get() = fieldsList("${path}/canAcceptOwnership")
	val canAddChildren: FieldsList<FileListField> get() = fieldsList("${path}/canAddChildren")
	val canAddFolderFromAnotherDrive: FieldsList<FileListField> get() = fieldsList("${path}/canAddFolderFromAnotherDrive")
	val canAddMyDriveParent: FieldsList<FileListField> get() = fieldsList("${path}/canAddMyDriveParent")
	val canChangeCopyRequiresWriterPermission: FieldsList<FileListField> get() = fieldsList("${path}/canChangeCopyRequiresWriterPermission")
	val canChangeSecurityUpdateEnabled: FieldsList<FileListField> get() = fieldsList("${path}/canChangeSecurityUpdateEnabled")
	val canChangeViewersCanCopyContent: FieldsList<FileListField> get() = fieldsList("${path}/canChangeViewersCanCopyContent")
	val canComment: FieldsList<FileListField> get() = fieldsList("${path}/canComment")
	val canCopy: FieldsList<FileListField> get() = fieldsList("${path}/canCopy")
	val canDelete: FieldsList<FileListField> get() = fieldsList("${path}/canDelete")
	val canDeleteChildren: FieldsList<FileListField> get() = fieldsList("${path}/canDeleteChildren")
	val canDownload: FieldsList<FileListField> get() = fieldsList("${path}/canDownload")
	val canEdit: FieldsList<FileListField> get() = fieldsList("${path}/canEdit")
	val canListChildren: FieldsList<FileListField> get() = fieldsList("${path}/canListChildren")
	val canModifyContent: FieldsList<FileListField> get() = fieldsList("${path}/canModifyContent")
	val canModifyContentRestriction: FieldsList<FileListField> get() = fieldsList("${path}/canModifyContentRestriction")
	val canModifyEditorContentRestriction: FieldsList<FileListField> get() = fieldsList("${path}/canModifyEditorContentRestriction")
	val canModifyLabels: FieldsList<FileListField> get() = fieldsList("${path}/canModifyLabels")
	val canModifyOwnerContentRestriction: FieldsList<FileListField> get() = fieldsList("${path}/canModifyOwnerContentRestriction")
	val canMoveChildrenOutOfDrive: FieldsList<FileListField> get() = fieldsList("${path}/canMoveChildrenOutOfDrive")
	val canMoveChildrenOutOfTeamDrive: FieldsList<FileListField> get() = fieldsList("${path}/canMoveChildrenOutOfTeamDrive")
	val canMoveChildrenWithinDrive: FieldsList<FileListField> get() = fieldsList("${path}/canMoveChildrenWithinDrive")
	val canMoveChildrenWithinTeamDrive: FieldsList<FileListField> get() = fieldsList("${path}/canMoveChildrenWithinTeamDrive")
	val canMoveItemIntoTeamDrive: FieldsList<FileListField> get() = fieldsList("${path}/canMoveItemIntoTeamDrive")
	val canMoveItemOutOfDrive: FieldsList<FileListField> get() = fieldsList("${path}/canMoveItemOutOfDrive")
	val canMoveItemOutOfTeamDrive: FieldsList<FileListField> get() = fieldsList("${path}/canMoveItemOutOfTeamDrive")
	val canMoveItemWithinDrive: FieldsList<FileListField> get() = fieldsList("${path}/canMoveItemWithinDrive")
	val canMoveItemWithinTeamDrive: FieldsList<FileListField> get() = fieldsList("${path}/canMoveItemWithinTeamDrive")
	val canMoveTeamDriveItem: FieldsList<FileListField> get() = fieldsList("${path}/canMoveTeamDriveItem")
	val canReadDrive: FieldsList<FileListField> get() = fieldsList("${path}/canReadDrive")
	val canReadLabels: FieldsList<FileListField> get() = fieldsList("${path}/canReadLabels")
	val canReadRevisions: FieldsList<FileListField> get() = fieldsList("${path}/canReadRevisions")
	val canReadTeamDrive: FieldsList<FileListField> get() = fieldsList("${path}/canReadTeamDrive")
	val canRemoveChildren: FieldsList<FileListField> get() = fieldsList("${path}/canRemoveChildren")
	val canRemoveContentRestriction: FieldsList<FileListField> get() = fieldsList("${path}/canRemoveContentRestriction")
	val canRemoveMyDriveParent: FieldsList<FileListField> get() = fieldsList("${path}/canRemoveMyDriveParent")
	val canRename: FieldsList<FileListField> get() = fieldsList("${path}/canRename")
	val canShare: FieldsList<FileListField> get() = fieldsList("${path}/canShare")
	val canTrash: FieldsList<FileListField> get() = fieldsList("${path}/canTrash")
	val canTrashChildren: FieldsList<FileListField> get() = fieldsList("${path}/canTrashChildren")
	val canUntrash: FieldsList<FileListField> get() = fieldsList("${path}/canUntrash")
}

abstract class FileListFieldContentHints(private val path: String) : FieldsList<FileListField>(path) {
	val indexableText: FieldsList<FileListField> get() = fieldsList("${path}/indexableText")
	val thumbnail by lazy { object : FileListFieldThumbnail("${path}/thumbnail") {} }
}

abstract class FileListFieldContentRestriction(private val path: String) : FieldsList<FileListField>(path) {
	val ownerRestricted: FieldsList<FileListField> get() = fieldsList("${path}/ownerRestricted")
	val readOnly: FieldsList<FileListField> get() = fieldsList("${path}/readOnly")
	val reason: FieldsList<FileListField> get() = fieldsList("${path}/reason")
	val restrictingUser by lazy { object : FileListFieldUser("${path}/restrictingUser") {} }
	val restrictionTime: FieldsList<FileListField> get() = fieldsList("${path}/restrictionTime")
	val systemRestricted: FieldsList<FileListField> get() = fieldsList("${path}/systemRestricted")
	val type: FieldsList<FileListField> get() = fieldsList("${path}/type")
}

abstract class FileListFieldImageMediaMetadata(private val path: String) : FieldsList<FileListField>(path) {
	val aperture: FieldsList<FileListField> get() = fieldsList("${path}/aperture")
	val cameraMake: FieldsList<FileListField> get() = fieldsList("${path}/cameraMake")
	val cameraModel: FieldsList<FileListField> get() = fieldsList("${path}/cameraModel")
	val colorSpace: FieldsList<FileListField> get() = fieldsList("${path}/colorSpace")
	val exposureBias: FieldsList<FileListField> get() = fieldsList("${path}/exposureBias")
	val exposureMode: FieldsList<FileListField> get() = fieldsList("${path}/exposureMode")
	val exposureTime: FieldsList<FileListField> get() = fieldsList("${path}/exposureTime")
	val flashUsed: FieldsList<FileListField> get() = fieldsList("${path}/flashUsed")
	val focalLength: FieldsList<FileListField> get() = fieldsList("${path}/focalLength")
	val height: FieldsList<FileListField> get() = fieldsList("${path}/height")
	val isoSpeed: FieldsList<FileListField> get() = fieldsList("${path}/isoSpeed")
	val lens: FieldsList<FileListField> get() = fieldsList("${path}/lens")
	val location by lazy { object : FileListFieldLocation("${path}/location") {} }
	val maxApertureValue: FieldsList<FileListField> get() = fieldsList("${path}/maxApertureValue")
	val meteringMode: FieldsList<FileListField> get() = fieldsList("${path}/meteringMode")
	val rotation: FieldsList<FileListField> get() = fieldsList("${path}/rotation")
	val sensor: FieldsList<FileListField> get() = fieldsList("${path}/sensor")
	val subjectDistance: FieldsList<FileListField> get() = fieldsList("${path}/subjectDistance")
	val time: FieldsList<FileListField> get() = fieldsList("${path}/time")
	val whiteBalance: FieldsList<FileListField> get() = fieldsList("${path}/whiteBalance")
	val width: FieldsList<FileListField> get() = fieldsList("${path}/width")
}

abstract class FileListFieldLabelInfo(private val path: String) : FieldsList<FileListField>(path) {
	val labels by lazy { object : FileListFieldLabel("${path}/labels") {} }
}

abstract class FileListFieldUser(private val path: String) : FieldsList<FileListField>(path) {
	val displayName: FieldsList<FileListField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<FileListField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<FileListField> get() = fieldsList("${path}/kind")
	val me: FieldsList<FileListField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<FileListField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<FileListField> get() = fieldsList("${path}/photoLink")
}

abstract class FileListFieldLinkShareMetadata(private val path: String) : FieldsList<FileListField>(path) {
	val securityUpdateEligible: FieldsList<FileListField> get() = fieldsList("${path}/securityUpdateEligible")
	val securityUpdateEnabled: FieldsList<FileListField> get() = fieldsList("${path}/securityUpdateEnabled")
}

abstract class FileListFieldPermission(private val path: String) : FieldsList<FileListField>(path) {
	val allowFileDiscovery: FieldsList<FileListField> get() = fieldsList("${path}/allowFileDiscovery")
	val deleted: FieldsList<FileListField> get() = fieldsList("${path}/deleted")
	val displayName: FieldsList<FileListField> get() = fieldsList("${path}/displayName")
	val domain: FieldsList<FileListField> get() = fieldsList("${path}/domain")
	val emailAddress: FieldsList<FileListField> get() = fieldsList("${path}/emailAddress")
	val expirationTime: FieldsList<FileListField> get() = fieldsList("${path}/expirationTime")
	val id: FieldsList<FileListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<FileListField> get() = fieldsList("${path}/kind")
	val pendingOwner: FieldsList<FileListField> get() = fieldsList("${path}/pendingOwner")
	val permissionDetails by lazy { object : FileListFieldPermissionDetails("${path}/permissionDetails") {} }
	val photoLink: FieldsList<FileListField> get() = fieldsList("${path}/photoLink")
	val role: FieldsList<FileListField> get() = fieldsList("${path}/role")
	val teamDrivePermissionDetails by lazy { object : FileListFieldTeamDrivePermissionDetails("${path}/teamDrivePermissionDetails") {} }
	val type: FieldsList<FileListField> get() = fieldsList("${path}/type")
	val view: FieldsList<FileListField> get() = fieldsList("${path}/view")
}

abstract class FileListFieldShortcutDetails(private val path: String) : FieldsList<FileListField>(path) {
	val targetId: FieldsList<FileListField> get() = fieldsList("${path}/targetId")
	val targetMimeType: FieldsList<FileListField> get() = fieldsList("${path}/targetMimeType")
	val targetResourceKey: FieldsList<FileListField> get() = fieldsList("${path}/targetResourceKey")
}

abstract class FileListFieldVideoMediaMetadata(private val path: String) : FieldsList<FileListField>(path) {
	val durationMillis: FieldsList<FileListField> get() = fieldsList("${path}/durationMillis")
	val height: FieldsList<FileListField> get() = fieldsList("${path}/height")
	val width: FieldsList<FileListField> get() = fieldsList("${path}/width")
}

abstract class FileListFieldThumbnail(private val path: String) : FieldsList<FileListField>(path) {
	val image: FieldsList<FileListField> get() = fieldsList("${path}/image")
	val mimeType: FieldsList<FileListField> get() = fieldsList("${path}/mimeType")
}

abstract class FileListFieldLocation(private val path: String) : FieldsList<FileListField>(path) {
	val altitude: FieldsList<FileListField> get() = fieldsList("${path}/altitude")
	val latitude: FieldsList<FileListField> get() = fieldsList("${path}/latitude")
	val longitude: FieldsList<FileListField> get() = fieldsList("${path}/longitude")
}

abstract class FileListFieldLabel(private val path: String) : FieldsList<FileListField>(path) {
	val fields by lazy { object : FileListFieldLabelField("${path}/fields") {} }
	val id: FieldsList<FileListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<FileListField> get() = fieldsList("${path}/kind")
	val revisionId: FieldsList<FileListField> get() = fieldsList("${path}/revisionId")
}

abstract class FileListFieldPermissionDetails(private val path: String) : FieldsList<FileListField>(path) {
	val inherited: FieldsList<FileListField> get() = fieldsList("${path}/inherited")
	val inheritedFrom: FieldsList<FileListField> get() = fieldsList("${path}/inheritedFrom")
	val permissionType: FieldsList<FileListField> get() = fieldsList("${path}/permissionType")
	val role: FieldsList<FileListField> get() = fieldsList("${path}/role")
}

abstract class FileListFieldTeamDrivePermissionDetails(private val path: String) : FieldsList<FileListField>(path) {
	val inherited: FieldsList<FileListField> get() = fieldsList("${path}/inherited")
	val inheritedFrom: FieldsList<FileListField> get() = fieldsList("${path}/inheritedFrom")
	val role: FieldsList<FileListField> get() = fieldsList("${path}/role")
	val teamDrivePermissionType: FieldsList<FileListField> get() = fieldsList("${path}/teamDrivePermissionType")
}

abstract class FileListFieldLabelField(private val path: String) : FieldsList<FileListField>(path) {
	val dateString: FieldsList<FileListField> get() = fieldsList("${path}/dateString")
	val id: FieldsList<FileListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<FileListField> get() = fieldsList("${path}/kind")
	val selection: FieldsList<FileListField> get() = fieldsList("${path}/selection")
	val text: FieldsList<FileListField> get() = fieldsList("${path}/text")
	val user by lazy { object : FileListFieldUser("${path}/user") {} }
	val valueType: FieldsList<FileListField> get() = fieldsList("${path}/valueType")
}

