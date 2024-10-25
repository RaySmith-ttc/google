package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.GmailScopes
import com.google.auth.http.HttpCredentialsAdapter
import ru.raysmith.google.utils.GoogleUtils


class GoogleGmailService(service: Gmail) {
    companion object {
        fun service(
            applicationName: String, secretPath: String = "secret.json", scopes: Collection<String> = GmailScopes.all()
        ): Gmail {
            return Gmail.Builder(
                GoogleUtils.httpTransport,
                GoogleUtils.jsonFactory,
                HttpCredentialsAdapter(GoogleUtils.createCredentials(secretPath, scopes))
            )
                .setApplicationName(applicationName)
                .build()
        }
    }

    val Users = GoogleUsersService(service.users())
}