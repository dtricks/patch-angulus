package app.revanced.patches.angulus

import app.revanced.patcher.patch.bytecodePatch
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions

@Suppress("unused")
val examplePatch = bytecodePatch(
    name = "Angulus Ad removal patch",
    description = "This is a patch to remove the Ads from Angulus.",
) {
    compatibleWith("com.drinkplusplus.angulus"("5.0.20"))

    execute {
        angulusAdsFingerprint.method.addInstructions(
            0, 
            """
                const/4 v0, 0x1
                return v0
            """,
            )
    }

}
