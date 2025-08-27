package uk.co.steffandroid.lib.a

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.Provides
import uk.co.steffandroid.core.CoreContainer
import uk.co.steffandroid.core.CoreInterface

@BindingContainer(includes = [CoreContainer::class])
abstract class LibAContainer {
    @Binds
    abstract fun bindImplementation(impl: LibAImplementation): CoreInterface

    companion object {
        @Provides fun provideString(number: Int): String = "A$number"
    }
}
