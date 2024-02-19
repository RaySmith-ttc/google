# Google
DSL wrappers for java google libs

## Setup
```
repositories {
    mavenCentral()
}
```

- Kotlin DSL:
```kotlin
implementation("ru.raysmith:google:1.1.0")
```

- Kotlin with TOML:
```toml
raysmith-google = { module = "ru.raysmith:google", version = "1.1.0" }
```

```kotlin
implementation(libs.raysmith.google)
```

- Groovy:
```groovy
implementation 'ru.raysmith:google:1.1.0'
```


## Usage
Initialize service:
```kotlin
val service = GoogleSheetsService(GoogleSheetsService.service("MyApplication"))
```