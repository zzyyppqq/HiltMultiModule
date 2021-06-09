package com.zyp.analytics.internal.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(ActivityComponent::class)
class AnalyticsModule {

    @IntoSet
    @Provides
    fun provideString(): String {
        return "analytics"
    }
}