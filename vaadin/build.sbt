
enablePlugins(ScalaJSPlugin)

enablePlugins(ScalaJSBundlerPlugin)

name := "laminar-web-components-vaddin"

version := "0.1.0"

normalizedName := "laminar-web-components-vaddin"

organization := "com.github.zhangzhonglai"

githubOwner := "zhangzhonglai"

githubRepository := "laminar-web-components"

scalaVersion := "2.13.6"

crossScalaVersions := Seq("2.12.14", "2.13.6", "3.0.2")

libraryDependencies += "com.raquo" %%% "laminar" % "0.13.1"

scalaJSUseMainModuleInitializer := true

scalaJSLinkerConfig ~= { _.withSourceMap(false) }

useYarn := true

npmDependencies in Compile += "@vaadin/vaadin-accordion" -> "21.0.2"

npmDependencies in Compile += "@vaadin/vaadin-app-layout" -> "21.0.2"

npmDependencies in Compile += "@vaadin/vaadin-avatar" -> "21.0.2"
    