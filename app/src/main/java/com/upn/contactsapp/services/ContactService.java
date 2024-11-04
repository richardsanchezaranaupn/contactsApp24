package com.upn.contactsapp.services;

import com.upn.contactsapp.entities.Contact;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ContactService {

    //@GET("/contacts")
    //Call< List<Contact> > getAll();

    @GET("/contacts")
    Call<List<Contact>> getAll(@Query("limit") int limit, @Query("page") int page);

    @GET("/contacts/{id}")
    Call< Contact > find(@Path("id") int id);

    @POST("/contacts")
    Call<Contact> create(@Body Contact contact);
}
