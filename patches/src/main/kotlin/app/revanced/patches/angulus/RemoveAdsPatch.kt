package app.revanced.patches.angulus

import app.revanced.patcher.extensions.InstructionExtensions.returnEarly
import app.revanced.patcher.patch.bytecodePatch

@Suppress("unused")
val angulusPatch = bytecodePatch(
    name = "Angulus Ad removal patch",
    description = "This is a patch to remove the Ads from Angulus. Unlimited measurements.",
) {
    compatibleWith("com.drinkplusplus.angulus"("5"))

    execute {
        // Remove the ads
        angulusAdsFingerprint.method.returnEarly()
    }

}
