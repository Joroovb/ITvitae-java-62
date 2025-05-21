# **Oefening: Modelleer een `Car` en een `Engine` class**

## Omschrijving

- Ontwerp twee classes: `Car` en `Engine`. De `Car` heeft een `Engine` als eigenschappen. 
- Zorg ervoor dat alle velden goed geëncapsuleerd zijn (gebruik `private` en maak getters en setters). 
- Implementeer verschillende constructors (overloading) en zorg dat minstens één setter overloaded is.

---

## Class Specificaties

### `Engine` class

Velden (allemaal **private**):

* `int horsepower`
* `String type` (bijv. "Diesel", "Petrol", "Electric")

Vereist:

* Getter en setter voor elk veld
* Minstens twee constructors (zonder argumenten + met parameters)
* Overload de `setHorsepower` methode zodat je:

    * `setHorsepower(int hp)` én
    * `setHorsepower(String hpAsString)` gebruikt, waarbij de string wordt geconverteerd naar int.

---

### `Car` class

Velden (allemaal **private**):

* `String make` (bijv. "Toyota")
* `String model`
* `int year`
* `Engine engine` (dit is een object van de `Engine` class)

Vereist:

* Getter en setter voor elk veld
* Twee constructors:

    * Eén zonder parameters (default)
    * Eén die alle velden in de constructor zet
* In de setter van `Engine`, check of `horsepower` > 50, anders geef een waarschuwing
