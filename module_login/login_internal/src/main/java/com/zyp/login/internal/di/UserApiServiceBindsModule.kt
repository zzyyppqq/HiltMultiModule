package com.zyp.login.internal.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * 描述：
 * 作者：@author alex
 * 创建时间：2021/6/7 9:47 上午
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class UserApiServiceBindsModule {

//    @Singleton
//    @Binds
//    abstract fun bindUserApiService(userApiServiceImpl: UserApiServiceImpl): UserApiService
}