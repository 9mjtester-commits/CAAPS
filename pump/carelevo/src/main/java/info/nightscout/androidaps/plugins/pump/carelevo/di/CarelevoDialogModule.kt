package info.nightscout.androidaps.plugins.pump.carelevo.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import info.nightscout.androidaps.plugins.pump.carelevo.ui.dialog.CarelevoAlarmDialog

@Module
abstract class CarelevoDialogModule {

    @FragmentScope
    @ContributesAndroidInjector
    internal abstract fun contributesCarelevoAlarmDialog(): CarelevoAlarmDialog
}