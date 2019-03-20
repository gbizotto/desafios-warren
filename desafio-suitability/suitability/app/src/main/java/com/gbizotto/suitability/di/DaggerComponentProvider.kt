package com.gbizotto.suitability.di

import android.app.Activity
import com.gbizotto.suitability.di.component.AppComponent

interface DaggerComponentProvider {

    val component: AppComponent
}

val Activity.injector get() = (application as DaggerComponentProvider).component
