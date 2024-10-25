package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail


class GoogleUsersSettingsCseService(private val service: Gmail.Users.Settings.Cse) {
	val Identities = GoogleUsersSettingsCseIdentitiesService(service.identities())
	val Keypairs = GoogleUsersSettingsCseKeypairsService(service.keypairs())

    
}