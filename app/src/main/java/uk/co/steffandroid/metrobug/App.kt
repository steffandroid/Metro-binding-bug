package uk.co.steffandroid.metrobug

import android.app.Application
import dev.zacsweers.metro.createGraphFactory
import uk.co.steffandroid.core.ParentGraphAccessor
import uk.co.steffandroid.lib.a.LibADependency
import uk.co.steffandroid.lib.b.LibBDependency

class App : Application(), ParentGraphAccessor {
    private lateinit var appGraph: AppGraph

    override fun onCreate() {
        super.onCreate()

        appGraph = createGraphFactory<AppGraph.Factory>().create()
        appGraph.inject(this)

        val libADependency = LibADependency()
        libADependency.getOutput(this)

        val libBDependency = LibBDependency()
        libBDependency.getOutput(this)
    }

    override fun getGraph(): Any = appGraph
}
