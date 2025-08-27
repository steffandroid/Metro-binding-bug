package uk.co.steffandroid.lib.b

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.GraphExtension
import uk.co.steffandroid.core.ExtensionScope

@GraphExtension(ExtensionScope::class, bindingContainers = [LibBContainer::class])
interface LibBGraph {
    fun inject(dependency: LibBDependency)

    @GraphExtension.Factory
    @ContributesTo(AppScope::class)
    interface Factory {
        fun createLibBGraph(): LibBGraph
    }
}
