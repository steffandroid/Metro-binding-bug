package uk.co.steffandroid.lib.a

import android.app.Application
import android.util.Log
import dev.zacsweers.metro.Inject
import uk.co.steffandroid.core.CoreInterface
import uk.co.steffandroid.core.ParentGraphAccessor

class LibADependency {
    @Inject
    lateinit var coreInterface: CoreInterface

    private lateinit var libAGraph: LibAGraph

    fun getOutput(application: Application) {
        libAGraph = ((application as ParentGraphAccessor).getGraph() as LibAGraph.Factory)
            .createLibAGraph()
        libAGraph.inject(this)

        Log.d("Metro", "LibDependency: ${coreInterface.name}")
    }
}
