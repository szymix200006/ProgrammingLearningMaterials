CREATE USER 'uzytkownik1'@'localhost' IDENTIFIED BY 'uzytkownik1234';
GRANT ALL PRIVILEGES ON 'baza_danych1'.'tabela1' TO 'uzytkownik1'@'localhost';
REVOKE DROP ON 'baza_danych1'.* FROM 'uzytkownik1'@'localhost';
ALTER TABLE 'table' ADD COLUMN liczba INT CHECK(liczba >= 0 AND liczba <= 255) FIRST / AFTER other_table
CREATE VIEW [pomieszczenie1] AS SELECT ...
UPDATE 'tabela1' SET imie = 'ania' WHERE imie='zosia'
CREATE TABEL tab1 (liczba_naturalna INT(11) UNSIGNED)
SELECT cena, cena/pojemnosc AS cena_jednostkowa FROM farby
CREATE TABLE demo (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(20) UNIQUE
    cena DECIMAL(10,2)
    fk_osoba_uczen INT
    CONSTRAINT innatabvela FOREIGN KEY (fk_osoba_uczen) REFERENCES osoby (nazwisko,imie)
);
SELECT NOW();
ALTER TABLE tabela ADD FOREIGN KEY(id_demo) REFERENCES demo(id);
SELECT ROUND(AVG(pole),2) FROM kwadraty
 Przy tworzeniu tabeli ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 SELECT nazwisko, imie 
 FROM mieszkancy 
 WHERE miasto="Poznań" 
 UNION ALL SELECT nazwisko, imie FROM mieszkancy WHERE miasto="Kraków"
SELECT * WHERE data = CURRENT_DATE();
GRANT SELECT, INSERT, DELETE, UPDATE ON db.* to jan@localhost;
GRANT OPTION ON db.* TO jan@localhost;
GRANT ALTER, DROP, CREATE ON db.* TO jan@localhost;
TIMESTAMP // data i czas
DATE // data
TIME / czas chyba
 //formatowanie daty w php, js, sql