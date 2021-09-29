
enablePlugins(ScalaJSPlugin)

enablePlugins(ScalaJSBundlerPlugin)

name := "laminar-components-showcase"

version := "0.1-SNAPSHOT"

normalizedName := "laminar-components-showcase"

organization := "com.github.zhangzhonglai"

scalaVersion := "2.13.6"

crossScalaVersions := Seq("2.12.14", "2.13.6", "3.0.2")

libraryDependencies += "com.raquo" %%% "laminar" % "0.13.1"

resolvers += Resolver.githubPackages("zhangzhonglai")

libraryDependencies += "com.github.zhangzhonglai" %%% "laminar-web-components-material" % "0.1.0"

scalaJSUseMainModuleInitializer := true

scalaJSLinkerConfig ~= { _.withSourceMap(false) }

useYarn := true
