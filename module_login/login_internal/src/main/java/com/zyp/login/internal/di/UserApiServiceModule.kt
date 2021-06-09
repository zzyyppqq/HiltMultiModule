package com.zyp.login.internal.di

import com.zyp.login.api.LoginApiService
import com.zyp.login.internal.impl.LoginApiServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UserApiServiceModule {
    @Singleton
    @Provides
    fun providerUserApiService(): LoginApiService = LoginApiServiceImpl()
}