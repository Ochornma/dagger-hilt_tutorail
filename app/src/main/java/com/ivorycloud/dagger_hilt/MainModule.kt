package com.ivorycloud.dagger_hilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(ActivityComponent::class)
object MainModule {

   @ActivityScoped
    @Provides
    @Named("string2")
    fun provideTestString2(@ApplicationContext context: Context, @Named("string1")testString: String)
    = "${context.getString(R.string.inject_string)} and - $testString"


}