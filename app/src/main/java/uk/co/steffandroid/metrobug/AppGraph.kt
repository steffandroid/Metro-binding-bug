package uk.co.steffandroid.metrobug

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph

@DependencyGraph(AppScope::class)
interface AppGraph {
    fun inject(app: App)

    @DependencyGraph.Factory
    interface Factory {
        fun create(): AppGraph
    }
}
