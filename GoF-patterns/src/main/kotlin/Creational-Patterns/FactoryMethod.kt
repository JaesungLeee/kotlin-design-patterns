enum class Country {
    USA, SPAIN, UK, GREECE
}

interface Currency {
    val code: String
}

class Euro(override val code: String = "EUR"): Currency

class USDollar(override val code: String = "USD"): Currency

class CurrencyFactory{

    fun currencyForCountry(country: Country): Currency? {
        return when (country) {
            Country.SPAIN, Country.GREECE -> Euro()
            Country.USA -> USDollar()
            else -> null
        }
    }
}

fun main() {
    val noCurrencyCode = "No Currency Code Available"

    val greeceCode = CurrencyFactory().currencyForCountry(Country.GREECE)?.code ?: noCurrencyCode
    println("Greece currency: $greeceCode")

    val usCode = CurrencyFactory().currencyForCountry(Country.USA)?.code ?: noCurrencyCode
    println("US currency: $usCode")

    val ukCode = CurrencyFactory().currencyForCountry(Country.UK)?.code ?: noCurrencyCode
    println("UK currency: $ukCode")
}