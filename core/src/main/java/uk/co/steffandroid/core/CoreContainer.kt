package uk.co.steffandroid.core

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Provides

@BindingContainer
object CoreContainer {
    @Provides fun provideNumber(): Int = 42
}
