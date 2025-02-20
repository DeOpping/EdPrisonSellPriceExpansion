# EdPrisonSellPriceExpansion
EdPrisonSellPriceExpansion is a [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) expansion for [EdPrison](https://builtbybit.com/resources/edprison-core.24738/)!
<br>This expansion contains placeholders to get the sell price of any material!
***
## Download
You may download the latest version of this expansion on the [releases](https://github.com/DeOpping/EdPrisonSellPriceExpansion/releases) page!
## Installation
1. Install [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) <code>(built with version 2.11.6)</code>
2. Install [EdPrison](https://builtbybit.com/resources/edprison-core.24738/) <code>(built with version 5.6-HF-6)</code>
3. View the [releases](https://github.com/DeOpping/EdPrisonSellPriceExpansion/releases) page on this repository to download the latest jar
4. Put the jar you downloaded from [releases](https://github.com/DeOpping/EdPrisonSellPriceExpansion/releases) into the <code>plugins/PlaceholderAPI/expansions</code> folder
5. Reload PlaceholderAPI (or restart your server)
## Dependencies
- [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) <code>2.11.6</code>
- [EdPrison](https://builtbybit.com/resources/edprison-core.24738/) <code>v5.6-HF-6</code>
## Placeholders
This expansion adds two placeholders:
- `%edsellprice_<currency>:<material>%`
<br>Returns the sell price of the material for the specific currency
<br>Example: `%edsellprice_tokens:stone%` returns `5.0`
- `%edsellprice_<currency>:<material>:int%`
<br>Returns the price as an int only if it's a whole number
<br>Example: `%edsellprice_tokens:stone:int%` returns `5`
## License
EdPrisonSellPriceExpansion is licensed under [GNU GPLv3](https://www.gnu.org/licenses/).<br>
View [`LICENSE`](/LICENSE) for more information.
