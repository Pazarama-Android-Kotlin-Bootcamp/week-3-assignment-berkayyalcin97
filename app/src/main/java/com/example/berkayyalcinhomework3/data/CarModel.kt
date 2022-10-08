package com.example.berkayyalcinhomework3.data

import android.os.Parcelable
import com.google.gson.Gson
import kotlinx.parcelize.Parcelize


//İn this Model i created my Data as a mockdata .Than i implemented it as Json to make easy data Transfer between classes and Fragments

@Parcelize
data class CarModel(val id: String,
                    val carName:String,
                    val carBrand:String,
                    val price:String,
                    val description: String

): Parcelable {
    fun toJson(): String {
        return Gson().toJson(this)
    }
    companion object {
        fun fromJson(jsonValue: String): CarModel {
            return Gson().fromJson(jsonValue, CarModel::class.java)
        }
    }
}

val mockCarData = mutableListOf<CarModel>(
    CarModel(id = "1", carName = "Corolla","Toyota","99999", description = "The 2022 Toyota Corolla boasts great fuel economy, pleasant driving dynamics, user-friendly features, and many standard driver assistance features, but its engine performance is restrained, and it has a small trunk."),
    CarModel(id = "2", carName = "c180","Mercedes","250000",description = "The Mercedes-Benz C-Class is a series of compact executive cars produced by Mercedes-Benz Group AG. Introduced in 1993 as a replacement for the 190 (W201) range, the C-Class was the smallest model in the marque's line-up until the W168 A-Class arrived in 1997. The C-Class has been available with a 4MATIC four-wheel drive option since 2002. The third generation (W204) was launched in 2007 while the current W206 generation was launched in 2021."),
    CarModel(id = "3", carName = "c180","Mercedes","250000",description = "The Mercedes-Benz C-Class is a series of compact executive cars produced by Mercedes-Benz Group AG. Introduced in 1993 as a replacement for the 190 (W201) range, the C-Class was the smallest model in the marque's line-up until the W168 A-Class arrived in 1997. The C-Class has been available with a 4MATIC four-wheel drive option since 2002. The third generation (W204) was launched in 2007 while the current W206 generation was launched in 2021."),
    CarModel(id = "4", carName = "Focus","Ford","110000",description = "The Ford Focus is a compact car (C-segment in Europe) manufactured by Ford Motor Company since 1998. It was created under Alexander Trotman's Ford 2000 plan, which aimed to globalize model development and sell one compact vehicle worldwide. The original Focus was primarily designed by Ford of Europe's German and British teams"),
    CarModel(id = "5", carName = "Corolla","Toyota","99999",description = "The 2022 Toyota Corolla boasts great fuel economy, pleasant driving dynamics, user-friendly features, and many standard driver assistance features, but its engine performance is restrained, and it has a small trunk."),
    CarModel(id = "5", carName = "Symbol","Renault","120000",description = "The Renault Symbol, Clio or Thalia in some markets, is a subcompact sedan produced by the French automobile manufacturer Renault.It was introduced in late 1999, under the Clio Symbol name, as the derivative version of the second generation Renault Clio, and unlike the hatchback it was marketed only in those countries where saloons were traditionally preferred over hatchbacks,while it was not sold in Western Europe. It was actually sold in France, but only in overseas departments/regions and collectivities."),
    CarModel(id = "7", carName = "Corolla","Toyota","99999",description = "The 2022 Toyota Corolla boasts great fuel economy, pleasant driving dynamics, user-friendly features, and many standard driver assistance features, but its engine performance is restrained, and it has a small trunk."),
    CarModel(id = "8", carName = "A5","Audi","300000",description = "The Audi A5 is a series of compact executive coupe cars produced by the German automobile manufacturer Audi since June 2007. The A5 range additionally comprises the coupe, cabriolet, and Sportback a five-door liftback with a fastback roofline version of the Audi A4 saloon and estate models."),
    CarModel(id = "8", carName = "Corolla","Toyota","999999",description = "The 2022 Toyota Corolla boasts great fuel economy, pleasant driving dynamics, user-friendly features, and many standard driver assistance features, but its engine performance is restrained, and it has a small trunk."),
    CarModel(id = "10", carName = "A5","Audi","300000",description = "The Audi A5 is a series of compact executive coupe cars produced by the German automobile manufacturer Audi since June 2007. The A5 range additionally comprises the coupe, cabriolet, and Sportback a five-door liftback with a fastback roofline version of the Audi A4 saloon and estate models."),
    CarModel(id = "11", carName = "Vito","Mercedes","180000",description = "The Mercedes-Benz V-Class is a minivan (MPV) produced by Mercedes-Benz. It is available as a standard panel van for cargo (called Vito), or with passenger accommodations substituted for part or all of the load area (called V-Class or Viano).\n" +
            "\n" +
            "The V-Class/Viano is a large MPV. The first generation went on sale in 1996. The second generation was introduced in 2004, and the vehicle received the new Viano name. In 2010, the vehicle was facelifted with revised front and rear bumpers and lights. The interior was also improved with upgraded materials and new technology. The third generation was launched in 2014 and returned to being called V-Class."),
    CarModel(id = "12", carName = "Symbol","Renault","120000",description = "The Renault Symbol, Clio or Thalia in some markets, is a subcompact sedan produced by the French automobile manufacturer Renault.It was introduced in late 1999, under the Clio Symbol name, as the derivative version of the second generation Renault Clio, and unlike the hatchback it was marketed only in those countries where saloons were traditionally preferred over hatchbacks,while it was not sold in Western Europe. It was actually sold in France, but only in overseas departments/regions and collectivities.")

)