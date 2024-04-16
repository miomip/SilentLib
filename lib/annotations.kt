package silentSky.me.lib

import kotlin.annotation.AnnotationTarget.*

@Target(CLASS, FUNCTION)
@SinceSilentLib("1.0")
annotation class SilentLib

@Target(CLASS, FUNCTION, ANNOTATION_CLASS)
@SinceSilentLib("1.0")
@SinceSilentColors("v1.2")
annotation class SilentColors
/**
 * Standard notation for the version when implemented into SilentLib.
 * For anything SilentLib this has to be written, no exceptions!
 * @param version the current version is always stated on the `silentlib.current.properties` file
 * @property version the version in the following formats: `<major>.<minor>` or `<major>.<minor>.<patch>`, where major, minor and patch
 * are non-negative integer numbers without leading zeros.
 * @author Silent Sky
 * */

@Target(CLASS, PROPERTY, FIELD, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPEALIAS, ANNOTATION_CLASS)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@SinceSilentLib("1.0")
annotation class SinceSilentLib(val version: String)


/**
 * Notation for all color related implementations of SilentLib.
 * @property version the version in the following formats: `v<major>.<minor>` or `v<major>.<minor><patch>`, where major, minor and patch
 * are non-negative integer numbers without leading zeros. Example `v1.1` or `v1.11` with a patch
 * @author Silent Sky
 */
@Target(CLASS, PROPERTY, FIELD, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPEALIAS, ANNOTATION_CLASS)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@SinceSilentLib("1.0")
annotation class SinceSilentColors(val version: String)