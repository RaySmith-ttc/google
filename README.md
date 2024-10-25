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
implementation("ru.raysmith:google:2.0.0")
```

- Kotlin with TOML:
```toml
raysmith-google = { module = "ru.raysmith:google", version = "2.0.0" }
```

```kotlin
implementation(libs.raysmith.google)
```

- Groovy:
```groovy
implementation 'ru.raysmith:google:2.0.0'
```

## Usage

### Quick start
Initialize service:
1. Create or select existed project at [Google Cloud Console](https://console.cloud.google.com)
2. Enable API Service (e.g. [Google Sheets API](https://console.cloud.google.com/marketplace/product/google/sheets.googleapis.com))
3. Create Service Accounts [Credentials](https://console.cloud.google.com/apis/credentials)
4. Add JSON key for created service account and download file.
5. Add downloaded `my_secret.json` to resources/path/to/secrets/my_secret.json

[//]: # (// TODO provide samples)
```kotlin
val service = GoogleSheetsService(GoogleSheetsService.service("MyApplication", "path/to/secrets/my_secret.json"))
service.Spreadsheets.Values.get(
    spreadsheetId = "spreadsheetId",
    range = Range("Sheet1"),
    fields = ValueRangeFields.values + ValueRangeFields.majorDimension
).forEach { row ->
    row.forEach { cell ->
        println(cell.asString)
    }
}
```