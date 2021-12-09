package com.example.assignment_52.data

import retrofit2.http.GET

interface BookApi {
    @GET("books")
    suspend fun getAllbooks():List<AllBooks>
}