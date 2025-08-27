package uk.co.steffandroid.lib.b

import android.app.Application
import android.util.Log
import dev.zacsweers.metro.Inject
import uk.co.steffandroid.core.CoreInterface
import uk.co.steffandroid.core.ParentGraphAccessor

class LibBDependency {
    @Inject
    lateinit var coreInterface: CoreInterface

    private lateinit var libBGraph: LibBGraph

    fun getOutput(application: Application) {
        libBGraph = ((application as ParentGraphAccessor).getGraph() as LibBGraph.Factory)
            .createLibBGraph()
        libBGraph.inject(this)

        Log.d("Metro", "DependencyB: ${coreInterface.name}")
    }
}
