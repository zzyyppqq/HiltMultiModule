package com.zyp.news.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject
import javax.inject.Named

/**
 * 描述：使用@Named实现多个绑定
 * 作者：@author alex
 * 创建时间：2021/6/7 11:29 上午
 */
@Module
@InstallIn(ActivityComponent::class)
object AnalyticsNameModule {
    @Named(NAME_TITLE)
    @Provides
    fun provideNamed(): String {
        return "原始Named限定符标题"
    }

    @Named(NAME_DESC)
    @Provides
    fun provideDesc(): String {
        return "原始Named限定符描述"
    }
}

const val NAME_TITLE = "NameTitle"
const val NAME_DESC = "NameDesc"

data class AnalyticsNameService @Inject constructor(@Named(NAME_TITLE) var title: String, @Named(NAME_DESC) val des: String)