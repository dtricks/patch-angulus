package app.revanced.patches.angulus

import app.revanced.patcher.patch.bytecodePatch
import app.revanced.patcher.extensions.InstructionExtensions.addInstruction

@Suppress("unused")
val examplePatch = bytecodePatch(
    name = "Angulus Ad removal patch",
    description = "This is a patch to remove the Ads from Angulus.",
) {
    compatibleWith("com.drinkplusplus.angulus"("5.0.20"))

    execute {
        // By overwriting the second parameter of the method,
        // the view which holds the advertisement is removed.
        // angulusAdsFingerprint.method.addInstruction(0, "const/4 vx, 0x1")
        angulusAdsFingerprint.method.addInstruction(1, "return 0x1")
    }

}
