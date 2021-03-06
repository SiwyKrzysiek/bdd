# Behavior Driven Development

Projekt na przedmiot _Testowanie Oprogramowania_.  
Testowanie oprogramowania metodą **BDD**.

## Spis treści 

- [Behavior Driven Development](#behavior-driven-development)
  - [Spis treści](#spis-treści)
  - [Schemat projektu](#schemat-projektu)
    - [1 Opowiadania](#1-opowiadania)
    - [2 Mapowanie opowiadań](#2-mapowanie-opowiadań)
    - [3 Konfiguracja](#3-konfiguracja)
    - [4 Uruchomienie testów](#4-uruchomienie-testów)
    - [5 Generowanie raportu](#5-generowanie-raportu)
  - [Konfiguracja środowiska](#konfiguracja-środowiska)
  - [Materiały](#materiały)

## Schemat projektu

Do wykonania jest 5 etapów BDD.

### 1 Opowiadania

Napisanie opowiadań określających scenariusze testowe.

Opowiadania składają się z 3 części:

- **GIVEN**
- **WHEN**
- **THEN**

### 2 Mapowanie opowiadań

Mapowanie opowiadań na metody przy użyciu _JBehave_.

### 3 Konfiguracja

Napisanie klas odpowiedzialnych za przygotowanie środowiska.  
Klasy jako szkielet koncepcyjny.

Przydatna klasa `JStories`.

### 4 Uruchomienie testów

Wykorzystanie _JUnit_ do wykonania testów opisanych w kroku [1](#1-opowiadania).

### 5 Generowanie raportu

_JBehave_ powinien sam wygenerować nam raport :smile:

---------------------------------------------------------------------------------

## Konfiguracja środowiska

Do tworzenia widoków - pliki .fxml najlepiej użyć programu **Scene Builder**.

Do integracji IntelliJ z Lombok warto zainstalować plugin Lombok i włączyć przetwarzanie adnotacji.

Do pracy z JBehave przyda się plugin do IntelliJ [JBehave Support](https://plugins.jetbrains.com/plugin/7268-jbehave-support/). Koloruje on składnie w historyjkach i pozwala na ich uruchamianie.

---------------------------------------------------------------------------------

## Materiały

- [Opis kroków od JBehave](https://jbehave.org/)