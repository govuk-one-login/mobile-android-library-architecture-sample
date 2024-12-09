# Android library architecture sample

This project is a proof-of-concept and sample project demonstrating one way to architect an Android 
library.

The project has two features 'prove your identity' and 'developer settings'.

## Features and considerations

### Dependency injection

- Automatic dependency injection
- Self contained dependency graph
- No requirement to use Hilt in the host app
- Ability to inject objects from the host app

### Public API

- Compose based UI APIs
- Ability to call library functions outside of Compose
- Encapsulation of implementation details

### Navigation
- Self contained navigation
- Feature modules contribute themselves to navigation graph

## Architecture

For details about the architecture, see [ARCHITECTURE.md].

## Usage

### To initialise the library

```kotlin
// The library needs an HTTP client
val authenticatedHttpClient = CustomAuthenticatedHttpClient()

// The application must first initialise an instance of the library
val librarySingleton = Library.createInstance().apply {
    // This instance can be used to access some useful functions
    clearData()
}

@Composable
fun MyComposable() {
    // Initialise the local library state
    val libraryComponent = rememberLibraryComponent(
        librarySingleton = librarySingleton,
        authenticatedHttpClient = authenticatedHttpClient,
    )
}
```

### To include the 'prove your identity' card

```kotlin
@Composable
fun MyComposable() {
    ProveIdentityCard(
        libraryComponent = libraryComponent,
    )
}
```


## Sample

Start at the `:app` module to see an example of how to use the library.


[ARCHITECTURE.md]: ARCHITECTURE.md


