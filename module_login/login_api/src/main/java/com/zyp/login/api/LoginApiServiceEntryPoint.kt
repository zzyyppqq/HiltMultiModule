/*
 * Copyright (C) 2019 NaLong. All Rights Reserved.
 * NaLong group reserve all right of the client.
 * Without authorization, no individual or organization may copy, extract or modify it.
 * If you find any infringement, please contact us.
 */
package com.zyp.login.api

import android.content.Context
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent

/**
 * 描述：LoginApiServicePoint
 * 作者：@author alex
 * 创建时间：2021/6/3 4:35 下午
 */
@EntryPoint
@InstallIn(SingletonComponent::class)
interface LoginApiServiceEntryPoint {
    fun loginApiService(): LoginApiService
}

fun loginApiService(context: Context): LoginApiService {
    return EntryPointAccessors.fromApplication(context, LoginApiServiceEntryPoint::class.java).loginApiService()
}
