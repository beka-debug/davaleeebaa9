package com.beka.mysuperapp.api

import com.beka.mysuperapp.api.dto.ReqResData
import com.beka.mysuperapp.api.dto.Resource
import com.beka.mysuperapp.api.dto.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ReqResService {
    @GET("users")
    fun getUsers(@Query("page")page: Int): Call<ReqResData<List<User>>>
    @GET("users/{userId}")
    fun getUser(@Path("userId") id: Int): Call<ReqResData<User>>
    @GET("unknown")
    fun getResources(): Call<ReqResData<List<Resource>>>
    @GET("unknown/{resourceId}")
    fun getResource(@Path("resourceId") id: Int): Call<ReqResData<Resource>>
}