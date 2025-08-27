package uk.co.steffandroid.lib.b

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.Provides
import uk.co.steffandroid.core.CoreContainer
import uk.co.steffandroid.core.CoreInterface

@BindingContainer(includes = [CoreContainer::class])
abstract class LibBContainer {
    @Binds
    abstract fun bindImplementation(impl: LibBImplementation): CoreInterface

    companion object {
        @Provides fun provideString(number: Int): String = "B$number"
    }
}
