package app.revanced.patches.angulus

import com.android.tools.smali.dexlib2.AccessFlags
import app.revanced.patcher.fingerprint

internal val angulusAdsFingerprint = fingerprint {
    accessFlags(AccessFlags.PRIVATE)
    returns("I")
    strings("dailyMeasurementCount")
}

//dailyMeasurementCount
//lastMeasurementDate
//dailyAdResetCount
//MeasurementPrefs
