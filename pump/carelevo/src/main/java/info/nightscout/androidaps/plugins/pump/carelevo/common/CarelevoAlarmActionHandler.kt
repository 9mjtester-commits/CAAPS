package info.nightscout.androidaps.plugins.pump.carelevo.common

import info.nightscout.androidaps.plugins.pump.carelevo.domain.model.alarm.CarelevoAlarmInfo
import info.nightscout.androidaps.plugins.pump.carelevo.domain.usecase.alarm.CarelevoAlarmInfoUseCase
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CarelevoAlarmActionHandler @Inject constructor(
    private val alarmUseCase: CarelevoAlarmInfoUseCase
) {

    fun observeAlarms() =
        alarmUseCase.observeAlarms()
            .map { it.orElse(emptyList()) }

    fun getAlarmsOnce(includeUnacknowledged: Boolean = true): Single<List<CarelevoAlarmInfo>> =
        alarmUseCase.getAlarmsOnce(includeUnacknowledged)
            .map { it.orElse(emptyList()) }
}