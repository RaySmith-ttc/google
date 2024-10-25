package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ChangeField : Field

object ChangeFields {
    val ALL: FieldsList<ChangeField> = fieldsList("*")
	val changeType: FieldsList<ChangeField> get() = fieldsList("changeType")
	val drive = object : ChangeFieldDrive("drive") {}
	val driveId: FieldsList<ChangeField> get() = fieldsList("driveId")
	val file = object : ChangeFieldFile("file") {}
	val fileId: FieldsList<ChangeField> get() = fieldsList("fileId")
	val kind: FieldsList<ChangeField> get() = fieldsList("kind")
	val removed: FieldsList<ChangeField> get() = fieldsList("removed")
	val teamDrive = object : ChangeFieldTeamDrive("teamDrive") {}
	val teamDriveId: FieldsList<ChangeField> get() = fieldsList("teamDriveId")
	val time: FieldsList<ChangeField> get() = fieldsList("time")
	val type: FieldsList<ChangeField> get() = fieldsList("type")
}

abstract class ChangeFieldDrive(private val path: String) : FieldsList<ChangeField>(path) {
	val backgroundImageFile by lazy { object : ChangeFieldBackgroundImageFile("${path}/backgroundImageFile") {} }
	val backgroundImageLink: FieldsList<ChangeField> get() = fieldsList("${path}/backgroundImageLink")
	val capabilities by lazy { object : ChangeFieldCapabilities("${path}/capabilities") {} }
	val colorRgb: FieldsList<ChangeField> get() = fieldsList("${path}/colorRgb")
	val createdTime: FieldsList<ChangeField> get() = fieldsList("${path}/createdTime")
	val hidden: FieldsList<ChangeField> get() = fieldsList("${path}/hidden")
	val id: FieldsList<ChangeField> get() = fieldsList("${path}/id")
	val kind: FieldsList<ChangeField> get() = fieldsList("${path}/kind")
	val name: FieldsList<ChangeField> get() = fieldsList("${path}/name")
	val orgUnitId: FieldsList<ChangeField> get() = fieldsList("${path}/orgUnitId")
	val restrictions by lazy { object : ChangeFieldRestrictions("${path}/restrictions") {} }
	val themeId: FieldsList<ChangeField> get() = fieldsList("${path}/themeId")
}

abstract class ChangeFieldFile(private val path: String) : FieldsList<ChangeField>(path) {
	val appProperties: FieldsList<ChangeField> get() = fieldsList("${path}/appProperties")
	val capabilities by lazy { object : ChangeFieldCapabilities("${path}/capabilities") {} }
	val contentHints by lazy { object : ChangeFieldContentHints("${path}/contentHints") {} }
	val contentRestrictions by lazy { object : ChangeFieldContentRestriction("${path}/contentRestrictions") {} }
	val copyRequiresWriterPermission: FieldsList<ChangeField> get() = fieldsList("${path}/copyRequiresWriterPermission")
	val createdTime: FieldsList<ChangeField> get() = fieldsList("${path}/createdTime")
	val description: FieldsList<ChangeField> get() = fieldsList("${path}/description")
	val driveId: FieldsList<ChangeField> get() = fieldsList("${path}/driveId")
	val explicitlyTrashed: FieldsList<ChangeField> get() = fieldsList("${path}/explicitlyTrashed")
	val exportLinks: FieldsList<ChangeField> get() = fieldsList("${path}/exportLinks")
	val fileExtension: FieldsList<ChangeField> get() = fieldsList("${path}/fileExtension")
	val folderColorRgb: FieldsList<ChangeField> get() = fieldsList("${path}/folderColorRgb")
	val fullFileExtension: FieldsList<ChangeField> get() = fieldsList("${path}/fullFileExtension")
	val hasAugmentedPermissions: FieldsList<ChangeField> get() = fieldsList("${path}/hasAugmentedPermissions")
	val hasThumbnail: FieldsList<ChangeField> get() = fieldsList("${path}/hasThumbnail")
	val headRevisionId: FieldsList<ChangeField> get() = fieldsList("${path}/headRevisionId")
	val iconLink: FieldsList<ChangeField> get() = fieldsList("${path}/iconLink")
	val id: FieldsList<ChangeField> get() = fieldsList("${path}/id")
	val imageMediaMetadata by lazy { object : ChangeFieldImageMediaMetadata("${path}/imageMediaMetadata") {} }
	val isAppAuthorized: FieldsList<ChangeField> get() = fieldsList("${path}/isAppAuthorized")
	val kind: FieldsList<ChangeField> get() = fieldsList("${path}/kind")
	val labelInfo by lazy { object : ChangeFieldLabelInfo("${path}/labelInfo") {} }
	val lastModifyingUser by lazy { object : ChangeFieldUser("${path}/lastModifyingUser") {} }
	val linkShareMetadata by lazy { object : ChangeFieldLinkShareMetadata("${path}/linkShareMetadata") {} }
	val md5Checksum: FieldsList<ChangeField> get() = fieldsList("${path}/md5Checksum")
	val mimeType: FieldsList<ChangeField> get() = fieldsList("${path}/mimeType")
	val modifiedByMe: FieldsList<ChangeField> get() = fieldsList("${path}/modifiedByMe")
	val modifiedByMeTime: FieldsList<ChangeField> get() = fieldsList("${path}/modifiedByMeTime")
	val modifiedTime: FieldsList<ChangeField> get() = fieldsList("${path}/modifiedTime")
	val name: FieldsList<ChangeField> get() = fieldsList("${path}/name")
	val originalFilename: FieldsList<ChangeField> get() = fieldsList("${path}/originalFilename")
	val ownedByMe: FieldsList<ChangeField> get() = fieldsList("${path}/ownedByMe")
	val owners by lazy { object : ChangeFieldUser("${path}/owners") {} }
	val parents: FieldsList<ChangeField> get() = fieldsList("${path}/parents")
	val permissionIds: FieldsList<ChangeField> get() = fieldsList("${path}/permissionIds")
	val permissions by lazy { object : ChangeFieldPermission("${path}/permissions") {} }
	val properties: FieldsList<ChangeField> get() = fieldsList("${path}/properties")
	val quotaBytesUsed: FieldsList<ChangeField> get() = fieldsList("${path}/quotaBytesUsed")
	val resourceKey: FieldsList<ChangeField> get() = fieldsList("${path}/resourceKey")
	val sha1Checksum: FieldsList<ChangeField> get() = fieldsList("${path}/sha1Checksum")
	val sha256Checksum: FieldsList<ChangeField> get() = fieldsList("${path}/sha256Checksum")
	val shared: FieldsList<ChangeField> get() = fieldsList("${path}/shared")
	val sharedWithMeTime: FieldsList<ChangeField> get() = fieldsList("${path}/sharedWithMeTime")
	val sharingUser by lazy { object : ChangeFieldUser("${path}/sharingUser") {} }
	val shortcutDetails by lazy { object : ChangeFieldShortcutDetails("${path}/shortcutDetails") {} }
	val size: FieldsList<ChangeField> get() = fieldsList("${path}/size")
	val spaces: FieldsList<ChangeField> get() = fieldsList("${path}/spaces")
	val starred: FieldsList<ChangeField> get() = fieldsList("${path}/starred")
	val teamDriveId: FieldsList<ChangeField> get() = fieldsList("${path}/teamDriveId")
	val thumbnailLink: FieldsList<ChangeField> get() = fieldsList("${path}/thumbnailLink")
	val thumbnailVersion: FieldsList<ChangeField> get() = fieldsList("${path}/thumbnailVersion")
	val trashed: FieldsList<ChangeField> get() = fieldsList("${path}/trashed")
	val trashedTime: FieldsList<ChangeField> get() = fieldsList("${path}/trashedTime")
	val trashingUser by lazy { object : ChangeFieldUser("${path}/trashingUser") {} }
	val version: FieldsList<ChangeField> get() = fieldsList("${path}/version")
	val videoMediaMetadata by lazy { object : ChangeFieldVideoMediaMetadata("${path}/videoMediaMetadata") {} }
	val viewedByMe: FieldsList<ChangeField> get() = fieldsList("${path}/viewedByMe")
	val viewedByMeTime: FieldsList<ChangeField> get() = fieldsList("${path}/viewedByMeTime")
	val viewersCanCopyContent: FieldsList<ChangeField> get() = fieldsList("${path}/viewersCanCopyContent")
	val webContentLink: FieldsList<ChangeField> get() = fieldsList("${path}/webContentLink")
	val webViewLink: FieldsList<ChangeField> get() = fieldsList("${path}/webViewLink")
	val writersCanShare: FieldsList<ChangeField> get() = fieldsList("${path}/writersCanShare")
}

abstract class ChangeFieldTeamDrive(private val path: String) : FieldsList<ChangeField>(path) {
	val backgroundImageFile by lazy { object : ChangeFieldBackgroundImageFile("${path}/backgroundImageFile") {} }
	val backgroundImageLink: FieldsList<ChangeField> get() = fieldsList("${path}/backgroundImageLink")
	val capabilities by lazy { object : ChangeFieldCapabilities("${path}/capabilities") {} }
	val colorRgb: FieldsList<ChangeField> get() = fieldsList("${path}/colorRgb")
	val createdTime: FieldsList<ChangeField> get() = fieldsList("${path}/createdTime")
	val id: FieldsList<ChangeField> get() = fieldsList("${path}/id")
	val kind: FieldsList<ChangeField> get() = fieldsList("${path}/kind")
	val name: FieldsList<ChangeField> get() = fieldsList("${path}/name")
	val orgUnitId: FieldsList<ChangeField> get() = fieldsList("${path}/orgUnitId")
	val restrictions by lazy { object : ChangeFieldRestrictions("${path}/restrictions") {} }
	val themeId: FieldsList<ChangeField> get() = fieldsList("${path}/themeId")
}

abstract class ChangeFieldBackgroundImageFile(private val path: String) : FieldsList<ChangeField>(path) {
	val id: FieldsList<ChangeField> get() = fieldsList("${path}/id")
	val width: FieldsList<ChangeField> get() = fieldsList("${path}/width")
	val xCoordinate: FieldsList<ChangeField> get() = fieldsList("${path}/xCoordinate")
	val yCoordinate: FieldsList<ChangeField> get() = fieldsList("${path}/yCoordinate")
}

abstract class ChangeFieldCapabilities(private val path: String) : FieldsList<ChangeField>(path) {
	val canAddChildren: FieldsList<ChangeField> get() = fieldsList("${path}/canAddChildren")
	val canChangeCopyRequiresWriterPermissionRestriction: FieldsList<ChangeField> get() = fieldsList("${path}/canChangeCopyRequiresWriterPermissionRestriction")
	val canChangeDomainUsersOnlyRestriction: FieldsList<ChangeField> get() = fieldsList("${path}/canChangeDomainUsersOnlyRestriction")
	val canChangeDriveBackground: FieldsList<ChangeField> get() = fieldsList("${path}/canChangeDriveBackground")
	val canChangeDriveMembersOnlyRestriction: FieldsList<ChangeField> get() = fieldsList("${path}/canChangeDriveMembersOnlyRestriction")
	val canChangeSharingFoldersRequiresOrganizerPermissionRestriction: FieldsList<ChangeField> get() = fieldsList("${path}/canChangeSharingFoldersRequiresOrganizerPermissionRestriction")
	val canComment: FieldsList<ChangeField> get() = fieldsList("${path}/canComment")
	val canCopy: FieldsList<ChangeField> get() = fieldsList("${path}/canCopy")
	val canDeleteChildren: FieldsList<ChangeField> get() = fieldsList("${path}/canDeleteChildren")
	val canDeleteDrive: FieldsList<ChangeField> get() = fieldsList("${path}/canDeleteDrive")
	val canDownload: FieldsList<ChangeField> get() = fieldsList("${path}/canDownload")
	val canEdit: FieldsList<ChangeField> get() = fieldsList("${path}/canEdit")
	val canListChildren: FieldsList<ChangeField> get() = fieldsList("${path}/canListChildren")
	val canManageMembers: FieldsList<ChangeField> get() = fieldsList("${path}/canManageMembers")
	val canReadRevisions: FieldsList<ChangeField> get() = fieldsList("${path}/canReadRevisions")
	val canRename: FieldsList<ChangeField> get() = fieldsList("${path}/canRename")
	val canRenameDrive: FieldsList<ChangeField> get() = fieldsList("${path}/canRenameDrive")
	val canResetDriveRestrictions: FieldsList<ChangeField> get() = fieldsList("${path}/canResetDriveRestrictions")
	val canShare: FieldsList<ChangeField> get() = fieldsList("${path}/canShare")
	val canTrashChildren: FieldsList<ChangeField> get() = fieldsList("${path}/canTrashChildren")
}

abstract class ChangeFieldRestrictions(private val path: String) : FieldsList<ChangeField>(path) {
	val adminManagedRestrictions: FieldsList<ChangeField> get() = fieldsList("${path}/adminManagedRestrictions")
	val copyRequiresWriterPermission: FieldsList<ChangeField> get() = fieldsList("${path}/copyRequiresWriterPermission")
	val domainUsersOnly: FieldsList<ChangeField> get() = fieldsList("${path}/domainUsersOnly")
	val driveMembersOnly: FieldsList<ChangeField> get() = fieldsList("${path}/driveMembersOnly")
	val sharingFoldersRequiresOrganizerPermission: FieldsList<ChangeField> get() = fieldsList("${path}/sharingFoldersRequiresOrganizerPermission")
}

abstract class ChangeFieldContentHints(private val path: String) : FieldsList<ChangeField>(path) {
	val indexableText: FieldsList<ChangeField> get() = fieldsList("${path}/indexableText")
	val thumbnail by lazy { object : ChangeFieldThumbnail("${path}/thumbnail") {} }
}

abstract class ChangeFieldContentRestriction(private val path: String) : FieldsList<ChangeField>(path) {
	val ownerRestricted: FieldsList<ChangeField> get() = fieldsList("${path}/ownerRestricted")
	val readOnly: FieldsList<ChangeField> get() = fieldsList("${path}/readOnly")
	val reason: FieldsList<ChangeField> get() = fieldsList("${path}/reason")
	val restrictingUser by lazy { object : ChangeFieldUser("${path}/restrictingUser") {} }
	val restrictionTime: FieldsList<ChangeField> get() = fieldsList("${path}/restrictionTime")
	val systemRestricted: FieldsList<ChangeField> get() = fieldsList("${path}/systemRestricted")
	val type: FieldsList<ChangeField> get() = fieldsList("${path}/type")
}

abstract class ChangeFieldImageMediaMetadata(private val path: String) : FieldsList<ChangeField>(path) {
	val aperture: FieldsList<ChangeField> get() = fieldsList("${path}/aperture")
	val cameraMake: FieldsList<ChangeField> get() = fieldsList("${path}/cameraMake")
	val cameraModel: FieldsList<ChangeField> get() = fieldsList("${path}/cameraModel")
	val colorSpace: FieldsList<ChangeField> get() = fieldsList("${path}/colorSpace")
	val exposureBias: FieldsList<ChangeField> get() = fieldsList("${path}/exposureBias")
	val exposureMode: FieldsList<ChangeField> get() = fieldsList("${path}/exposureMode")
	val exposureTime: FieldsList<ChangeField> get() = fieldsList("${path}/exposureTime")
	val flashUsed: FieldsList<ChangeField> get() = fieldsList("${path}/flashUsed")
	val focalLength: FieldsList<ChangeField> get() = fieldsList("${path}/focalLength")
	val height: FieldsList<ChangeField> get() = fieldsList("${path}/height")
	val isoSpeed: FieldsList<ChangeField> get() = fieldsList("${path}/isoSpeed")
	val lens: FieldsList<ChangeField> get() = fieldsList("${path}/lens")
	val location by lazy { object : ChangeFieldLocation("${path}/location") {} }
	val maxApertureValue: FieldsList<ChangeField> get() = fieldsList("${path}/maxApertureValue")
	val meteringMode: FieldsList<ChangeField> get() = fieldsList("${path}/meteringMode")
	val rotation: FieldsList<ChangeField> get() = fieldsList("${path}/rotation")
	val sensor: FieldsList<ChangeField> get() = fieldsList("${path}/sensor")
	val subjectDistance: FieldsList<ChangeField> get() = fieldsList("${path}/subjectDistance")
	val time: FieldsList<ChangeField> get() = fieldsList("${path}/time")
	val whiteBalance: FieldsList<ChangeField> get() = fieldsList("${path}/whiteBalance")
	val width: FieldsList<ChangeField> get() = fieldsList("${path}/width")
}

abstract class ChangeFieldLabelInfo(private val path: String) : FieldsList<ChangeField>(path) {
	val labels by lazy { object : ChangeFieldLabel("${path}/labels") {} }
}

abstract class ChangeFieldUser(private val path: String) : FieldsList<ChangeField>(path) {
	val displayName: FieldsList<ChangeField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<ChangeField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<ChangeField> get() = fieldsList("${path}/kind")
	val me: FieldsList<ChangeField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<ChangeField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<ChangeField> get() = fieldsList("${path}/photoLink")
}

abstract class ChangeFieldLinkShareMetadata(private val path: String) : FieldsList<ChangeField>(path) {
	val securityUpdateEligible: FieldsList<ChangeField> get() = fieldsList("${path}/securityUpdateEligible")
	val securityUpdateEnabled: FieldsList<ChangeField> get() = fieldsList("${path}/securityUpdateEnabled")
}

abstract class ChangeFieldPermission(private val path: String) : FieldsList<ChangeField>(path) {
	val allowFileDiscovery: FieldsList<ChangeField> get() = fieldsList("${path}/allowFileDiscovery")
	val deleted: FieldsList<ChangeField> get() = fieldsList("${path}/deleted")
	val displayName: FieldsList<ChangeField> get() = fieldsList("${path}/displayName")
	val domain: FieldsList<ChangeField> get() = fieldsList("${path}/domain")
	val emailAddress: FieldsList<ChangeField> get() = fieldsList("${path}/emailAddress")
	val expirationTime: FieldsList<ChangeField> get() = fieldsList("${path}/expirationTime")
	val id: FieldsList<ChangeField> get() = fieldsList("${path}/id")
	val kind: FieldsList<ChangeField> get() = fieldsList("${path}/kind")
	val pendingOwner: FieldsList<ChangeField> get() = fieldsList("${path}/pendingOwner")
	val permissionDetails by lazy { object : ChangeFieldPermissionDetails("${path}/permissionDetails") {} }
	val photoLink: FieldsList<ChangeField> get() = fieldsList("${path}/photoLink")
	val role: FieldsList<ChangeField> get() = fieldsList("${path}/role")
	val teamDrivePermissionDetails by lazy { object : ChangeFieldTeamDrivePermissionDetails("${path}/teamDrivePermissionDetails") {} }
	val type: FieldsList<ChangeField> get() = fieldsList("${path}/type")
	val view: FieldsList<ChangeField> get() = fieldsList("${path}/view")
}

abstract class ChangeFieldShortcutDetails(private val path: String) : FieldsList<ChangeField>(path) {
	val targetId: FieldsList<ChangeField> get() = fieldsList("${path}/targetId")
	val targetMimeType: FieldsList<ChangeField> get() = fieldsList("${path}/targetMimeType")
	val targetResourceKey: FieldsList<ChangeField> get() = fieldsList("${path}/targetResourceKey")
}

abstract class ChangeFieldVideoMediaMetadata(private val path: String) : FieldsList<ChangeField>(path) {
	val durationMillis: FieldsList<ChangeField> get() = fieldsList("${path}/durationMillis")
	val height: FieldsList<ChangeField> get() = fieldsList("${path}/height")
	val width: FieldsList<ChangeField> get() = fieldsList("${path}/width")
}

abstract class ChangeFieldThumbnail(private val path: String) : FieldsList<ChangeField>(path) {
	val image: FieldsList<ChangeField> get() = fieldsList("${path}/image")
	val mimeType: FieldsList<ChangeField> get() = fieldsList("${path}/mimeType")
}

abstract class ChangeFieldLocation(private val path: String) : FieldsList<ChangeField>(path) {
	val altitude: FieldsList<ChangeField> get() = fieldsList("${path}/altitude")
	val latitude: FieldsList<ChangeField> get() = fieldsList("${path}/latitude")
	val longitude: FieldsList<ChangeField> get() = fieldsList("${path}/longitude")
}

abstract class ChangeFieldLabel(private val path: String) : FieldsList<ChangeField>(path) {
	val fields by lazy { object : ChangeFieldLabelField("${path}/fields") {} }
	val id: FieldsList<ChangeField> get() = fieldsList("${path}/id")
	val kind: FieldsList<ChangeField> get() = fieldsList("${path}/kind")
	val revisionId: FieldsList<ChangeField> get() = fieldsList("${path}/revisionId")
}

abstract class ChangeFieldPermissionDetails(private val path: String) : FieldsList<ChangeField>(path) {
	val inherited: FieldsList<ChangeField> get() = fieldsList("${path}/inherited")
	val inheritedFrom: FieldsList<ChangeField> get() = fieldsList("${path}/inheritedFrom")
	val permissionType: FieldsList<ChangeField> get() = fieldsList("${path}/permissionType")
	val role: FieldsList<ChangeField> get() = fieldsList("${path}/role")
}

abstract class ChangeFieldTeamDrivePermissionDetails(private val path: String) : FieldsList<ChangeField>(path) {
	val inherited: FieldsList<ChangeField> get() = fieldsList("${path}/inherited")
	val inheritedFrom: FieldsList<ChangeField> get() = fieldsList("${path}/inheritedFrom")
	val role: FieldsList<ChangeField> get() = fieldsList("${path}/role")
	val teamDrivePermissionType: FieldsList<ChangeField> get() = fieldsList("${path}/teamDrivePermissionType")
}

abstract class ChangeFieldLabelField(private val path: String) : FieldsList<ChangeField>(path) {
	val dateString: FieldsList<ChangeField> get() = fieldsList("${path}/dateString")
	val id: FieldsList<ChangeField> get() = fieldsList("${path}/id")
	val kind: FieldsList<ChangeField> get() = fieldsList("${path}/kind")
	val selection: FieldsList<ChangeField> get() = fieldsList("${path}/selection")
	val text: FieldsList<ChangeField> get() = fieldsList("${path}/text")
	val user by lazy { object : ChangeFieldUser("${path}/user") {} }
	val valueType: FieldsList<ChangeField> get() = fieldsList("${path}/valueType")
}

