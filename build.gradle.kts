plugins {
    base
}

allprojects {
    group = "de.kramhal.utws"
    version = "1.0"
    repositories {
        jcenter()
    }
}

subprojects {
    apply(plugin = "java-library")

    dependencies {
        "testImplementation"("org.junit.jupiter:junit-jupiter-api:5.3.1")
        "testImplementation"("org.junit.jupiter:junit-jupiter-params:5.0.1")
        "testRuntimeOnly"("org.junit.jupiter:junit-jupiter-engine:5.3.1")
        //"testRuntimeOnly"("org.junit.jupiter:junit-vintage-engine:5.3.1")
    }
}

//testCompileOnly(
//        'junit:junit:4.12'
//)
//testImplementation(
//        'org.junit.jupiter:junit-jupiter-api:5.1.0'
//)
//testRuntimeOnly(
//        'org.junit.jupiter:junit-jupiter-engine:5.1.0',
//        'org.junit.vintage:junit-vintage-engine:5.1.0'
//)

dependencies {
    subprojects.forEach {
        archives(it)
    }
}