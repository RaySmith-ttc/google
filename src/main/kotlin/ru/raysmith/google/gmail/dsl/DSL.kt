@file:Suppress("OVERRIDE_BY_INLINE", "unused")

package ru.raysmith.google.gmail.dsl

import com.google.api.services.gmail.model.*
import ru.raysmith.google.utils.GoogleDSL

@GoogleDSL
fun CseIdentity.signAndEncryptKeyPairs(setup: SignAndEncryptKeyPairs.() -> Unit) {
	signAndEncryptKeyPairs = SignAndEncryptKeyPairs().apply(setup)
}

interface CseKeyPairPrivateKeyMetadataBuilder {

	@GoogleDSL
	fun csePrivateKeyMetadata(setup: CsePrivateKeyMetadata.() -> Unit)
	val all: List<CsePrivateKeyMetadata>
}

@GoogleDSL
fun CseKeyPair.privateKeyMetadata(setup: CseKeyPairPrivateKeyMetadataBuilder.() -> Unit) {
	val builder = object : CseKeyPairPrivateKeyMetadataBuilder {
		override val all = mutableListOf<CsePrivateKeyMetadata>()

		@GoogleDSL
		override inline fun csePrivateKeyMetadata(setup: CsePrivateKeyMetadata.() -> Unit) {
			all.add(CsePrivateKeyMetadata().apply(setup))
		}
	}

	this.privateKeyMetadata = builder.apply(setup).all
}

@GoogleDSL
fun CsePrivateKeyMetadata.hardwareKeyMetadata(setup: HardwareKeyMetadata.() -> Unit) {
	hardwareKeyMetadata = HardwareKeyMetadata().apply(setup)
}

@GoogleDSL
fun CsePrivateKeyMetadata.kaclsKeyMetadata(setup: KaclsKeyMetadata.() -> Unit) {
	kaclsKeyMetadata = KaclsKeyMetadata().apply(setup)
}

@GoogleDSL
fun Draft.message(setup: Message.() -> Unit) {
	message = Message().apply(setup)
}

@GoogleDSL
fun Filter.action(setup: FilterAction.() -> Unit) {
	action = FilterAction().apply(setup)
}

@GoogleDSL
fun Filter.criteria(setup: FilterCriteria.() -> Unit) {
	criteria = FilterCriteria().apply(setup)
}

interface HistoryLabelsAddedBuilder {

	@GoogleDSL
	fun historyLabelAdded(setup: HistoryLabelAdded.() -> Unit)
	val all: List<HistoryLabelAdded>
}

@GoogleDSL
fun History.labelsAdded(setup: HistoryLabelsAddedBuilder.() -> Unit) {
	val builder = object : HistoryLabelsAddedBuilder {
		override val all = mutableListOf<HistoryLabelAdded>()

		@GoogleDSL
		override inline fun historyLabelAdded(setup: HistoryLabelAdded.() -> Unit) {
			all.add(HistoryLabelAdded().apply(setup))
		}
	}

	this.labelsAdded = builder.apply(setup).all
}

interface HistoryLabelsRemovedBuilder {

	@GoogleDSL
	fun historyLabelRemoved(setup: HistoryLabelRemoved.() -> Unit)
	val all: List<HistoryLabelRemoved>
}

@GoogleDSL
fun History.labelsRemoved(setup: HistoryLabelsRemovedBuilder.() -> Unit) {
	val builder = object : HistoryLabelsRemovedBuilder {
		override val all = mutableListOf<HistoryLabelRemoved>()

		@GoogleDSL
		override inline fun historyLabelRemoved(setup: HistoryLabelRemoved.() -> Unit) {
			all.add(HistoryLabelRemoved().apply(setup))
		}
	}

	this.labelsRemoved = builder.apply(setup).all
}

interface HistoryMessagesBuilder {

	@GoogleDSL
	fun message(setup: Message.() -> Unit)
	val all: List<Message>
}

@GoogleDSL
fun History.messages(setup: HistoryMessagesBuilder.() -> Unit) {
	val builder = object : HistoryMessagesBuilder {
		override val all = mutableListOf<Message>()

		@GoogleDSL
		override inline fun message(setup: Message.() -> Unit) {
			all.add(Message().apply(setup))
		}
	}

	this.messages = builder.apply(setup).all
}

interface HistoryMessagesAddedBuilder {

	@GoogleDSL
	fun historyMessageAdded(setup: HistoryMessageAdded.() -> Unit)
	val all: List<HistoryMessageAdded>
}

@GoogleDSL
fun History.messagesAdded(setup: HistoryMessagesAddedBuilder.() -> Unit) {
	val builder = object : HistoryMessagesAddedBuilder {
		override val all = mutableListOf<HistoryMessageAdded>()

		@GoogleDSL
		override inline fun historyMessageAdded(setup: HistoryMessageAdded.() -> Unit) {
			all.add(HistoryMessageAdded().apply(setup))
		}
	}

	this.messagesAdded = builder.apply(setup).all
}

interface HistoryMessagesDeletedBuilder {

	@GoogleDSL
	fun historyMessageDeleted(setup: HistoryMessageDeleted.() -> Unit)
	val all: List<HistoryMessageDeleted>
}

@GoogleDSL
fun History.messagesDeleted(setup: HistoryMessagesDeletedBuilder.() -> Unit) {
	val builder = object : HistoryMessagesDeletedBuilder {
		override val all = mutableListOf<HistoryMessageDeleted>()

		@GoogleDSL
		override inline fun historyMessageDeleted(setup: HistoryMessageDeleted.() -> Unit) {
			all.add(HistoryMessageDeleted().apply(setup))
		}
	}

	this.messagesDeleted = builder.apply(setup).all
}

@GoogleDSL
fun HistoryLabelAdded.message(setup: Message.() -> Unit) {
	message = Message().apply(setup)
}

@GoogleDSL
fun HistoryLabelRemoved.message(setup: Message.() -> Unit) {
	message = Message().apply(setup)
}

@GoogleDSL
fun HistoryMessageAdded.message(setup: Message.() -> Unit) {
	message = Message().apply(setup)
}

@GoogleDSL
fun HistoryMessageDeleted.message(setup: Message.() -> Unit) {
	message = Message().apply(setup)
}

@GoogleDSL
fun Label.color(setup: LabelColor.() -> Unit) {
	color = LabelColor().apply(setup)
}

interface ListCseIdentitiesResponseCseIdentitiesBuilder {

	@GoogleDSL
	fun cseIdentity(setup: CseIdentity.() -> Unit)
	val all: List<CseIdentity>
}

@GoogleDSL
fun ListCseIdentitiesResponse.cseIdentities(setup: ListCseIdentitiesResponseCseIdentitiesBuilder.() -> Unit) {
	val builder = object : ListCseIdentitiesResponseCseIdentitiesBuilder {
		override val all = mutableListOf<CseIdentity>()

		@GoogleDSL
		override inline fun cseIdentity(setup: CseIdentity.() -> Unit) {
			all.add(CseIdentity().apply(setup))
		}
	}

	this.cseIdentities = builder.apply(setup).all
}

interface ListCseKeyPairsResponseCseKeyPairsBuilder {

	@GoogleDSL
	fun cseKeyPair(setup: CseKeyPair.() -> Unit)
	val all: List<CseKeyPair>
}

@GoogleDSL
fun ListCseKeyPairsResponse.cseKeyPairs(setup: ListCseKeyPairsResponseCseKeyPairsBuilder.() -> Unit) {
	val builder = object : ListCseKeyPairsResponseCseKeyPairsBuilder {
		override val all = mutableListOf<CseKeyPair>()

		@GoogleDSL
		override inline fun cseKeyPair(setup: CseKeyPair.() -> Unit) {
			all.add(CseKeyPair().apply(setup))
		}
	}

	this.cseKeyPairs = builder.apply(setup).all
}

interface ListDelegatesResponseDelegatesBuilder {

	@GoogleDSL
	fun delegate(setup: Delegate.() -> Unit)
	val all: List<Delegate>
}

@GoogleDSL
fun ListDelegatesResponse.delegates(setup: ListDelegatesResponseDelegatesBuilder.() -> Unit) {
	val builder = object : ListDelegatesResponseDelegatesBuilder {
		override val all = mutableListOf<Delegate>()

		@GoogleDSL
		override inline fun delegate(setup: Delegate.() -> Unit) {
			all.add(Delegate().apply(setup))
		}
	}

	this.delegates = builder.apply(setup).all
}

interface ListDraftsResponseDraftsBuilder {

	@GoogleDSL
	fun draft(setup: Draft.() -> Unit)
	val all: List<Draft>
}

@GoogleDSL
fun ListDraftsResponse.drafts(setup: ListDraftsResponseDraftsBuilder.() -> Unit) {
	val builder = object : ListDraftsResponseDraftsBuilder {
		override val all = mutableListOf<Draft>()

		@GoogleDSL
		override inline fun draft(setup: Draft.() -> Unit) {
			all.add(Draft().apply(setup))
		}
	}

	this.drafts = builder.apply(setup).all
}

interface ListFiltersResponseFilterBuilder {

	@GoogleDSL
	fun filter(setup: Filter.() -> Unit)
	val all: List<Filter>
}

@GoogleDSL
fun ListFiltersResponse.filter(setup: ListFiltersResponseFilterBuilder.() -> Unit) {
	val builder = object : ListFiltersResponseFilterBuilder {
		override val all = mutableListOf<Filter>()

		@GoogleDSL
		override inline fun filter(setup: Filter.() -> Unit) {
			all.add(Filter().apply(setup))
		}
	}

	this.filter = builder.apply(setup).all
}

interface ListForwardingAddressesResponseForwardingAddressesBuilder {

	@GoogleDSL
	fun forwardingAddress(setup: ForwardingAddress.() -> Unit)
	val all: List<ForwardingAddress>
}

@GoogleDSL
fun ListForwardingAddressesResponse.forwardingAddresses(setup: ListForwardingAddressesResponseForwardingAddressesBuilder.() -> Unit) {
	val builder = object : ListForwardingAddressesResponseForwardingAddressesBuilder {
		override val all = mutableListOf<ForwardingAddress>()

		@GoogleDSL
		override inline fun forwardingAddress(setup: ForwardingAddress.() -> Unit) {
			all.add(ForwardingAddress().apply(setup))
		}
	}

	this.forwardingAddresses = builder.apply(setup).all
}

interface ListHistoryResponseHistoryBuilder {

	@GoogleDSL
	fun history(setup: History.() -> Unit)
	val all: List<History>
}

@GoogleDSL
fun ListHistoryResponse.history(setup: ListHistoryResponseHistoryBuilder.() -> Unit) {
	val builder = object : ListHistoryResponseHistoryBuilder {
		override val all = mutableListOf<History>()

		@GoogleDSL
		override inline fun history(setup: History.() -> Unit) {
			all.add(History().apply(setup))
		}
	}

	this.history = builder.apply(setup).all
}

interface ListLabelsResponseLabelsBuilder {

	@GoogleDSL
	fun label(setup: Label.() -> Unit)
	val all: List<Label>
}

@GoogleDSL
fun ListLabelsResponse.labels(setup: ListLabelsResponseLabelsBuilder.() -> Unit) {
	val builder = object : ListLabelsResponseLabelsBuilder {
		override val all = mutableListOf<Label>()

		@GoogleDSL
		override inline fun label(setup: Label.() -> Unit) {
			all.add(Label().apply(setup))
		}
	}

	this.labels = builder.apply(setup).all
}

interface ListMessagesResponseMessagesBuilder {

	@GoogleDSL
	fun message(setup: Message.() -> Unit)
	val all: List<Message>
}

@GoogleDSL
fun ListMessagesResponse.messages(setup: ListMessagesResponseMessagesBuilder.() -> Unit) {
	val builder = object : ListMessagesResponseMessagesBuilder {
		override val all = mutableListOf<Message>()

		@GoogleDSL
		override inline fun message(setup: Message.() -> Unit) {
			all.add(Message().apply(setup))
		}
	}

	this.messages = builder.apply(setup).all
}

interface ListSendAsResponseSendAsBuilder {

	@GoogleDSL
	fun sendAs(setup: SendAs.() -> Unit)
	val all: List<SendAs>
}

@GoogleDSL
fun ListSendAsResponse.sendAs(setup: ListSendAsResponseSendAsBuilder.() -> Unit) {
	val builder = object : ListSendAsResponseSendAsBuilder {
		override val all = mutableListOf<SendAs>()

		@GoogleDSL
		override inline fun sendAs(setup: SendAs.() -> Unit) {
			all.add(SendAs().apply(setup))
		}
	}

	this.sendAs = builder.apply(setup).all
}

interface ListSmimeInfoResponseSmimeInfoBuilder {

	@GoogleDSL
	fun smimeInfo(setup: SmimeInfo.() -> Unit)
	val all: List<SmimeInfo>
}

@GoogleDSL
fun ListSmimeInfoResponse.smimeInfo(setup: ListSmimeInfoResponseSmimeInfoBuilder.() -> Unit) {
	val builder = object : ListSmimeInfoResponseSmimeInfoBuilder {
		override val all = mutableListOf<SmimeInfo>()

		@GoogleDSL
		override inline fun smimeInfo(setup: SmimeInfo.() -> Unit) {
			all.add(SmimeInfo().apply(setup))
		}
	}

	this.smimeInfo = builder.apply(setup).all
}

interface ListThreadsResponseThreadsBuilder {

	@GoogleDSL
	fun thread(setup: Thread.() -> Unit)
	val all: List<Thread>
}

@GoogleDSL
fun ListThreadsResponse.threads(setup: ListThreadsResponseThreadsBuilder.() -> Unit) {
	val builder = object : ListThreadsResponseThreadsBuilder {
		override val all = mutableListOf<Thread>()

		@GoogleDSL
		override inline fun thread(setup: Thread.() -> Unit) {
			all.add(Thread().apply(setup))
		}
	}

	this.threads = builder.apply(setup).all
}

@GoogleDSL
fun Message.payload(setup: MessagePart.() -> Unit) {
	payload = MessagePart().apply(setup)
}

@GoogleDSL
fun MessagePart.body(setup: MessagePartBody.() -> Unit) {
	body = MessagePartBody().apply(setup)
}

interface MessagePartHeadersBuilder {

	@GoogleDSL
	fun messagePartHeader(setup: MessagePartHeader.() -> Unit)
	val all: List<MessagePartHeader>
}

@GoogleDSL
fun MessagePart.headers(setup: MessagePartHeadersBuilder.() -> Unit) {
	val builder = object : MessagePartHeadersBuilder {
		override val all = mutableListOf<MessagePartHeader>()

		@GoogleDSL
		override inline fun messagePartHeader(setup: MessagePartHeader.() -> Unit) {
			all.add(MessagePartHeader().apply(setup))
		}
	}

	this.headers = builder.apply(setup).all
}

interface MessagePartPartsBuilder {

	@GoogleDSL
	fun messagePart(setup: MessagePart.() -> Unit)
	val all: List<MessagePart>
}

@GoogleDSL
fun MessagePart.parts(setup: MessagePartPartsBuilder.() -> Unit) {
	val builder = object : MessagePartPartsBuilder {
		override val all = mutableListOf<MessagePart>()

		@GoogleDSL
		override inline fun messagePart(setup: MessagePart.() -> Unit) {
			all.add(MessagePart().apply(setup))
		}
	}

	this.parts = builder.apply(setup).all
}

@GoogleDSL
fun SendAs.smtpMsa(setup: SmtpMsa.() -> Unit) {
	smtpMsa = SmtpMsa().apply(setup)
}

interface ThreadMessagesBuilder {

	@GoogleDSL
	fun message(setup: Message.() -> Unit)
	val all: List<Message>
}

@GoogleDSL
fun Thread.messages(setup: ThreadMessagesBuilder.() -> Unit) {
	val builder = object : ThreadMessagesBuilder {
		override val all = mutableListOf<Message>()

		@GoogleDSL
		override inline fun message(setup: Message.() -> Unit) {
			all.add(Message().apply(setup))
		}
	}

	this.messages = builder.apply(setup).all
}

