package com.gbizotto.suitability

import android.app.Application
import com.gbizotto.suitability.di.DaggerComponentProvider
import com.gbizotto.suitability.di.component.AppComponent
import com.gbizotto.suitability.di.component.DaggerAppComponent

class SuitabilityApplication : Application(), DaggerComponentProvider {

    override val component: AppComponent by lazy {
        DaggerAppComponent.builder()
            .applicationContext(applicationContext)
            .build()
    }
}