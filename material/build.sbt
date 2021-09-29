
enablePlugins(ScalaJSPlugin)

enablePlugins(ScalaJSBundlerPlugin)

name := "laminar-web-components-material"

version := "0.1.0"

normalizedName := "laminar-web-components-material"

organization := "com.github.zhangzhonglai"

githubOwner := "zhangzhonglai"

githubRepository := "laminar-web-components"

scalaVersion := "2.13.6"

crossScalaVersions := Seq("2.12.14", "2.13.6", "3.0.2")

libraryDependencies += "com.raquo" %%% "laminar" % "0.13.1"

scalaJSUseMainModuleInitializer := true

scalaJSLinkerConfig ~= { _.withSourceMap(false) }

useYarn := true

npmDependencies in Compile += "@material/mwc-button" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-checkbox" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-circular-progress" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-circular-progress-four-color" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-dialog" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-drawer" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-fab" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-formfield" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-icon-button-toggle" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-icon-button" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-icon" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-linear-progress" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-radio" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-slider" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-snackbar" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-switch" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-tab-bar" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-tab" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-list" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-menu" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-textfield" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-textarea" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-select" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-top-app-bar-fixed" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-top-app-bar" -> "0.18.0"
    