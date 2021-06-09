package com.zyp.login.internal.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(ViewModelComponent::class)
class LoginModule {
    @IntoSet
    @Provides
    fun provideString(): String {
        return "login"
    }
}