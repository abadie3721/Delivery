package com.optic.urbandelivery.providers

import com.optic.urbandelivery.api.ApiRoutes
import com.optic.urbandelivery.models.ResponseHttp
import com.optic.urbandelivery.models.User
import com.optic.urbandelivery.routes.UsersRoutes
import retrofit2.Call

class UsersProvider {

    private var usersRoutes: UsersRoutes? = null

    init {
        val api = ApiRoutes()
        usersRoutes = api.getUsersRoutes()
    }

    fun register(user:User):Call<ResponseHttp>?{
        return usersRoutes?.register(user)
    }
    fun login(email: String, password: String): Call<ResponseHttp>? {
        return usersRoutes?.login(email, password)
    }

 }