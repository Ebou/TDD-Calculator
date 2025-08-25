# TDD Calculator

En simpel lommeregner-klasse bygget med Test-Driven Development

## Beskrivelse

Denne lommeregner er udviklet ved hjælp af TDD-metoderne vi kender fra undervisning, hvor vi skriver test først og skriver koden løbende. Det virker bedst sådan her, da koden bygges op mens vi sørger for de funktioner vi tilføjer fungere som vi vil ha det.


## Funktioner
### Grundlæggende matematik:
- **Addition** (`add`) - Ligger to tal sammen
- **Subtraktion** (`subtract`) - Trækker et tal fra et andet
- **Multiplikation** (`multiply`) - Ganger to tal sammen
- **Division** (`divide`) - Dividerer et tal med et andet

### En masse additions-funktioner:
- **String addition** (`add(String)`) - Ligger komma-separerede tal sammen fra en string
  - Eksempel: `add("1,2,3")` returnerer `6`
  - Håndterer mellemrum og tomme strenge
- **Array addition** (`add(int[])`) - Ligger alle tal i et array sammen
  - Eksempel: `add(new int[]{1,2,3})` returnerer `6`
  - Håndterer tomme arrays og null-værdier

---

![Footer Image](https://i.ibb.co/fVGV87zd/image-2025-08-25-045801806.png)
