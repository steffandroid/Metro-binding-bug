package uk.co.steffandroid.lib.a

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.GraphExtension
import uk.co.steffandroid.core.ExtensionScope

@GraphExtension(ExtensionScope::class, bindingContainers = [LibAContainer::class])
interface LibAGraph {
    fun inject(dependency: LibADependency)

    @GraphExtension.Factory
    @ContributesTo(AppScope::class)
    interface Factory {
        fun createLibAGraph(): LibAGraph
    }
}
