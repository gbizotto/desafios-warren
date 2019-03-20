package com.gbizotto.suitability.di.component

import android.content.Context
import com.gbizotto.suitability.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun applicationContext(applicationContext: Context): Builder

        fun build(): AppComponent
    }

//    fun bestPostViewModelFactory(): ViewModelFactory<BestPostViewModel>
}