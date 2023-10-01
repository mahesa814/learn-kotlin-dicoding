import kotlin.reflect.KProperty

class PropertyDelegation {
    private var value : String = "Default"
    operator  fun getValue(classRef : Any ? ,property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk property ${property.name}")
        return value
    }
    operator fun setValue(classRef: Any?,property : KProperty<*>, newValue : String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name}")
        println("Nilai ${property.name} dari $value akan berubah menjadi $newValue")
        value = newValue
    }
}