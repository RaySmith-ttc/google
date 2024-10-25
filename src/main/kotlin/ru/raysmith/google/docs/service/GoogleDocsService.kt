package ru.raysmith.google.docs.service

import com.google.api.services.docs.v1.Docs
import com.google.api.services.docs.v1.DocsScopes
import com.google.auth.http.HttpCredentialsAdapter
import ru.raysmith.google.utils.GoogleUtils


class GoogleDocsService(service: Docs) {
    companion object {
        fun service(
            applicationName: String, secretPath: String = "secret.json", scopes: Collection<String> = DocsScopes.all()
        ): Docs {
            return Docs.Builder(
                GoogleUtils.httpTransport,
                GoogleUtils.jsonFactory,
                HttpCredentialsAdapter(GoogleUtils.createCredentials(secretPath, scopes))
            )
                .setApplicationName(applicationName)
                .build()
        }
    }

    val Documents = GoogleDocumentsService(service.documents())
}