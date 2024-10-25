package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ChangeListField : Field

object ChangeListFields {
    val ALL: FieldsList<ChangeListField> = fieldsList("*")
	val changes = object : ChangeListFieldChange("changes") {}
	val kind: FieldsList<ChangeListField> get() = fieldsList("kind")
	val newStartPageToken: FieldsList<ChangeListField> get() = fieldsList("newStartPageToken")
	val nextPageToken: FieldsList<ChangeListField> get() = fieldsList("nextPageToken")
}

abstract class ChangeListFieldChange(private val path: String) : FieldsList<ChangeListField>(path) {
	val changeType: FieldsList<ChangeListField> get() = fieldsList("${path}/changeType")
	val drive by lazy { object : ChangeListFieldDrive("${path}/drive") {} }
	val driveId: FieldsList<ChangeListField> get() = fieldsList("${path}/driveId")
	val file by lazy { object : ChangeListFieldFile("${path}/file") {} }
	val fileId: FieldsList<ChangeListField> get() = fieldsList("${path}/fileId")
	val kind: FieldsList<ChangeListField> get() = fieldsList("${path}/kind")
	val removed: FieldsList<ChangeListField> get() = fieldsList("${path}/removed")
	val teamDrive by lazy { object : ChangeListFieldTeamDrive("${path}/teamDrive") {} }
	val teamDriveId: FieldsList<ChangeListField> get() = fieldsList("${path}/teamDriveId")
	val time: FieldsList<ChangeListField> get() = fieldsList("${path}/time")
	val type: FieldsList<ChangeListField> get() = fieldsList("${path}/type")
}

abstract class ChangeListFieldDrive(private val path: String) : FieldsList<ChangeListField>(path) {
	val backgroundImageFile by lazy { object : ChangeListFieldBackgroundImageFile("${path}/backgroundImageFile") {} }
	val backgroundImageLink: FieldsList<ChangeListField> get() = fieldsList("${path}/backgroundImageLink")
	val capabilities by lazy { object : ChangeListFieldCapabilities("${path}/capabilities") {} }
	val colorRgb: FieldsList<ChangeListField> get() = fieldsList("${path}/colorRgb")
	val createdTime: FieldsList<ChangeListField> get() = fieldsList("${path}/createdTime")
	val hidden: FieldsList<ChangeListField> get() = fieldsList("${path}/hidden")
	val id: FieldsList<ChangeListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<ChangeListField> get() = fieldsList("${path}/kind")
	val name: FieldsList<ChangeListField> get() = fieldsList("${path}/name")
	val orgUnitId: FieldsList<ChangeListField> get() = fieldsList("${path}/orgUnitId")
	val restrictions by lazy { object : ChangeListFieldRestrictions("${path}/restrictions") {} }
	val themeId: FieldsList<ChangeListField> get() = fieldsList("${path}/themeId")
}

abstract class ChangeListFieldFile(private val path: String) : FieldsList<ChangeListField>(path) {
	val appProperties: FieldsList<ChangeListField> get() = fieldsList("${path}/appProperties")
	val capabilities by lazy { object : ChangeListFieldCapabilities("${path}/capabilities") {} }
	val contentHints by lazy { object : ChangeListFieldContentHints("${path}/contentHints") {} }
	val contentRestrictions by lazy { object : ChangeListFieldContentRestriction("${path}/contentRestrictions") {} }
	val copyRequiresWriterPermission: FieldsList<ChangeListField> get() = fieldsList("${path}/copyRequiresWriterPermission")
	val createdTime: FieldsList<ChangeListField> get() = fieldsList("${path}/createdTime")
	val description: FieldsList<ChangeListField> get() = fieldsList("${path}/description")
	val driveId: FieldsList<ChangeListField> get() = fieldsList("${path}/driveId")
	val explicitlyTrashed: FieldsList<ChangeListField> get() = fieldsList("${path}/explicitlyTrashed")
	val exportLinks: FieldsList<ChangeListField> get() = fieldsList("${path}/exportLinks")
	val fileExtension: FieldsList<ChangeListField> get() = fieldsList("${path}/fileExtension")
	val folderColorRgb: FieldsList<ChangeListField> get() = fieldsList("${path}/folderColorRgb")
	val fullFileExtension: FieldsList<ChangeListField> get() = fieldsList("${path}/fullFileExtension")
	val hasAugmentedPermissions: FieldsList<ChangeListField> get() = fieldsList("${path}/hasAugmentedPermissions")
	val hasThumbnail: FieldsList<ChangeListField> get() = fieldsList("${path}/hasThumbnail")
	val headRevisionId: FieldsList<ChangeListField> get() = fieldsList("${path}/headRevisionId")
	val iconLink: FieldsList<ChangeListField> get() = fieldsList("${path}/iconLink")
	val id: FieldsList<ChangeListField> get() = fieldsList("${path}/id")
	val imageMediaMetadata by lazy { object : ChangeListFieldImageMediaMetadata("${path}/imageMediaMetadata") {} }
	val isAppAuthorized: FieldsList<ChangeListField> get() = fieldsList("${path}/isAppAuthorized")
	val kind: FieldsList<ChangeListField> get() = fieldsList("${path}/kind")
	val labelInfo by lazy { object : ChangeListFieldLabelInfo("${path}/labelInfo") {} }
	val lastModifyingUser by lazy { object : ChangeListFieldUser("${path}/lastModifyingUser") {} }
	val linkShareMetadata by lazy { object : ChangeListFieldLinkShareMetadata("${path}/linkShareMetadata") {} }
	val md5Checksum: FieldsList<ChangeListField> get() = fieldsList("${path}/md5Checksum")
	val mimeType: FieldsList<ChangeListField> get() = fieldsList("${path}/mimeType")
	val modifiedByMe: FieldsList<ChangeListField> get() = fieldsList("${path}/modifiedByMe")
	val modifiedByMeTime: FieldsList<ChangeListField> get() = fieldsList("${path}/modifiedByMeTime")
	val modifiedTime: FieldsList<ChangeListField> get() = fieldsList("${path}/modifiedTime")
	val name: FieldsList<ChangeListField> get() = fieldsList("${path}/name")
	val originalFilename: FieldsList<ChangeListField> get() = fieldsList("${path}/originalFilename")
	val ownedByMe: FieldsList<ChangeListField> get() = fieldsList("${path}/ownedByMe")
	val owners by lazy { object : ChangeListFieldUser("${path}/owners") {} }
	val parents: FieldsList<ChangeListField> get() = fieldsList("${path}/parents")
	val permissionIds: FieldsList<ChangeListField> get() = fieldsList("${path}/permissionIds")
	val permissions by lazy { object : ChangeListFieldPermission("${path}/permissions") {} }
	val properties: FieldsList<ChangeListField> get() = fieldsList("${path}/properties")
	val quotaBytesUsed: FieldsList<ChangeListField> get() = fieldsList("${path}/quotaBytesUsed")
	val resourceKey: FieldsList<ChangeListField> get() = fieldsList("${path}/resourceKey")
	val sha1Checksum: FieldsList<ChangeListField> get() = fieldsList("${path}/sha1Checksum")
	val sha256Checksum: FieldsList<ChangeListField> get() = fieldsList("${path}/sha256Checksum")
	val shared: FieldsList<ChangeListField> get() = fieldsList("${path}/shared")
	val sharedWithMeTime: FieldsList<ChangeListField> get() = fieldsList("${path}/sharedWithMeTime")
	val sharingUser by lazy { object : ChangeListFieldUser("${path}/sharingUser") {} }
	val shortcutDetails by lazy { object : ChangeListFieldShortcutDetails("${path}/shortcutDetails") {} }
	val size: FieldsList<ChangeListField> get() = fieldsList("${path}/size")
	val spaces: FieldsList<ChangeListField> get() = fieldsList("${path}/spaces")
	val starred: FieldsList<ChangeListField> get() = fieldsList("${path}/starred")
	val teamDriveId: FieldsList<ChangeListField> get() = fieldsList("${path}/teamDriveId")
	val thumbnailLink: FieldsList<ChangeListField> get() = fieldsList("${path}/thumbnailLink")
	val thumbnailVersion: FieldsList<ChangeListField> get() = fieldsList("${path}/thumbnailVersion")
	val trashed: FieldsList<ChangeListField> get() = fieldsList("${path}/trashed")
	val trashedTime: FieldsList<ChangeListField> get() = fieldsList("${path}/trashedTime")
	val trashingUser by lazy { object : ChangeListFieldUser("${path}/trashingUser") {} }
	val version: FieldsList<ChangeListField> get() = fieldsList("${path}/version")
	val videoMediaMetadata by lazy { object : ChangeListFieldVideoMediaMetadata("${path}/videoMediaMetadata") {} }
	val viewedByMe: FieldsList<ChangeListField> get() = fieldsList("${path}/viewedByMe")
	val viewedByMeTime: FieldsList<ChangeListField> get() = fieldsList("${path}/viewedByMeTime")
	val viewersCanCopyContent: FieldsList<ChangeListField> get() = fieldsList("${path}/viewersCanCopyContent")
	val webContentLink: FieldsList<ChangeListField> get() = fieldsList("${path}/webContentLink")
	val webViewLink: FieldsList<ChangeListField> get() = fieldsList("${path}/webViewLink")
	val writersCanShare: FieldsList<ChangeListField> get() = fieldsList("${path}/writersCanShare")
}

abstract class ChangeListFieldTeamDrive(private val path: String) : FieldsList<ChangeListField>(path) {
	val backgroundImageFile by lazy { object : ChangeListFieldBackgroundImageFile("${path}/backgroundImageFile") {} }
	val backgroundImageLink: FieldsList<ChangeListField> get() = fieldsList("${path}/backgroundImageLink")
	val capabilities by lazy { object : ChangeListFieldCapabilities("${path}/capabilities") {} }
	val colorRgb: FieldsList<ChangeListField> get() = fieldsList("${path}/colorRgb")
	val createdTime: FieldsList<ChangeListField> get() = fieldsList("${path}/createdTime")
	val id: FieldsList<ChangeListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<ChangeListField> get() = fieldsList("${path}/kind")
	val name: FieldsList<ChangeListField> get() = fieldsList("${path}/name")
	val orgUnitId: FieldsList<ChangeListField> get() = fieldsList("${path}/orgUnitId")
	val restrictions by lazy { object : ChangeListFieldRestrictions("${path}/restrictions") {} }
	val themeId: FieldsList<ChangeListField> get() = fieldsList("${path}/themeId")
}

abstract class ChangeListFieldBackgroundImageFile(private val path: String) : FieldsList<ChangeListField>(path) {
	val id: FieldsList<ChangeListField> get() = fieldsList("${path}/id")
	val width: FieldsList<ChangeListField> get() = fieldsList("${path}/width")
	val xCoordinate: FieldsList<ChangeListField> get() = fieldsList("${path}/xCoordinate")
	val yCoordinate: FieldsList<ChangeListField> get() = fieldsList("${path}/yCoordinate")
}

abstract class ChangeListFieldCapabilities(private val path: String) : FieldsList<ChangeListField>(path) {
	val canAddChildren: FieldsList<ChangeListField> get() = fieldsList("${path}/canAddChildren")
	val canChangeCopyRequiresWriterPermissionRestriction: FieldsList<ChangeListField> get() = fieldsList("${path}/canChangeCopyRequiresWriterPermissionRestriction")
	val canChangeDomainUsersOnlyRestriction: FieldsList<ChangeListField> get() = fieldsList("${path}/canChangeDomainUsersOnlyRestriction")
	val canChangeDriveBackground: FieldsList<ChangeListField> get() = fieldsList("${path}/canChangeDriveBackground")
	val canChangeDriveMembersOnlyRestriction: FieldsList<ChangeListField> get() = fieldsList("${path}/canChangeDriveMembersOnlyRestriction")
	val canChangeSharingFoldersRequiresOrganizerPermissionRestriction: FieldsList<ChangeListField> get() = fieldsList("${path}/canChangeSharingFoldersRequiresOrganizerPermissionRestriction")
	val canComment: FieldsList<ChangeListField> get() = fieldsList("${path}/canComment")
	val canCopy: FieldsList<ChangeListField> get() = fieldsList("${path}/canCopy")
	val canDeleteChildren: FieldsList<ChangeListField> get() = fieldsList("${path}/canDeleteChildren")
	val canDeleteDrive: FieldsList<ChangeListField> get() = fieldsList("${path}/canDeleteDrive")
	val canDownload: FieldsList<ChangeListField> get() = fieldsList("${path}/canDownload")
	val canEdit: FieldsList<ChangeListField> get() = fieldsList("${path}/canEdit")
	val canListChildren: FieldsList<ChangeListField> get() = fieldsList("${path}/canListChildren")
	val canManageMembers: FieldsList<ChangeListField> get() = fieldsList("${path}/canManageMembers")
	val canReadRevisions: FieldsList<ChangeListField> get() = fieldsList("${path}/canReadRevisions")
	val canRename: FieldsList<ChangeListField> get() = fieldsList("${path}/canRename")
	val canRenameDrive: FieldsList<ChangeListField> get() = fieldsList("${path}/canRenameDrive")
	val canResetDriveRestrictions: FieldsList<ChangeListField> get() = fieldsList("${path}/canResetDriveRestrictions")
	val canShare: FieldsList<ChangeListField> get() = fieldsList("${path}/canShare")
	val canTrashChildren: FieldsList<ChangeListField> get() = fieldsList("${path}/canTrashChildren")
}

abstract class ChangeListFieldRestrictions(private val path: String) : FieldsList<ChangeListField>(path) {
	val adminManagedRestrictions: FieldsList<ChangeListField> get() = fieldsList("${path}/adminManagedRestrictions")
	val copyRequiresWriterPermission: FieldsList<ChangeListField> get() = fieldsList("${path}/copyRequiresWriterPermission")
	val domainUsersOnly: FieldsList<ChangeListField> get() = fieldsList("${path}/domainUsersOnly")
	val driveMembersOnly: FieldsList<ChangeListField> get() = fieldsList("${path}/driveMembersOnly")
	val sharingFoldersRequiresOrganizerPermission: FieldsList<ChangeListField> get() = fieldsList("${path}/sharingFoldersRequiresOrganizerPermission")
}

abstract class ChangeListFieldContentHints(private val path: String) : FieldsList<ChangeListField>(path) {
	val indexableText: FieldsList<ChangeListField> get() = fieldsList("${path}/indexableText")
	val thumbnail by lazy { object : ChangeListFieldThumbnail("${path}/thumbnail") {} }
}

abstract class ChangeListFieldContentRestriction(private val path: String) : FieldsList<ChangeListField>(path) {
	val ownerRestricted: FieldsList<ChangeListField> get() = fieldsList("${path}/ownerRestricted")
	val readOnly: FieldsList<ChangeListField> get() = fieldsList("${path}/readOnly")
	val reason: FieldsList<ChangeListField> get() = fieldsList("${path}/reason")
	val restrictingUser by lazy { object : ChangeListFieldUser("${path}/restrictingUser") {} }
	val restrictionTime: FieldsList<ChangeListField> get() = fieldsList("${path}/restrictionTime")
	val systemRestricted: FieldsList<ChangeListField> get() = fieldsList("${path}/systemRestricted")
	val type: FieldsList<ChangeListField> get() = fieldsList("${path}/type")
}

abstract class ChangeListFieldImageMediaMetadata(private val path: String) : FieldsList<ChangeListField>(path) {
	val aperture: FieldsList<ChangeListField> get() = fieldsList("${path}/aperture")
	val cameraMake: FieldsList<ChangeListField> get() = fieldsList("${path}/cameraMake")
	val cameraModel: FieldsList<ChangeListField> get() = fieldsList("${path}/cameraModel")
	val colorSpace: FieldsList<ChangeListField> get() = fieldsList("${path}/colorSpace")
	val exposureBias: FieldsList<ChangeListField> get() = fieldsList("${path}/exposureBias")
	val exposureMode: FieldsList<ChangeListField> get() = fieldsList("${path}/exposureMode")
	val exposureTime: FieldsList<ChangeListField> get() = fieldsList("${path}/exposureTime")
	val flashUsed: FieldsList<ChangeListField> get() = fieldsList("${path}/flashUsed")
	val focalLength: FieldsList<ChangeListField> get() = fieldsList("${path}/focalLength")
	val height: FieldsList<ChangeListField> get() = fieldsList("${path}/height")
	val isoSpeed: FieldsList<ChangeListField> get() = fieldsList("${path}/isoSpeed")
	val lens: FieldsList<ChangeListField> get() = fieldsList("${path}/lens")
	val location by lazy { object : ChangeListFieldLocation("${path}/location") {} }
	val maxApertureValue: FieldsList<ChangeListField> get() = fieldsList("${path}/maxApertureValue")
	val meteringMode: FieldsList<ChangeListField> get() = fieldsList("${path}/meteringMode")
	val rotation: FieldsList<ChangeListField> get() = fieldsList("${path}/rotation")
	val sensor: FieldsList<ChangeListField> get() = fieldsList("${path}/sensor")
	val subjectDistance: FieldsList<ChangeListField> get() = fieldsList("${path}/subjectDistance")
	val time: FieldsList<ChangeListField> get() = fieldsList("${path}/time")
	val whiteBalance: FieldsList<ChangeListField> get() = fieldsList("${path}/whiteBalance")
	val width: FieldsList<ChangeListField> get() = fieldsList("${path}/width")
}

abstract class ChangeListFieldLabelInfo(private val path: String) : FieldsList<ChangeListField>(path) {
	val labels by lazy { object : ChangeListFieldLabel("${path}/labels") {} }
}

abstract class ChangeListFieldUser(private val path: String) : FieldsList<ChangeListField>(path) {
	val displayName: FieldsList<ChangeListField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<ChangeListField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<ChangeListField> get() = fieldsList("${path}/kind")
	val me: FieldsList<ChangeListField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<ChangeListField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<ChangeListField> get() = fieldsList("${path}/photoLink")
}

abstract class ChangeListFieldLinkShareMetadata(private val path: String) : FieldsList<ChangeListField>(path) {
	val securityUpdateEligible: FieldsList<ChangeListField> get() = fieldsList("${path}/securityUpdateEligible")
	val securityUpdateEnabled: FieldsList<ChangeListField> get() = fieldsList("${path}/securityUpdateEnabled")
}

abstract class ChangeListFieldPermission(private val path: String) : FieldsList<ChangeListField>(path) {
	val allowFileDiscovery: FieldsList<ChangeListField> get() = fieldsList("${path}/allowFileDiscovery")
	val deleted: FieldsList<ChangeListField> get() = fieldsList("${path}/deleted")
	val displayName: FieldsList<ChangeListField> get() = fieldsList("${path}/displayName")
	val domain: FieldsList<ChangeListField> get() = fieldsList("${path}/domain")
	val emailAddress: FieldsList<ChangeListField> get() = fieldsList("${path}/emailAddress")
	val expirationTime: FieldsList<ChangeListField> get() = fieldsList("${path}/expirationTime")
	val id: FieldsList<ChangeListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<ChangeListField> get() = fieldsList("${path}/kind")
	val pendingOwner: FieldsList<ChangeListField> get() = fieldsList("${path}/pendingOwner")
	val permissionDetails by lazy { object : ChangeListFieldPermissionDetails("${path}/permissionDetails") {} }
	val photoLink: FieldsList<ChangeListField> get() = fieldsList("${path}/photoLink")
	val role: FieldsList<ChangeListField> get() = fieldsList("${path}/role")
	val teamDrivePermissionDetails by lazy { object : ChangeListFieldTeamDrivePermissionDetails("${path}/teamDrivePermissionDetails") {} }
	val type: FieldsList<ChangeListField> get() = fieldsList("${path}/type")
	val view: FieldsList<ChangeListField> get() = fieldsList("${path}/view")
}

abstract class ChangeListFieldShortcutDetails(private val path: String) : FieldsList<ChangeListField>(path) {
	val targetId: FieldsList<ChangeListField> get() = fieldsList("${path}/targetId")
	val targetMimeType: FieldsList<ChangeListField> get() = fieldsList("${path}/targetMimeType")
	val targetResourceKey: FieldsList<ChangeListField> get() = fieldsList("${path}/targetResourceKey")
}

abstract class ChangeListFieldVideoMediaMetadata(private val path: String) : FieldsList<ChangeListField>(path) {
	val durationMillis: FieldsList<ChangeListField> get() = fieldsList("${path}/durationMillis")
	val height: FieldsList<ChangeListField> get() = fieldsList("${path}/height")
	val width: FieldsList<ChangeListField> get() = fieldsList("${path}/width")
}

abstract class ChangeListFieldThumbnail(private val path: String) : FieldsList<ChangeListField>(path) {
	val image: FieldsList<ChangeListField> get() = fieldsList("${path}/image")
	val mimeType: FieldsList<ChangeListField> get() = fieldsList("${path}/mimeType")
}

abstract class ChangeListFieldLocation(private val path: String) : FieldsList<ChangeListField>(path) {
	val altitude: FieldsList<ChangeListField> get() = fieldsList("${path}/altitude")
	val latitude: FieldsList<ChangeListField> get() = fieldsList("${path}/latitude")
	val longitude: FieldsList<ChangeListField> get() = fieldsList("${path}/longitude")
}

abstract class ChangeListFieldLabel(private val path: String) : FieldsList<ChangeListField>(path) {
	val fields by lazy { object : ChangeListFieldLabelField("${path}/fields") {} }
	val id: FieldsList<ChangeListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<ChangeListField> get() = fieldsList("${path}/kind")
	val revisionId: FieldsList<ChangeListField> get() = fieldsList("${path}/revisionId")
}

abstract class ChangeListFieldPermissionDetails(private val path: String) : FieldsList<ChangeListField>(path) {
	val inherited: FieldsList<ChangeListField> get() = fieldsList("${path}/inherited")
	val inheritedFrom: FieldsList<ChangeListField> get() = fieldsList("${path}/inheritedFrom")
	val permissionType: FieldsList<ChangeListField> get() = fieldsList("${path}/permissionType")
	val role: FieldsList<ChangeListField> get() = fieldsList("${path}/role")
}

abstract class ChangeListFieldTeamDrivePermissionDetails(private val path: String) : FieldsList<ChangeListField>(path) {
	val inherited: FieldsList<ChangeListField> get() = fieldsList("${path}/inherited")
	val inheritedFrom: FieldsList<ChangeListField> get() = fieldsList("${path}/inheritedFrom")
	val role: FieldsList<ChangeListField> get() = fieldsList("${path}/role")
	val teamDrivePermissionType: FieldsList<ChangeListField> get() = fieldsList("${path}/teamDrivePermissionType")
}

abstract class ChangeListFieldLabelField(private val path: String) : FieldsList<ChangeListField>(path) {
	val dateString: FieldsList<ChangeListField> get() = fieldsList("${path}/dateString")
	val id: FieldsList<ChangeListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<ChangeListField> get() = fieldsList("${path}/kind")
	val selection: FieldsList<ChangeListField> get() = fieldsList("${path}/selection")
	val text: FieldsList<ChangeListField> get() = fieldsList("${path}/text")
	val user by lazy { object : ChangeListFieldUser("${path}/user") {} }
	val valueType: FieldsList<ChangeListField> get() = fieldsList("${path}/valueType")
}

