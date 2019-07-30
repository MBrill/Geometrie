# Geometrie
Unser Standardbeispiel für die Online-Phase der Lehrveranstaltung Software Management Grundlagen im Studiengang IT-Analyst. Wir werden dieses kleine Java-Projekt verwenden, um mit git zu arbeiten, die Quellen zu dokumentieren, mit Logging-Aufrufen zu versehen und mit Jenkins ein Build durchzuführen.

Dies ist die Version für LogBack. Die jar-Files für SLF4J und LogBack müssen im classpath des Projekts liegen.

Neben den Veränderungen in den Java-Klassen gibt es insbesondere verschiedene xml-Dateien für die Konfiguration von Logback.
Diese liegen immer im src-Verzeichnis. Verwendet wird die Datei logback.xml.

- logback+Default.xml enthält die Default-Konfiguration.
- logback+logger.xml enthält die Konfiguration für den Logger in FirstScene auf INFO und DEBUG für alle weiteren Logger.
- logback+Line.xml enthält eine weitere Konfiguration für einen Logger in der Klasse Line.
- logback+File.xml enthält eine Konfiguration für eine Ausgabe in einer ASCII-Datei.

In diesem branch gibt es es mehrere tags für die Lösung der Aufgaben im Text.

- logback4.1 enthält die Musterlösung der Aufgabe 4.1 und zeigt den Stand im Text bis einschließlich Kontrollfrage 4.4.
- logback4.2 enthält die Musterlösung der Aufgabe 4.2 mit Logging-Ausgaben in der Klasse Rectangle.
- logback4.3 enthält die Musterlösung der Aufgabe 4.3 mit separaten Ausgaben in einer ASCII-Datei in FirstScene, Line und Rectangle.
