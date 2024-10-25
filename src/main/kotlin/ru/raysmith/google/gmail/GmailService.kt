package ru.raysmith.google.gmail

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.GmailScopes
import com.google.api.services.gmail.model.Message
import com.google.auth.http.HttpCredentialsAdapter
import com.google.auth.oauth2.GoogleCredentials
import ru.raysmith.google.utils.GoogleUtils

class GmailService(val service: Gmail) {
    companion object {
        fun service(
            applicationName: String, secretPath: String = "secret.json", scopes: Collection<String> = GmailScopes.all()
        ): Gmail {
            val secretStream = ClassLoader.getSystemClassLoader().getResourceAsStream(secretPath)
                ?: error("resource file '$secretPath' not found")
            val credentials = GoogleCredentials.fromStream(secretStream).createScoped(scopes)
            return Gmail.Builder(
                GoogleUtils.httpTransport,
                GoogleUtils.jsonFactory,
                HttpCredentialsAdapter(credentials)
            )
                .setApplicationName(applicationName)
                .build()
        }
    }

    val Messages = GmailMessagesService(service.users().messages())

}

class GmailMessagesService(val service: Gmail.Users.Messages) {
    fun send(userId: String, message: Message, setup: Gmail.Users.Messages.Send.() -> Unit = { }): Message = service.send(userId, message).apply {
//        this.fields = fields.stringValue // TODO
        setup()
    }.execute()
}