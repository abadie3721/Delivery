package com.optic.urbandelivery.api

import com.optic.urbandelivery.routes.UsersRoutes


class ApiRoutes {

    val API_URL = "http://192.168.0.2:3000/api/"
    val retrofit = RetrofitClient()

    fun getUsersRoutes(): UsersRoutes{
        return retrofit.getClient(API_URL).create(UsersRoutes::class.java)

    }

}