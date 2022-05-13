package com.frogobox.admob.source

import com.frogobox.admob.model.FrogoAdmobId
import com.frogobox.admob.model.FrogoMonetizeId
import com.frogobox.admob.model.FrogoUnityId
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Path


/*
 * Created by faisalamir on 02/03/22
 * FrogoAdmob
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Frogobox Media Inc.      
 * All rights reserved
 *
 */

@Deprecated("Please re-import to latest package and use the new one")
interface FrogoAdmobApiService {

    @GET("{json-file-name}")
    fun getFrogoAdmobId(
        @Path("json-file-name") jsonFileName: String
    ): Observable<FrogoAdmobId>

    @GET("{json-file-name}")
    fun getMonetizeId(
        @Path("json-file-name") jsonFileName: String
    ): Observable<FrogoMonetizeId>

    @GET("{json-file-name}")
    fun getUnityId(
        @Path("json-file-name") jsonFileName: String
    ): Observable<FrogoUnityId>

}