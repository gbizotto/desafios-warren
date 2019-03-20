package com.gbizotto.suitability.di.module

import android.app.Application
import com.gbizotto.suitability.R
import com.gbizotto.suitability.data.api.MessageApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
object AppModule {
    @JvmStatic
    @Provides
    @Singleton
    fun provideMessageApi(application: Application): MessageApi = Retrofit.Builder()
        .baseUrl(application.getString(R.string.conversation_base_url))
        .build()
        .create(MessageApi::class.java)
}