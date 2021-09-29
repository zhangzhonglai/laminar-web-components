import $file.material
import $file.vaadin
import $file.builder

val organization = "com.github.zhangzhonglai"
val version = "0.1.0"
val publishTo = builder.GitHubRepository("zhangzhonglai", "laminar-web-components")

// material
val materialOutput = os.pwd / "material"

os.write.over(materialOutput / os.RelPath("src/main/scala/material.scala"), new builder.CollectionBuilder(material.componentCollection, organization).build)
os.write.over(materialOutput / "build.sbt", new builder.SBTProjectBuilder(material.componentCollection, organization, version, publishTo).build)

// vaadin
val vaadinOutput = os.pwd / "vaadin"

os.write.over(vaadinOutput / os.RelPath("src/main/scala/vaadin.scala"), new builder.CollectionBuilder(vaadin.componentCollection, organization).build)
os.write.over(vaadinOutput / "build.sbt", new builder.SBTProjectBuilder(vaadin.componentCollection, organization, version, publishTo).build)
