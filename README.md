Björn Scheppler, 9.11.2020

# ERP-Mock (erp-mock)
Dieses Maven-Projekt kann genutzt werden als Startpunkt für eigene auf Spring Boot, JPA und REST beruhende Projekte.

## Grundlegende Nutzung
1. http://localhost:8070 aufrufen
2. Error-Page wird angezeigt, sofern Server erfolgreich gestartet wurde
3. http://localhost:8070/api/ eingeben
4. Einstiegspunkt zu API wird angezeigt

## Fortgeschrittene Nutzung (H2 Console)
1. Um auf die Datenbankverwaltungs-Umgebung zuzugreifen, http://localhost:8070/console eingeben.
2. Anmeldung über:
    1. Benutzername sa
    2. Passwort: leer lassen
    3. URL jdbc:h2:./erpDb