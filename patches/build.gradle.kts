group = "app.revanced"

patches {
    about {
        name = "ReVanced Patches for Angulus"
        description = "Patches for Angulus"
        source = "git@github.com:dtricks/patch-angulus.git"
        author = "ReVanced"
        contact = "contact@revanced.app"
        website = "https://revanced.app"
        license = "GNU General Public License v3.0"
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs = listOf("-Xcontext-receivers")
    }
}
