/*
 * Copyright (C) 2019 NaLong. All Rights Reserved.
 * NaLong group reserve all right of the client.
 * Without authorization, no individual or organization may copy, extract or modify it.
 * If you find any infringement, please contact us.
 */
package com.zyp.login.api

import android.content.Context

/**
 * 描述：LoginApiService
 * 作者：@author alex
 * 创建时间：2021/6/3 3:54 下午
 */
interface LoginApiService {
    fun startLoginActivity(context: Context)
}