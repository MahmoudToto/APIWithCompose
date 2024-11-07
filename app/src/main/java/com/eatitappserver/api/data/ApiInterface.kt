package com.eatitappserver.api.data

import com.eatitappserver.api.models.AllMemesData
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("get_memes")
    suspend fun getMemesList() :Response<AllMemesData>
}