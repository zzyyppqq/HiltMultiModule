/*
 * Copyright (C) 2019 NaLong. All Rights Reserved.
 * NaLong group reserve all right of the client.
 * Without authorization, no individual or organization may copy, extract or modify it.
 * If you find any infringement, please contact us.
 */
package com.zyp.news.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject
import javax.inject.Qualifier

/**
 * 描述：使用@Qualifier实现多个绑定
 * 作者：@author alex
 * 创建时间：2021/6/7 11:33 上午
 */
@Module
@InstallIn(ActivityComponent::class)
object AnalyticsQualifierModule {

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class QualifierTitle

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class QualifierDesc

    @QualifierTitle
    @Provides
    fun provideTitle(): String {
        return "原始Qualifier标题"
    }

    @QualifierDesc
    @Provides
    fun provideDesc(): String {
        return "原始Qualifier描述"
    }
}

data class AnalyticsQualifierService @Inject constructor(@AnalyticsQualifierModule.QualifierTitle var title: String, @AnalyticsQualifierModule.QualifierDesc var des: String)