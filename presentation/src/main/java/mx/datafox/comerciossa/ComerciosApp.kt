package mx.datafox.comerciossa

import android.app.Application
import mx.datafox.comerciossa.di.presentationModule
import mx.datafox.data.di.dataModule
import mx.datafox.domain.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ComerciosApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ComerciosApp)
            modules(listOf(
                dataModule,
                domainModule,
                presentationModule
            ))
        }
    }
}