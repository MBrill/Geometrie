# Geometrie
Unser Standardbeispiel für die Online-Phase der Lehrveranstaltung Software Management Grundlagen im Studiengang IT-Analyst. Wir werden dieses kleine Java-Projekt verwenden, um mit git zu arbeiten, die Quellen zu dokumentieren, mit Logging-Aufrufen zu versehen und mit Jenkins ein Build durchzuführen.

Dies ist die Version mit Logging-Aufrufen mit Log4J. Die jar-Files von log4j2 müssen im classpath des Projekts liegen.

Neben den Veränderungen in den Java-Klassen gibt es insbesondere verschiedene xml-Dateien für die Konfiguration von Log4J2. Diese liegen immer im src-Verzeichnis. Verwendet wird die Datei log4j2.xml. 

- log4j2+Default.xml enthält die Default-Konfiguration.
- log4j2+TRACE.xml enthält eine Konfiguration, die TRACE statt ERROR in der Default-Konfiguration verwendet, wie im Text beschrieben.
- log4j2+LineLogger.xml verwendet eine separate Konfiguration für den Logger in der Klasse Line.
- log4j2+FileAsync verwendet Logging in eine ASCII-Datei
- log4j2+Line+Rectangle verwendet Logging in ASCII-Dateien. Dabei gibt es drei Einträge, für das Hauptprogramm und separat für die beiden Klassen Line und Rectangle. 

In diesem branch gibt es mehrere tags für die Lösung der Aufgaben im Text.

- log4j23.1 enthält die Musterlösung der Aufgabe 3.1 und zeigt den Stand im Text bis einschließlich Kontrollfage 3.3.
- log4j23.2 enthält die Musterlösung der Aufgabe 3.2 mit Logging-Ausgaben in der Klasse Rectangle.
- log4j23.3 verwendet separate Ausgaben in ASCII-Dateien für FirstScene, Line und Rectangle.
