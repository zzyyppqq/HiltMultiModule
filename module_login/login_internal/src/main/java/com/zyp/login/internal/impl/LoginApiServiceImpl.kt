/*
 * Copyright (C) 2019 NaLong. All Rights Reserved.
 * NaLong group reserve all right of the client.
 * Without authorization, no individual or organization may copy, extract or modify it.
 * If you find any infringement, please contact us.
 */
package com.zyp.login.internal.impl

import android.content.Context
import android.content.Intent
import com.zyp.login.api.LoginApiService
import com.zyp.login.internal.ui.login.LoginActivity
import javax.inject.Inject


/**
 * 描述：
 * 作者：@author alex
 * 创建时间：2021/6/3 3:55 下午
 */
class LoginApiServiceImpl: LoginApiService {
    override fun startLoginActivity(context: Context) {
        val intent = Intent(context, LoginActivity::class.java)
        context.startActivity(intent)
    }

}